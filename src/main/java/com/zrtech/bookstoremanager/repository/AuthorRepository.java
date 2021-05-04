package com.zrtech.bookstoremanager.repository;

import com.zrtech.bookstoremanager.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
