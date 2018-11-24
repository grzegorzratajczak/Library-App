package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

/**
 * class for define author of book
 */
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameAuthor;
    private String surNameAuthor;
    @ManyToMany(mappedBy = "authors", cascade = { CascadeType.ALL })
    private Set<Book> booksAuthorSet;

    public Author() {
    }
}
