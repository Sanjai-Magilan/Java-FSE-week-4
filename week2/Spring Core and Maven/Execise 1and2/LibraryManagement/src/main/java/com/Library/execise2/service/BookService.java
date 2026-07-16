package com.Library.execise2.service;
import com.Library.execise2.repository.BookRepository;

public class BookService {
    private BookRepository repository;

    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public void show() {
        System.out.println("Book Service Created");
        repository.display();
    }
}
