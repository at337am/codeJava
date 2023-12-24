package com.linyz.a03Test.a02Encrypt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        File src = new File("C:\\Users\\linyz\\Pictures\\1.txt");
        File dest = new File("C:\\Users\\linyz\\Downloads\\2.txt");
        encrypt(src, dest);
        File dest2 = new File("C:\\Users\\linyz\\Downloads\\3.txt");
        encrypt(dest, dest2);
    }

    public static void encrypt(File src, File dest) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(src);
        FileOutputStream fileOutputStream = new FileOutputStream(dest);

        int len;

        while ((len = fileInputStream.read()) != -1) {
            fileOutputStream.write(len ^ 10);
        }

        fileOutputStream.close();
        fileInputStream.close();
    }
}
