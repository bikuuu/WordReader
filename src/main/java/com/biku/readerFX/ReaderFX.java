package com.biku.readerFX;

/**
 * Reader framework
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class ReaderFX extends Application{

    Button loadFile;
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Word Reader");                     // Window title

        /**
         * Load path to txt file button ("loadFile")
         * Action -> open tree to chose file txt to load
         */

        loadFile = new Button("Load File");
//        loadFile.setOnAction(e ->
//
//                //TODO: Add load tree to action button loadFile
//
//        );

        /**
         * Layout settings (Window)
         */

        StackPane layout = new StackPane();
        layout.getChildren().add(loadFile);

        /**
         * Scene settings (Background)
         */

        Scene scene = new Scene(layout, 400, 500);
        window.setScene(scene);
        window.show();


    }
}
