package com.linyz.a02File.a02Test;

import java.io.File;

public class demo3 {
    public static void main(String[] args) {

        /*
         * Contains subfolders
         * 包含子文件夹
         *
         * Delete folders
         * 删除文件夹
         * */

        File src = new File("C:\\Users\\linyz\\Pictures\\src");
        deleteSrc(src);
    }

    public static void deleteSrc(File src) {
        File[] files = src.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                f.delete();
            } else if (f.isDirectory()) {
                // recursion 递归
                deleteSrc(f);
            }
        }
        src.delete();
    }
}
