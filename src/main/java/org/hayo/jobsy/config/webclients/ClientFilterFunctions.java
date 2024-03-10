package org.hayo.jobsy.config.webclients;

import lombok.extern.slf4j.Slf4j;
import org.hayo.jobsy.models.exceptions.ApiConnectionError;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import reactor.core.publisher.Mono;

@Slf4j
public class ClientFilterFunctions {

    public static HttpStatus getHttpStatusFromCode(HttpStatusCode code) {
        if (code == null) return HttpStatus.INTERNAL_SERVER_ERROR;

        return HttpStatus.resolve(code.value());
    }


    public static ExchangeFilterFunction logError() {
        return ExchangeFilterFunction.ofResponseProcessor(clientResponse -> {
            log.error(String.valueOf(clientResponse.headers().contentType()));
            if (clientResponse.statusCode().is4xxClientError()) {
//                if (clientResponse.headers().contentType().isPresent() && clientResponse.headers().contentType().get().includes(MediaType.APPLICATION_JSON)) {
//                    return clientResponse.bodyToMono(ApiErrorSchema.class)
//                            .map(s -> new ApiConnectionError(
//                                    "Error received from server: " + s,
//                                    getHttpStatusFromCode(clientResponse.statusCode()),
//                                    s
//                            ))
//                            .flatMap(Mono::error);
//                } else {
                return clientResponse.bodyToMono(String.class)
                        .map(s -> new ApiConnectionError(
                                "Error received from from API",
                                getHttpStatusFromCode(clientResponse.statusCode()),
                                s
                        ))
                        .flatMap(Mono::error);
//                }
            } else if (clientResponse.statusCode().is5xxServerError()) {
                return clientResponse.bodyToMono(String.class)
                        .map(s -> new ApiConnectionError(
                                "Error while making request: ",
                                getHttpStatusFromCode(clientResponse.statusCode()), s
                        ))
                        .flatMap(Mono::error);
            } else {
                try {
                    return Mono.just(clientResponse);
                } catch (Exception e) {
                    return clientResponse.bodyToMono(String.class)
                            .map(s -> new ApiConnectionError(
                                    "Error while decoding response body: " + s,
                                    getHttpStatusFromCode(clientResponse.statusCode()), s)
                            )
                            .flatMap(Mono::error);
                }
            }
        });
    }

    public static ExchangeFilterFunction logRequest() {
        return ExchangeFilterFunction.ofRequestProcessor(clientRequest -> {
            log.info("Request: " + clientRequest.method() + " " + clientRequest.url());
            clientRequest.headers().forEach((name, values) -> values.forEach(value -> log.info(name + ":" + value)));
            return Mono.just(clientRequest);
        });
    }

    public static ExchangeFilterFunction logResponse() {
        return ExchangeFilterFunction.ofResponseProcessor(clientResponse -> {
            log.info("Response: " + clientResponse.statusCode());
            return Mono.just(clientResponse);
        });
    }
}
