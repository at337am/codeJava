package com.linyz.a06BigInteger;

/*BigInteger大整数类
* 获取大整数*/

import java.math.BigInteger;

public class demo1 {
    public static void main(String[] args) {
        // 使用构造方法获取指定大整数
        BigInteger b1 = new BigInteger("5555555555555555555555");
        System.out.println(b1);

        // 使用静态方法获取指定大整数, 不能超出long范围
        BigInteger b4 = BigInteger.valueOf(516);
        System.out.println(b4);

        // 构造方法内部有优化, -16 ~ 16之间 ,多次创建时会引用地址值
        BigInteger b5 = BigInteger.valueOf(-16);
        BigInteger b6 = BigInteger.valueOf(-16);
        System.out.println(b5 == b6);
    }

}