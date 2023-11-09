package com.linyz.a05args;

public class demo1 {
    public static void main(String[] args) {
        int result = getSum(1, 2, 3, 4, 5);
        System.out.println(result);
    }

    // 可变参数只能写一个
    // args会自动转成一个数组
    // 如果还有其他参数, 那么可变参数要写在最后
    public static int getSum(int... args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
