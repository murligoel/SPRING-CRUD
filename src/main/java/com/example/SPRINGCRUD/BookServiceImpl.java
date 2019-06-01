package com.example.SPRINGCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServices")
class BookServiceImpl implements BookServices {

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
}
