package com.linyz.a01ByteStream.a01FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {

        /*
         * void write(int b)         // Write a byte of data
         * void write(byte[] b)      // Write a byte array data
         *
         * */

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\linyz\\Downloads\\1.txt");
        fileOutputStream.write(97);

        byte[] b = {98, 99};
        fileOutputStream.write(b);
        fileOutputStream.close();
    }
}
