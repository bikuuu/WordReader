package com.biku.reader;
/**
 * Class to implement method to open file with words
 */

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FileOpener {

    public static String OpenFile(String filePath) {
        String textFromFile = "";
        File openFile = new File(filePath);
        try (Scanner scanner = new Scanner(openFile)) {
            if(scanner.hasNext()) {
                textFromFile = scanner.nextLine();
            }
        } catch (IOException e) {
            com.biku.readerFX.Alerts.invalidFormatFile();
        }
        System.out.println(textFromFile);
        return textFromFile;
    }
}