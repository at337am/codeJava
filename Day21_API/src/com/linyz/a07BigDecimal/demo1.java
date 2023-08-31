package com.linyz.a07BigDecimal;

/*BigDecimal
* 获取小数*/

import java.math.BigDecimal;

public class demo1 {
    public static void main(String[] args) {
        // 构造方法
        BigDecimal b1 = new BigDecimal("0.19");
        // 静态方法
        BigDecimal b2 = BigDecimal.valueOf(7);

        // 静态方法传递的是0~10之间的整数时, 会引用地址值
        BigDecimal b3 = BigDecimal.valueOf(7);
        System.out.println(b3 == b2);
        System.out.println(b2);
    }
}
