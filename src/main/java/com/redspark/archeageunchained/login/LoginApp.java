package com.redspark.archeageunchained.login;

import com.redspark.archeageunchained.Main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(loadFXML("login")));
        stage.setTitle("Arche Age Data Tool");
        stage.show();
    }


    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("login/"+fxml + ".fxml"));
        System.out.println("Loading FXML "+fxmlLoader.getLocation().toString());
        return fxmlLoader.load();
    }


}
