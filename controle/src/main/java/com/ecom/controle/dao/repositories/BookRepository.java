package com.ecom.controle.dao.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import java.awt.print.Book;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByPublisherAndPrice(String publisher, double price);
    List<Book> findByTitre(String titre);
    boolean existsByTitreAndPublisher(String titre, String publisher);
}
