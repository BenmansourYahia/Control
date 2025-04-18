package com.ecom.controle.service;

import com.ecom.controle.dao.entities.book;
import java.awt.print.Book;
import java.util.Date;
import java.util.List;

public interface BookService  {
        Book add(book book);
        Book findById(Long id);
        Book save(book book);
        Book update(book book);
        Book delete(Long id);
    List<Book> findAll();
    List<Book> findbyPublisher(String publisher);
    List<Book> findbyPrice(Integer price);
    List<Book> findbyTitle(String titre);
    List<Book> findbyDate(Date DatePublication);
    List<Book> findbyResume(String resume);
    List<Book> findby(String title);
    book findbyId(Long id);
    List<Book> getAllBooks();

}
