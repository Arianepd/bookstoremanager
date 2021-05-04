package com.zrtech.bookstoremanager.repository;

import com.zrtech.bookstoremanager.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface BookRepository extends JpaRepository <Book, Long> {


}
