package controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TextField;

import model.UserDB;
import view.SignUpJavaFXView;

import java.awt.*;
import java.io.IOException;

/**
 * Created by Koi on 7/4/2016.
 */
public class LoginController {
    @FXML
    TextField uName;
    @FXML
    PasswordField pW;


    public void authenticate() throws Exception{

        for(int i = 0; i < UserDB.getUsers().size(); i++){
            if(uName.getText().equals(UserDB.getUsers().get(i).getUsername())&& pW.getText().equals(UserDB.getUsers().get(i).getPassword())){

                System.out.println("Sign In Successful \n" + "Welcome " +uName.getText());
                }
            }
    }

    public void openSignUpView() throws IOException{
        System.out.println("Sign Up View Opened");
        new SignUpJavaFXView();
    }

}
