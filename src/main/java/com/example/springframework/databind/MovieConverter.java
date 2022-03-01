package com.example.springframework.databind;

import org.springframework.core.convert.converter.Converter;

public class MovieConverter {
    public static class StringToMovieConverter implements Converter<String, Movie> {
        @Override
        public Movie convert(String source) {
            return new Movie(Integer.parseInt(source));
        }
    }

    public static class MovieToStringConverter implements Converter<Movie, String> {
        @Override
        public String convert(Movie source) {
            return source.getId().toString();
        }
    }
}
