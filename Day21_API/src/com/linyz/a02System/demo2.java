package com.linyz.a02System;

/*判断0 ~ 10000里面有多少个质数
* 比较两种方法运行时间,
* 用System.currentTimeMillis()方法进行统计运行时间*/

public class demo2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            if (isPrimeA(i)) {
                count++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("有"+count+"个");
        System.out.println("运行时间: " + (end - start));
    }

    public static boolean isPrimeA(int number) {
        // 平方根法
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeB(int number) {

        // 无脑法
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
