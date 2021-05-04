package com.zrtech.bookstoremanager.entities;


import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Data
@Builder
@Entity

public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Column (nullable = false, unique = true)
    private String name;

    @Column(columnDefinition = "integer default 0")
    private Integer age;
}
