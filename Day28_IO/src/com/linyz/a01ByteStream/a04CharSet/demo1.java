package com.linyz.a01ByteStream.a04CharSet;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        // 1. encode 编码
        String str1 = "笑死我了";
        byte[] bytes1 = str1.getBytes();    // default  Unicode UTF-8 一个汉字三个字节
        System.out.println(Arrays.toString(bytes1));

        String str2 = "为什么啊";
        byte[] bytes2 = str2.getBytes("GBK");   // specify  GBK 一个汉字两个字节
        System.out.println(Arrays.toString(bytes2));

        // 2. decode 解码
        String str3 = new String(bytes1);
        System.out.println(str3);

        String str4 = new String(bytes2,"GBK");
        System.out.println(str4);
    }
}
