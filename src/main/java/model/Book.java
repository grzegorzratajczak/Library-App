package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

/**
 * Class for define book
 */
@Getter
@ToString
//@Entity
//@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID idBook;
    //    @Column(name = "bookTitle", nullable = false)
    private String titleBook;
    //    @ManyToMany(cascade = CascadeType.ALL)
//    private Set<Author> authorsBook;
    private Author author;
    /**
     * field to declare is possible to rent if on loan - false
     */
    private boolean possibleToRent;

    /**
     * set false if rented, set true when possible to loan
     *
     * @param possibleToRent
     */
    public void setPossibleToRent(boolean possibleToRent) {
        this.possibleToRent = possibleToRent;
    }

    public Book(String titleBook, Author author) {
        this.titleBook = titleBook;
        this.author = author;
        this.possibleToRent = true;
        this.idBook = UUID.randomUUID();
    }
}
