package com.linyz.a03Runtime;

import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws IOException {
        //CPU线程数
        System.out.println(Runtime.getRuntime().availableProcessors());
        //总内存大小 单位: byte
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);
        //已获取内存大小
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);
        //剩余内存大小
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);
        //运行cmd命令
        Runtime.getRuntime().exec("notepad");

    }
}
