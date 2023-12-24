package com.linyz.a03Test.a01CopyFolder;

import java.io.*;

public class demo1 {
    public static void main(String[] args) throws IOException {
        File src = new File("C:\\Users\\linyz\\Pictures\\images");
        File dest = new File("C:\\Users\\linyz\\Downloads\\images");
        copyFolder(src, dest);

    }

    public static void copyFolder(File src, File dest) throws IOException {
        dest.mkdirs();
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                FileOutputStream fileOutputStream = new FileOutputStream(new File(dest, file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fileInputStream.read(bytes)) != -1) {
                    fileOutputStream.write(bytes, 0, len);
                }
                fileInputStream.close();
                fileOutputStream.close();
            } else if (file.isDirectory()) {
                copyFolder(file, new File(dest,file.getName()));
            }
        }
    }
}
