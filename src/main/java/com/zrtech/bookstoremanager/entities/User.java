package com.zrtech.bookstoremanager.entities;


import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@Entity

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer age;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private Gender gender;

    @Column(nullable = false, unique = false, length = 100)
    private String email;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable=false)
    private String password;

    @Column (nullable = false,columnDefinition ="TIMESTAMP")
    private LocalDate birthdate;

    @Column (nullable = false)
    private String role;

    @OneToMany (mappedBy = "user", cascade = {CascadeType.MERGE})
    private List<Book> books;

}

