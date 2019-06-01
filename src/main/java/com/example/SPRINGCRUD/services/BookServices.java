package com.example.SPRINGCRUD.services;

import com.example.SPRINGCRUD.model.BookModel;

import java.util.List;

public interface BookServices {
        List<BookModel> getAllBooks();
        BookModel createBook(BookModel bookModel);
        BookModel getBook(long id);
        BookModel getBookByBookTitle(String bookTitle);
	}
