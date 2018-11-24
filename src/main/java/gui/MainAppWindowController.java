package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainAppWindowController {

    @FXML
    private TextField loginText;

    @FXML
    private Button loginButton;


    @FXML
    void loginAction(ActionEvent actionEvent) {
//        userDetails.setNick(logintext.getText());
        Stage stage = (Stage) loginButton.getScene().getWindow();
        stage.close();
//        Settings.userDetails = userDetails;
    }
}
