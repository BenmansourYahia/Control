package com.ecom.controle;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ecom.controle.dao.entities.book;

@SpringBootApplication
public class BookApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);

    }
    @Override
    public void run(String... args) throws Exception {
        book book1 = new book();
        book1.setTitre("Book One");
        book1.setPublisher("Publisher A");
        book1.setPrice(100);

        book book2 = new book();
        book2.setTitre("Book Two");
        book2.setPublisher("Publisher B");
        book2.setPrice(200);

        book book3 = new book();
        book3.setTitre("Book Three");
        book3.setPublisher("Publisher C");
        book3.setPrice(300);

        book book4 = new book();
        book4.setTitre("Book Four");
        book4.setPublisher("Publisher D");
        book4.setPrice(400);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
    }
}
