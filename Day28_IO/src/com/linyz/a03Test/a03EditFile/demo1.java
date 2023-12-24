package com.linyz.a03Test.a03EditFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
    public static void main(String[] args) throws IOException {
        File src = new File("C:\\Users\\linyz\\Downloads\\1.txt");
        editFile(src);
    }

    public static void editFile(File src) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(src);
        ArrayList<Integer> integers = new ArrayList<>();
        int len;
        while ((len = fileInputStream.read()) != -1) {
            char num = (char) len;
            String s = String.valueOf(num);
            int i = Integer.parseInt(s);
            integers.add(i);
        }

        Collections.sort(integers);

        FileWriter fileWriter = new FileWriter(src);
        for (Integer integer : integers) {
            String s = String.valueOf(integer);
            fileWriter.write(s);
        }

        fileWriter.close();
        fileInputStream.close();
    }
}
