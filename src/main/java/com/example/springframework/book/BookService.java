package com.example.springframework.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private List<BookRepository> bookRepositories;

    public void printBookRepository() {
        this.bookRepositories.forEach(System.out::println);
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct called!!");
    }
}
