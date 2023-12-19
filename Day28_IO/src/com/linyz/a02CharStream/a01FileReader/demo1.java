package com.linyz.a02CharStream.a01FileReader;

import java.io.FileReader;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("./Day28_IO/1.txt");
        int ch;
        while ((ch = fileReader.read()) != -1 ){
            System.out.println((char) ch);
        }

        fileReader.close();
    }
}
