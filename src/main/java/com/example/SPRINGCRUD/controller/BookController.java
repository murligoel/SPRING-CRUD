package com.example.SPRINGCRUD.controller;

import com.example.SPRINGCRUD.model.BookModel;
import com.example.SPRINGCRUD.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BookController{

    @Autowired
    private BookServices bookServices;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<BookModel> getAllBooks(){
        return bookServices.getAllBooks();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public BookModel getBook(@PathVariable long id){
        return bookServices.getBook(id);
    }

    @RequestMapping(value = "/name/{bookTitle}", method = RequestMethod.GET)
    public BookModel getBookByBookTitle(@PathVariable String bookTitle){
        return bookServices.getBookByBookTitle(bookTitle);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteBook(@PathVariable long id){
        bookServices.deleteBook(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public BookModel createBook(@Valid @RequestBody BookModel bookModel){
        System.out.println(bookModel.toString());
        return bookServices.createBook(bookModel);
    }
}
