package com.linyz.a04InputStream.a01FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("./Day27_Exception/1.txt");
        // Read a byte
        int read1 = fileInputStream.read();
        System.out.println(read1);

        int read2 = fileInputStream.read();
        System.out.println(read2);

        int read3 = fileInputStream.read();
        System.out.println((char) read3);

        int read4 = fileInputStream.read();
        System.out.println(read4);

        int read5 = fileInputStream.read();
        System.out.println(read5);

        int read6 = fileInputStream.read();
        System.out.println(read6);

        int read7 = fileInputStream.read();
        System.out.println(read7);

        int read8 = fileInputStream.read();
        System.out.println(read8);

        fileInputStream.close();
    }
}
