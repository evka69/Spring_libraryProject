package com.aptproject.Spring_LibraryProject.dbexample.model;

import lombok.*;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Book {
    private Integer id;
    private String title;
    private String author;
    private Date dateAdded;
}
