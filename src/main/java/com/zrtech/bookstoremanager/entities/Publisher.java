package com.zrtech.bookstoremanager.entities;

import lombok.Builder;
import lombok.Data;
import sun.util.calendar.BaseCalendar;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
public class Publisher {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column(nullable = false, unique = true)
        private String name;

        @Column(nullable = false, unique = true, length = 100)
        private String code;

        @Column(nullable = false, columnDefinition = "TIMESTAMP")
        private LocalDate foundationDate;

        @OneToMany (mappedBy = "publisher", cascade = {CascadeType.MERGE})
        private List<Book> books;
}


