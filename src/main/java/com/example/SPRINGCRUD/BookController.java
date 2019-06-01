package com.example.SPRINGCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController

class BookController{

    @Autowired
    private BookServices bookServices;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<BookModel> getAllBooks(){
        return bookServices.getAllBooks();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public BookModel createBook(@Valid @RequestBody BookModel bookModel){
        System.out.println(bookModel.toString());
        return bookServices.createBook(bookModel);
    }
}
