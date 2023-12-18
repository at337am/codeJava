package com.linyz.a01ByteStream.a02FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\linyz\\Downloads\\input.txt");    // abc

        /*
         * Read an array
         * 读取一个数组
         *
         * The length read depends on the array length
         * 读取的长度取决于数组长度
         *
         * and overwrite the read data into the array
         * 并将读取到的数据覆盖到数组中
         *
         * Returns the actual read data length
         * 返回实际读取到的数据长度
         * */

        byte[] bytes = new byte[5];
        int read = fis.read(bytes);
        System.out.println(read);    // 3
        System.out.println(Arrays.toString(bytes));     // [97, 98, 99, 0, 0]

        fis.close();
    }
}
