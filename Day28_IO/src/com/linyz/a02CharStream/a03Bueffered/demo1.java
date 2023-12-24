package com.linyz.a02CharStream.a03Bueffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\linyz\\Downloads\\1.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}

