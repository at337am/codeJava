package com.linyz.a02File.a01CommonMethods;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class demo1 {
    public static void main(String[] args) {
        String f1 = "C:\\Users\\linyz\\Downloads";
        String f2 = "1.txt";

        File file = new File(f1, f2);
        System.out.println(file);

        // 1. Does this file exist?
        boolean exists = file.exists();
        System.out.println(exists);

        // 2. Is this a file?
        boolean isFile = file.isFile();
        System.out.println(isFile);

        // 3. Is this a folder?
        boolean isDirectory = file.isDirectory();
        System.out.println(isDirectory);

        // 4. What is the size of this file?
        long length = file.length();
        System.out.println(length);

        // 5. What is the absolute path to the file?
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);

        // 6. What is the path to the file?
        String path = file.getPath();
        System.out.println(path);

        // 7. what is the file name?
        String name = file.getName();
        System.out.println(name);

        // 8. When was the last time the article was revised?
        long time = file.lastModified();
        System.out.println(time);

        // Convert time format
        Instant instant = Instant.ofEpochMilli(time);
        LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateTime.format(formatter);

        System.out.println("Last Modified Time: " + formattedDate);
    }
}





