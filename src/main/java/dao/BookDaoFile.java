package dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.ToString;
import model.Book;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static dao.FileService.saveListToFile;

//import static dao.FileService.readListFromFile;

@ToString
public class BookDaoFile implements DaoInterface {

    List<Book> bookList = new ArrayList<>();
    String path = "/home/grzex/Pulpit/repogithub/libraryApp/src/main/resources/booklist.json";
    String pathBook = "/home/grzex/Pulpit/repogithub/libraryApp/src/main/resources/book.json";

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

    public void loadBooksListFromFile(){
        Gson gson = new Gson();
        Type targetClassType = new TypeToken<ArrayList<Book>>() { }.getType();
        try {
            bookList = gson.fromJson(new FileReader(path),targetClassType);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

