package com.librapp.libraryapplication.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "BOOK", schema = "libprod")
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long book_id;

    @Column(name = "title", length = 200, nullable = false)
    private String title;
    @Column(name= "author", length = 400, nullable = false)
    private String author;

    @Column(name = "release_date", nullable = false)
    private LocalDate releaseDate;

}
