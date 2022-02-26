package com.example.springframework.book;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void printBookRepository() {
        System.out.println(bookRepository.getClass());
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct called!!");
    }
}
