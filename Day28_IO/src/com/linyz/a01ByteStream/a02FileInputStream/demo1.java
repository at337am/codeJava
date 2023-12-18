package com.linyz.a01ByteStream.a02FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("./Day28_IO/1.txt");

        /*
         * Read a byte
         * 读取一个字节
         *
         * Returns the decimal number of the ASKII code table
         * 返回返回ASKII码表格的十进制数字
         * */

        int b;
        while ((b = fileInputStream.read()) != -1) {
            System.out.println((char) b);
        }

        fileInputStream.close();
    }
}
