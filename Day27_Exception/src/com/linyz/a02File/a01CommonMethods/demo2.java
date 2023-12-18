package com.linyz.a02File.a01CommonMethods;

import java.io.File;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws IOException {

        /*
         * If the path is wrong, an IO exception will be reported.
         * 如果路径错误, 会报IO异常
         * */

        // 1. Create a file
        File file1 = new File("C:\\Users\\linyz\\Downloads\\1.txt");
        boolean b1 = file1.createNewFile();
        System.out.println(b1);

        // 2. Create a folder
        File file2 = new File("C:\\Users\\linyz\\Downloads\\xxx");
        boolean b2 = file2.mkdir();
        System.out.println(b2);

        /*
         * 3. Create a folder, and paths that do not exist will be automatically created.
         * 创建文件夹, 不存在的路径自动创建
         * */
        File file3 = new File("C:\\Users\\linyz\\Downloads\\aaa\\ccc");
        boolean b3 = file3.mkdirs();
        System.out.println(b3);

        /*
        * 4. delete
        * Cannot delete folders with content
        * 删除不了有内容的文件夹
        * */
        boolean b4 = file1.delete();
        System.out.println(b4);
    }
}
