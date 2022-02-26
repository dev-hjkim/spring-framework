package com.example.springframework.book;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository @Primary
public class MyBookRepository implements BookRepository {
}
