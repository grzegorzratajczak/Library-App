package library;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Class for define book
 */
@Getter
@AllArgsConstructor
@ToString
public class Book {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBook;
    private String titleBook;
    private Author authorBook;
    private String editionBook;
    /**
     * field to declare is possible to rent if on loan - false
     */
    private boolean possibleToRent;

    public void setPossibleToRent(boolean possibleToRent) {
        this.possibleToRent = possibleToRent;
    }
}
