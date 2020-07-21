package com.example.Interceptor;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class USLocalDateFormatter implements Formatter<String> {

    public static String getPattern(Locale locale) {
        return "----->getPattern";
    }

    @Override
    public String parse(String s, Locale locale) throws ParseException {
        return "parse";
    }

    @Override
    public String print(String s, Locale locale) {
        return "print";
    }
}
