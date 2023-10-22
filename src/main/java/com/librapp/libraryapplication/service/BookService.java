package com.librapp.libraryapplication.service;

import com.librapp.libraryapplication.model.Book;
import com.librapp.libraryapplication.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

}
