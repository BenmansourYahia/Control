package com.ecom.controle.service;

import com.ecom.controle.dao.entities.book;
import org.hibernate.annotations.SecondaryRow;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.Date;
import java.util.List;
@Service
public class BookManager implements BookService {

    @Override
    public Book add(book book) {
        return null;
    }

    @Override
    public Book findById(Long id) {
        return null;
    }

    @Override
    public Book save(book book) {
        return null;
    }

    @Override
    public Book update(book book) {
        return null;
    }

    @Override
    public Book delete(Long id) {
        return null;
    }

    @Override
    public List<Book> findAll() {
        return List.of();
    }

    @Override
    public List<Book> findbyPublisher(String publisher) {
        return List.of();
    }

    @Override
    public List<Book> findbyPrice(Integer price) {
        return List.of();
    }

    @Override
    public List<Book> findbyTitle(String titre) {
        return List.of();
    }

    @Override
    public List<Book> findbyDate(Date DatePublication) {
        return List.of();
    }

    @Override
    public List<Book> findbyResume(String resume) {
        return List.of();
    }

    @Override
    public List<Book> findby(String title) {
        return List.of();
    }

    @Override
    public book findbyId(Long id) {
        return null;
    }

    @Override
    public List getAllBooks() {
        return List.of();
    }
}
