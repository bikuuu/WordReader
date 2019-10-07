package com.biku;

/**
 * Reader framework
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class ReaderFX extends Application {

    Button loadFile;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Word reader form File");

        loadFile = new Button("Load File");


        StackPane layout = new StackPane();
        layout.getChildren().add(loadFile);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
