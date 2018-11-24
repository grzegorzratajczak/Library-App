package dao;

import model.Author;
import model.Book;

import java.util.ArrayList;
import java.util.List;

public class FileDao {

    List<Author> authorList = new ArrayList<>();
    List<Book> bookList = new ArrayList<>();

    static BookDaoFile bookDaoFile = new BookDaoFile();
    static AuthorDaoFile authorDaoFile = new AuthorDaoFile();
}
