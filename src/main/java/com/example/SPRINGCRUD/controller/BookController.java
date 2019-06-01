package com.example.SPRINGCRUD.controller;

import com.example.SPRINGCRUD.model.BookModel;
import com.example.SPRINGCRUD.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/books")
public class BookController {

    private BookServices bookServices;

    @Autowired
    public BookController(BookServices bookServices) {
        this.bookServices = bookServices;
    }

    @RequestMapping(value = {"","/"},method = RequestMethod.GET)
    public ModelAndView getAllBook(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("books");
        modelAndView.addObject("books",bookServices.getAllBooks());
        return modelAndView;
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView createBookGet(String msg) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("book_form");
        modelAndView.addObject("book", new BookModel());
        modelAndView.addObject("msg", msg);
        return modelAndView;
    }
}
