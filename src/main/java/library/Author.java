package library;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * class for define author of book
 */
@AllArgsConstructor
@Getter
@ToString
public class Author {

    private String nameAuthor;
    private String surNameAuthor;

}
