package com.example.SPRINGCRUD;

import java.util.List;

interface BookServices {
        List<BookModel> getAllBooks();
        BookModel createBook(BookModel bookModel);
	}
