package com.linyz.a02CharStream.a02FileReader;

import java.io.FileReader;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("./Day28_IO/1.txt");
        char[] chars = new char[10];
        int len;
        while ((len = fileReader.read(chars)) != -1){
            System.out.print(new String(chars, 0, len));   // !!! print
        }

        fileReader.close();
    }
}
