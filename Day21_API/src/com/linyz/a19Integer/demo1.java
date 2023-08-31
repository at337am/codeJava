package com.linyz.a19Integer;

/*Integer包装类*/

public class demo1 {
    public static void main(String[] args) {

        // JDK5之后, 新的方法, 直接赋值就行了
        Integer i2 = 10;
        Integer i3 = 11;
        Integer i4 = i2 + i3;
        System.out.println(i4);// 21

        // 转成八进制
        String str1 = Integer.toOctalString(100);
        System.out.println(str1);// 144

        // 转成二进制
        String str2 = Integer.toBinaryString(100);
        System.out.println(str2);// 1100100

        // 转成十六进制
        String str3 = Integer.toHexString(1000);
        System.out.println(str3);// 3e8

        // 将字符串类型的整数转成int类型   !!!重要
        int a = Integer.parseInt("1234");
        System.out.println(a);// 1234

        // 8种包装类当中除了character都有parseXxx方法进行转换
        boolean b = Boolean.parseBoolean("true");
        System.out.println(b);
    }
}
