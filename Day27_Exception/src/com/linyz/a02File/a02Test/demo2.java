package com.linyz.a02File.a02Test;

import java.io.File;

public class demo2 {
    public static void main(String[] args) {

        /*
         * Contains subfolders
         * 包含子文件夹
         *
         * Determine whether the path contains files in the specified format
         * 判断路径下是否含有指定格式的文件
         * */

        File src = new File("C:\\Users\\linyz\\Pictures\\src");

        boolean b = findPNG(src);
        System.out.println(b);
    }

    public static boolean findPNG(File src) {
        // Null value check 空值检查
        if (src == null || !src.isDirectory()) {
            return false;
        }

        File[] files = src.listFiles();
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".png")) {
                return true;
            } else if (f.isDirectory()) {
                // recursion 递归
                if (findPNG(f)) {
                    return true;
                }
            }
        }
        return false;
    }
}
