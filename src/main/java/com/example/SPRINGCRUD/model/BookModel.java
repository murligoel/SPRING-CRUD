package com.example.SPRINGCRUD.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@NoArgsConstructor
public class BookModel{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty
    private String bookTitle;

    @NotEmpty
    private String bookAuthor;

    @NotEmpty
    private String bookCost;

}
