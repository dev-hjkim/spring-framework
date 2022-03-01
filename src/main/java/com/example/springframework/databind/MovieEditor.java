package com.example.springframework.databind;

import java.beans.PropertyEditorSupport;

public class MovieEditor extends PropertyEditorSupport {
    @Override
    public String getAsText() {
        Movie movie = (Movie) getValue();
        return movie.getId().toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new Movie(Integer.parseInt(text)));

    }
}
