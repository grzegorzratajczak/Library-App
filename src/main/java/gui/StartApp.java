package gui;

import dao.AuthorDaoFile;
import dao.BookDaoFile;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartApp extends Application {

    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BookDaoFile bookDaoFile = new BookDaoFile();
        AuthorDaoFile authorDaoFile = new AuthorDaoFile();

//        main app window Start
        FXMLLoader loaderMainWindow = new FXMLLoader(getClass().getResource("/home/grzex/Pulpit/repogithub/libraryApp/src/main/resources/gui/mainAppWindow.fxml"));
        Parent rootMainWindow = loaderMainWindow.load();
        Scene sceneMainWindow = new Scene(rootMainWindow, 235, 218);
        Stage stageMainWindow = new Stage();
        stageMainWindow.setTitle("Library Application");
        stageMainWindow.setScene(sceneMainWindow);
        stageMainWindow.showAndWait();
//        main window wait for for action
    }
}


