package sample.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField SingUpSurName;

    @FXML
    private Button AuthSignInButton;

    @FXML
    private TextField SingUpName;

    @FXML
    private PasswordField SingUpPassword;

    @FXML
    private TextField SingUpMiddleName;

    @FXML
    private DatePicker SingUpBirthday;

    @FXML
    private ImageView SingUpAddPhotoButton;

    @FXML
    private TextField SingUpPosition;

    @FXML
    private CheckBox SingUpChekBoxMan;

    @FXML
    private CheckBox SingUpChekBoxWomen;

    @FXML
    private TextField SingUpLogin;

    @FXML
    private Button LognSignInButton;

    @FXML
    void initialize() {

    }
}
