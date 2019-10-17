package com.biku.reader;
/**
 * Class to implement method to open file with words
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FileOpener {

    public static String OpenFile(String filePath){
        String textFromFile = null;
        File openFile = new File(filePath);
        try {
            Scanner scanner = new Scanner(openFile);
            try {
                textFromFile = scanner.nextLine();
            } finally {
                scanner.close();
            }
        } catch (IOException e){
            /*
             TODO: Create exeption method
            */
        }
        return textFromFile;
    }

}
