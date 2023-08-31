package com.linyz.a01Math;

/*统计一共有多少个三位自幂数(水仙花数)
* 统计一共有多少个四位自幂数(四叶玫瑰数)
* 统计一共有多少个五位自幂数(五角星数)*/

public class demo2 {
    public static void main(String[] args) {
        System.out.println(aQ());
        System.out.println(bQ());
        System.out.println(cQ());
    }

    public static int aQ(){
        int count = 0;
        for (int i = 100; i < 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            double sum = Math.pow(ge,3) + Math.pow(shi,3) + Math.pow(bai,3);
            if (sum == i){
                count++;
            }
        }
        return count;
    }

    public static int bQ(){
        int count = 0;
        for (int i = 1000; i < 9999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;

            double sum = Math.pow(ge,4) + Math.pow(shi,4) + Math.pow(bai,4) + Math.pow(qian,4);
            if (sum == i){
                count++;
            }
        }
        return count;
    }

    public static int cQ(){
        int count = 0;
        for (int i = 10000; i < 99999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000 % 10;
            
            double sum = Math.pow(ge,5) + Math.pow(shi,5) + Math.pow(bai,5) + Math.pow(qian,5) + Math.pow(wan,5);
            if (sum == i){
                count++;
            }
        }
        return count;
    }
}
