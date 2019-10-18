package com.biku.readerFX;

import javafx.scene.control.Alert;

public class Alerts {

    public static void notValidFile(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("File is not valid");
        alert.show();
    }

    public static void invalidFilePath(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("File path is invalid");
        alert.show();
    }

    public static void invalidFormatFile(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Format file is invalid");
        alert.show();
    }

    public static void emptyFile(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("The file is empty or not contain 'a-z' characters");
        alert.show();
    }
}
