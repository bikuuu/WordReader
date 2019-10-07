package com.biku;

import java.io.IOException;

public class FileOpenerTest  {

    public static void main(String[] args) throws IOException {
        String path = "/home/biku/Pulpit/tekst.txt";
        String textInsideTxtFile = new FileOpener().OpenFile(path);
        System.out.println(textInsideTxtFile);

    }
}
