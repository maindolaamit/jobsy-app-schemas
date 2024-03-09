package org.hayo.jobsy.utils;


import java.util.regex.Pattern;

public class ValidationUtils {

    public static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
    public static final Pattern URL_PATTERN = Pattern.compile("^(http|https)://.*$");
    public static final int MIN_CHARS = 5;

    public static boolean isValidEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

    public static boolean isValidUrl(String url) {
        return URL_PATTERN.matcher(url).matches();
    }

    public static boolean hasMinChars(String str) {
        return str != null && str.length() >= MIN_CHARS;
    }
}