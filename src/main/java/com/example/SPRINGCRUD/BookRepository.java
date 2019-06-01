package com.example.SPRINGCRUD;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface BookRepository extends JpaRepository<BookModel, Long> {

}
