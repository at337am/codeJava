package com.linyz.a02CharStream.a01FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {

        /*
         * flase(default): cover
         * true: continue writing
         * */
        FileWriter fileWriter = new FileWriter("./Day28_IO/1.txt", true);

        // String
        fileWriter.write("测试一下");

        // char[]
        char[] chars = {'天', '气', '真', '好'};
        fileWriter.write(chars);
        fileWriter.close();

    }
}
