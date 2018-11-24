package dao;

import com.google.gson.reflect.TypeToken;
import lombok.ToString;
import model.Author;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static dao.FileService.loadListFromFile;
import static dao.FileService.saveListToFile;

@ToString
public class AuthorDaoFile implements DaoInterface {

    public List<Author> authorList = new ArrayList<>();
    String path = "/home/grzex/Pulpit/repogithub/libraryApp/src/main/resources/authorlist.json";
    Type targetClassType = new TypeToken<ArrayList<Author>>() {
    }.getType();

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

    /**
     * method for save authors[] list to file
     */
    public void saveAuthorsListToFile() {
        saveListToFile(authorList, path);
    }

    /**
     * method for load authors[] list from file
     */
    public void loadAuthorsListFromFile() {
        authorList = loadListFromFile(authorList, path, targetClassType);
    }
}
