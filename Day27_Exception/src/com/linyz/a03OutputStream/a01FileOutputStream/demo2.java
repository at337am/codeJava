package com.linyz.a03OutputStream.a01FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class demo2 {
    public static void main(String[] args) throws IOException {

        // write string

        FileOutputStream fileOutputStream = new FileOutputStream("./Day27_Exception/1.txt");

        String str = "aaa\n666";

        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        fileOutputStream.write(bytes);

        fileOutputStream.close();
    }
}
