package com.biku.reader;

/**
 * Reader class test
 */

public class TestReader {

    public static void main(String[] args) {
        String path = "/home/biku/Pulpit/tekst.txt";
        String s = new FileOpener().OpenFile(path);
        int read = new Reader().Read(s);
        System.out.println(read);
    }
}
