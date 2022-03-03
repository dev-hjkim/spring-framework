package com.example.springframework.databind;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class MovieFormatter implements Formatter<Movie> {
    @Override
    public Movie parse(String text, Locale locale) throws ParseException {
        return new Movie(Integer.parseInt(text));
    }

    @Override
    public String print(Movie object, Locale locale) {
        return object.getId().toString();
    }
}
