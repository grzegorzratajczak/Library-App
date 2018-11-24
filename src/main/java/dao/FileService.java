package dao;

import com.google.gson.Gson;

import java.io.FileWriter;
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

//    static List readListFromFile(Object object, String path) throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        return (List) objectMapper.readValue(path, object.getClass());
//    }
}
