package dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.ToString;
import model.Author;
import model.Book;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static dao.FileService.saveListToFile;


@ToString
public class AuthorDaoFile implements DaoInterface {

    List<Author> authorList = new ArrayList<>();
    String path = "/home/grzex/Pulpit/repogithub/libraryApp/src/main/resources/authorlist.json";


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

    public void saveAuthorToFile() {
        saveListToFile(authorList, path);
    }

    public void loadAuthorsListFromFile(){
        Gson gson = new Gson();
        Type targetClassType = new TypeToken<ArrayList<Author>>() { }.getType();
        try {
            authorList = gson.fromJson(new FileReader(path),targetClassType);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
