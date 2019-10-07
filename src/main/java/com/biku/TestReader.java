package com.biku;

/**
 * Reader class test
 */

public class TestReader {

    public static void main(String[] args) {
        String path = "/home/biku/Pulpit/tekst.txt";
        String s = new FileOpener().OpenFile(path);
        int read = new Reader().read(s);
        System.out.println(read);

    }
}
