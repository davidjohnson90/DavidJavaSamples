package com.david.java.string;

public class StringFileRename {
    public static void main(String[] args) {
        String filename = "testsfile.txt";
        String firstFiveCharacters = filename.substring(0, 5);
        int dotIndex = filename.lastIndexOf(".");
        String extension = filename.substring(dotIndex);
        String newFilename = firstFiveCharacters + extension;
        System.out.println(newFilename);
    }
}
