package com.zrtech.bookstoremanager.repository;

import com.zrtech.bookstoremanager.entities.Author;
import com.zrtech.bookstoremanager.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {

}
