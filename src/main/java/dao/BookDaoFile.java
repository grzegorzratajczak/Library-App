package dao;

import com.google.gson.reflect.TypeToken;
import lombok.ToString;
import model.Book;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static dao.FileService.saveListToFile;
import static dao.FileService.loadListFromFile;

@ToString
public class BookDaoFile implements DaoInterface {

    public List<Book> bookList = new ArrayList<>();
    String path = "/home/grzex/Pulpit/repogithub/libraryApp/src/main/resources/booklist.json";
    Type targetClassType = new TypeToken<ArrayList<Book>>() {
    }.getType();

    @Override
    public void save(Object entity) {
        bookList.add((Book) entity);
    }

    @Override
    public void update(Object entity) {

    }

    @Override
    public Object findById(UUID id) {
        return null;
    }

    @Override
    public void delete(Object entity) {

    }

    @Override
    public List findAll() {
        return bookList;
    }

    @Override
    public void deleteAll() {
        bookList.clear();
    }

    public void saveBookToFile() {
        saveListToFile(bookList, path);
    }

    public void loadBooksListFromFile() {
        bookList = loadListFromFile(bookList, path, targetClassType);
    }
}

