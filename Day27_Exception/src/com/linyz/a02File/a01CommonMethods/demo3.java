package com.linyz.a02File.a01CommonMethods;

import java.io.File;

public class demo3 {
    public static void main(String[] args) {
        /*
        * Get all content under the path
        * 获取路径下所有内容
        * */
        File file = new File("C:\\Users\\linyz\\Pictures");
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f.getName() + " is a file");
            } else {
                System.out.println(f.getName() + " is the folder");
            }
        }
    }
}
