package dao;

import com.google.gson.Gson;
import model.Author;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AuthorDaoFile implements DaoInterface {

    List<Author> authorList = new ArrayList<>();
FileWriter fileWriter;

    {
        try {
            fileWriter = new FileWriter("/home/grzex/Pulpit/repogithub/libraryApp/src/main/resources/authorlist.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(Object entity) {
        authorList.add((Author) entity);
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
        return null;
    }

    @Override
    public void deleteAll() {

    }

    public void saveAuthorToFile(){
        Gson gson = new Gson();
        gson.toJson(authorList, fileWriter);
        try {
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
