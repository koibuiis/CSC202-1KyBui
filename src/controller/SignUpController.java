package controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import model.User;
import model.UserDB;
import model.UserIO;
import view.LoginJavaFXView;
import view.SignUpJavaFXView;

import java.io.File;
import java.io.IOException;

/**
 * Created by Koi on 7/4/2016.
 */
public class SignUpController {
    @FXML
    TextField uName;
    @FXML
    PasswordField pW, confirmpW;
    @FXML
    TextField eMail, firstName, lastName, SSN, GEN, phone;
    @FXML
    DatePicker DOB;
    @FXML
    Button photo;

    String photoLocation;


    public void createAccount() {
        if (pW.getText().equals(confirmpW.getText())) {
            User user = new User(uName.getText(), pW.getText());
            UserDB.getUsers().add(user);

            try {
                UserIO.writeUsers(UserDB.getUsers());
            } catch (IOException e) {
                System.err.println("Unable to write to UserDB to file");
                e.printStackTrace();
            }

            System.out.println(UserDB.getUsers());
        }
    }

    public void validateThis() throws Exception {

    }



   public final void createFileChooser(){

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File/Document");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image File", "*.png", "*.jpg", "*gif"));

        File userFile = fileChooser.showOpenDialog(photo.getScene().getWindow());
            if(userFile != null){
                this.photoLocation = userFile.getAbsolutePath();

            }
       //


    }
}


