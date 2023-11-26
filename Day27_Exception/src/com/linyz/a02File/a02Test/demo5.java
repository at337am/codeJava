package com.linyz.a02File.a02Test;

import java.io.File;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class demo5 {
    public static void main(String[] args) {

        /*
         * Contains subfolders
         * 包含子文件夹
         *
         * Count the number of all file types under the path
         * 统计路径下所有文件类型的个数
         * */

        File src = new File("C:\\Users\\linyz\\Pictures");
        HashMap<String, Integer> hm = new HashMap<>();
        setCount(src, hm);

        // Traverse 遍历
        hm.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s + "-" + integer);
            }
        });
    }

    public static void setCount(File src, HashMap<String, Integer> hm) {
        if (!src.exists()) {
            System.out.println("Path not found");
            return;
        }

        File[] files = src.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                String fileName = f.getName();
                String[] arr = fileName.split("\\.");
                String endName = arr[arr.length - 1];

                if (hm.containsKey(endName)) {
                    Integer count = hm.get(endName);
                    count++;
                    hm.put(endName, count);
                } else {
                    hm.put(endName, 1);
                }
            } else if (f.isDirectory()) {
                setCount(f, hm);
            }
        }
    }
}
