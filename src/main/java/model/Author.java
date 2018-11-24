package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

/**
 * class for define author of book
 */
@Getter
@Setter
@ToString
//@Entity
//@Table(name = "author")
public class Author {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID idAuthor;
    private String nameAuthor;
    private String surNameAuthor;
//    @ManyToMany(mappedBy = "authors", cascade = { CascadeType.ALL })
//    private Set<Book> booksAuthorSet;


    public Author(String nameAuthor, String surNameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surNameAuthor = surNameAuthor;
        this.idAuthor = UUID.randomUUID();
    }
}
