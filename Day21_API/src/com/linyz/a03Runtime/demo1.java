package com.linyz.a03Runtime;

public class demo1 {
    public static void main(String[] args) {
        /*等同于System.exit()*/
        Runtime.getRuntime().exit(0);
        System.out.println("看看我运行了吗");
    }
}
