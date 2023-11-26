package com.linyz.a02File.a02Test;

import java.io.File;
import java.util.ArrayList;

public class demo4 {
    public static void main(String[] args) {

        /*
         * Contains subfolders
         * 包含子文件夹
         *
         * Collect all file names under the path
         * 收集路径下所有文件名
         * */

        File src = new File("C:\\Users\\linyz\\Pictures");
        ArrayList<String> list = new ArrayList<>();
        setFileList(src, list);
        list.forEach(System.out::println);
    }

    public static void setFileList(File src, ArrayList<String> list) {
        File[] files = src.listFiles();
        for (File f : files)
            if (f.isFile()) {
                list.add(f.getName());
            } else if (f.isDirectory()) {
                setFileList(f, list);
            }
    }
}
