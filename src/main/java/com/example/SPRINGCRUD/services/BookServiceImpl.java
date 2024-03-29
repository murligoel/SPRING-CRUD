package com.example.SPRINGCRUD.services;

import com.example.SPRINGCRUD.model.BookModel;
import com.example.SPRINGCRUD.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServices")
public class BookServiceImpl implements BookServices {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<BookModel> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public BookModel createBook(BookModel bookModel) {
        return bookRepository.save(bookModel);
    }

    @Override
    public BookModel getBook(long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public BookModel getBookByBookTitle(String bookTitle){
        return bookRepository.findByBookTitle(bookTitle).orElse(null);
    }

    @Override
    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }
}
