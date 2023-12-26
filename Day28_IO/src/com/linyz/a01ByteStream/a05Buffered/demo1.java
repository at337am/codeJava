package com.linyz.a01ByteStream.a05Buffered;

import java.io.*;

public class demo1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\linyz\\Downloads\\1.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\linyz\\Downloads\\2.txt"));
        int len;
        while ((len = bis.read()) != -1) {
            bos.write((char) len);
        }

        bos.close();
        bis.close();
    }
}
