package dao;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.List;

public class FileService {

    static void saveListToFile(List list, String path) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            Gson gson = new Gson();
            gson.toJson(list, fileWriter);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static List loadListFromFile(List list, String path, Type type) {
        Gson gson = new Gson();
        try {
            list = gson.fromJson(new FileReader(path), type);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}

