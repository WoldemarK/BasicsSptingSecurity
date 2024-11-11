package com.example.basicssptingsecurity.model.book;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository repository;

    public void save(BookRequest request) {
        Book book = new Book();
        book.setId(request.id());
        book.setAuthor(request.author());
        book.setIsbn(request.isbn());
        repository.save(book);
    }

    public List<Book> findAll() {
        return repository.findAll();
    }
}
