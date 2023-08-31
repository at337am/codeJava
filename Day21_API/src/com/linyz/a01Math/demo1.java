package com.linyz.a01Math;

/*判断一个数是否为质数*/

public class demo1 {
    public static void main(String[] args) {
        System.out.println(isPrime(17));
    }

    public static boolean isPrime(int number){
        // 平方根法
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
