package com.zrtech.bookstoremanager.repository;

import com.zrtech.bookstoremanager.entities.Author;
import com.zrtech.bookstoremanager.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
