package com.linyz.a02File.a02Test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class demo1 {
    public static void main(String[] args) throws IOException {

        /*
         * Does not contain subfolders
         * 不包含子文件夹
         *
         * Determine whether the path contains files in the specified format
         * 判断路径下是否含有指定格式的文件
         * Display using the format of file name + file modification time
         * 使用文件名+文件修改时间的格式显示
         * */

        File src = new File("C:\\Users\\linyz\\Pictures");
        File[] files = src.listFiles();
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".jpeg")) {
                long time = f.lastModified();
                String fileName = f.getName();
                System.out.println(fileName + " --- " + timeFormat(time));
            }
        }
    }

    public static String timeFormat(Long time) {
        Instant instant = Instant.ofEpochMilli(time);
        LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateTime.format(formatter);

       return "Last Modified Time: " + formattedDate;
    }
}
