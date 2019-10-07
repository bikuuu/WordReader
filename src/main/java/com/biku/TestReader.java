package com.biku;
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;
public class TestReader {

    public static void main(String[] args) {
        String path = "/home/biku/Pulpit/tekst.txt";
        String s = new FileOpener().OpenFile(path);
        int read = new Reader().read(s);
        System.out.println(read);

    }
}
