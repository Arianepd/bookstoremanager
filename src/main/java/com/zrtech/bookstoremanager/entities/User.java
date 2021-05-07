package com.zrtech.bookstoremanager.entities;

import com.zrtech.bookstoremanager.entities.Book;
import com.zrtech.bookstoremanager.entities.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false , length = 20)
    private Gender gender;

    @Column(nullable = false , unique = true , length = 100)
    public String email;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDate birthDate;

    @Column(nullable = false)
    private String role;

    @OneToMany(mappedBy = "user" , cascade = {CascadeType.MERGE})
    private List<Book> books;

    @Embedded
    private Audit audit = new Audit();
}
