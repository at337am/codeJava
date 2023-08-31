package com.linyz.a19Integer;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 键盘录入一个字符串类型的小数, 转换成double
        System.out.println("请输入");
        String line = sc.nextLine();
        double d = Double.parseDouble(line);
        System.out.println(d);
    }
}
