package com.linyz.a06BigInteger;

/*计算 成员方法*/

import java.math.BigInteger;

public class demo2 {
    public static void main(String[] args) {
        BigInteger b1 = BigInteger.valueOf(12);
        BigInteger b2 = BigInteger.valueOf(17);

        // 加法
        BigInteger b3 = b1.add(b2);
        System.out.println(b3);

        // 除法,返回 商 余数 的数组
        BigInteger[] arr = b2.divideAndRemainder(b1);
        System.out.println("商为" + arr[0] + ",余数为" + arr[1]);

        // 比较是否相等
        boolean result = b1.equals(b2);
        System.out.println(result);

        // 次幂
        BigInteger b4 = b1.pow(2);
        System.out.println(b4);

        // 比较大小
        BigInteger b5 = b1.max(b2);
        System.out.println(b5);

        // 转换为int类型
        int b6 = b1.intValue();
        System.out.println(b6);
    }
}
