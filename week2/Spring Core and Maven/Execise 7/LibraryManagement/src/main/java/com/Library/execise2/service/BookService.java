package com.Library.execise2.service;
import com.Library.execise2.repository.BookRepository;

public class BookService {
    private BookRepository repository;
    private String libraryName;
    public BookService(String libraryName) {
        this.libraryName = libraryName;
    }
    public void setRepository(BookRepository repository) {

        this.repository = repository;

    }

    public void show() {
        System.out.println("Book Service Created");
        repository.display();
    }
}
