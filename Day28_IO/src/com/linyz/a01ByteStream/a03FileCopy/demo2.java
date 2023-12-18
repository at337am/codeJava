package com.linyz.a01ByteStream.a03FileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws IOException {

        /*
         * JDK9 Exception handling
         * JDK9 异常处理
         *
         * Automatically release resources
         * 自动释放资源
         *
         * File Copy
         * 文件拷贝
         *
         * Read an array
         * 读取一个数组
         * */

        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\Users\\linyz\\Downloads\\input.jpg");
        FileOutputStream fos = new FileOutputStream("./Day28_IO/output.jpg");

        try (fis; fos) {
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            throw new IOException(e);
        }

        long end = System.currentTimeMillis();
        System.out.println("Total time spent: " + (end - start));
    }
}
