package com.example.SPRINGCRUD.repository;

import com.example.SPRINGCRUD.model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<BookModel, Long> {
    Optional<BookModel> findByBookTitle(String bookTitle);
}
