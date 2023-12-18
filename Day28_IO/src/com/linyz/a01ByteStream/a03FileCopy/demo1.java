package com.linyz.a01ByteStream.a03FileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {

        /*
         * File Copy
         * 文件拷贝
         *
         * Read a byte
         * 读取一个字节
         * */

        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("C:\\Users\\linyz\\Downloads\\input.jpg");
        FileOutputStream fos = new FileOutputStream("./Day28_IO/output.jpg");

        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        fos.close();
        fis.close();

        long end = System.currentTimeMillis();

        System.out.println("Total time spent: " + (end - start));
    }
}
