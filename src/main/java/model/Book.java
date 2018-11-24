package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

/**
 * Class for define book
 */
@Getter
@AllArgsConstructor
@ToString
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBook;
    @Column(name = "bookTitle", nullable = false)
    private String titleBook;
    private Author authorBook;
    /**
     * field to declare is possible to rent if on loan - false
     */
    private boolean possibleToRent;

    public Book() {
    }

    /**
     * set false if rented, set true when possible to loan
     * @param possibleToRent
     */
    public void setPossibleToRent(boolean possibleToRent) {
        this.possibleToRent = possibleToRent;
    }
}
