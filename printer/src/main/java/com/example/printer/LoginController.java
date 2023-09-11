package com.example.printer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    private ImageView logoImage;

    @FXML
    private Button closeButton;

    @FXML
    private Label validateLabel;

    @FXML
    void onCloseButtonClick() {
        System.exit(0);
    }

    @FXML
    void onLoginButtonClick(ActionEvent event) throws IOException {
        if (!(usernameField.getText().isBlank() || passwordField.getText().isBlank())) {
            var loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            AnchorPane root = loader.load();
            Scene scene = new Scene(root, 600, 400);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } else {
            validateLabel.setText("Enter both fields");
            System.out.println(passwordField.getText() + "   " + usernameField.getText());
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image image = new Image(getClass().getResourceAsStream("/sc.png"));
        logoImage.setImage(image);
    }
}
