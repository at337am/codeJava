package com.linyz.a20demo;

/*练习2*/

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串数字: ");
        String regex = "[1-9]\\d{1,9}";
        // 检验字符串是否符合要求
        while (true) {
            String str = sc.nextLine();
            if (!str.matches(regex)) {
                System.out.println("不满足请重新输入");
                continue;
            }
            System.out.println(getInt(str));
            break;
        }
    }

    // 将字符串转换成整数
    public static int getInt(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int num = c - '0';
            result = result * 10 + num;
        }
        return result;
    }
}
