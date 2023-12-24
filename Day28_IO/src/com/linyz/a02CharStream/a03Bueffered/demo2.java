package com.linyz.a02CharStream.a03Bueffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\linyz\\Downloads\\2.txt", true));

        // true 开启续写
        bw.write("哈哈啊啊哈哈笑死我了");
        bw.newLine();
        bw.write("以后我结婚了, 你一定要来噢, 没有新娘我会很尴尬");
        bw.newLine();

        bw.close();
    }
}
