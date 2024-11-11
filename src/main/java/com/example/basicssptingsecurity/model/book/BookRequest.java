package com.example.basicssptingsecurity.model.book;



public record BookRequest
        (
                Integer id,
                String author,
                String isbn
        ) {

}
