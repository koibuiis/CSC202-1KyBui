package view;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;
import model.User;
import model.UserDB;
import model.UserIO;

import java.io.IOException;
import java.util.ArrayList;


public class LoginJavaFXView extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        loadUserDB();
        Parent root = FXMLLoader.load(getClass().getResource("LoginJavaFX.fxml"));
        primaryStage.setTitle("Login Page");
        primaryStage.setScene(new Scene(root, 300, 300));
        primaryStage.show();
        System.out.println("Login Page Opened");
    }
    public void loadUserDB(){
        try{
            UserDB.setUsers((ArrayList<User>) UserIO.readUsers());
        }
        catch (IOException x){
            System.err.print("Failed to open/read UserDB file");
        }
        catch(ClassNotFoundException x){
            System.err.print("Failed reading and casting the UserDB due to User Class issue");
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
