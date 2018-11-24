package dao;

import com.google.gson.Gson;
import model.Book;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookDaoFile implements DaoInterface {

    List<Book> bookList = new ArrayList<>();
    FileWriter fileWriter;

    {
        try {
            fileWriter = new FileWriter("/home/grzex/Pulpit/repogithub/libraryApp/src/main/resources/booklist.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
        Gson gson = new Gson();
        gson.toJson(bookList, fileWriter);
        try {
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

