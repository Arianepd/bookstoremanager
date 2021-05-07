package com.zrtech.bookstoremanager.entities;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private String isbn;

    @Column(columnDefinition = "integer default 0")
    private int pages;

    @Column(columnDefinition = "integer default 0")
    private int chapters;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE})
    private Author author;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE})
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE})
    private Publisher publisher;

    @Embedded
    private Audit audit = new Audit();
}
