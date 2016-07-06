package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class SignUpJavaFXView{

    public SignUpJavaFXView() throws IOException{
        Stage signupStage = new Stage();
        Parent signupView = FXMLLoader.load(getClass().getResource("SignUpJavaFX.fxml"));
        signupStage.setTitle("Sign Up Page");
        signupStage.setScene(new Scene(signupView, 700, 550));
        signupStage.show();


    }
}
