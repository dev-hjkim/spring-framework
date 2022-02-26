package com.example.springframework.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BookService {
    @Autowired
    @Qualifier("myBookRepository")
    private BookRepository bookRepository;

    public void printBookRepository() {
        System.out.println(bookRepository.getClass());
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct called!!");
    }
}
