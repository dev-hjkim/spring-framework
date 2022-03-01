package com.example.springframework.databind;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @GetMapping("/movie/{movie}")
    public String getMovie(@PathVariable Movie movie) {
        System.out.println(movie);
        return movie.getId().toString();
    }
}
