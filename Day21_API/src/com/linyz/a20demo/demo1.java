package com.linyz.a20demo;

/*练习1*/

import java.util.ArrayList;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            System.out.println("请输入一个0 - 100之间的整数: ");
            String line = sc.nextLine();
            int num = Integer.parseInt(line);
            if (num < 0 | num > 100) {
                System.out.println("不符合要求请重新输入");
                continue;
            }
            list.add(num);
            int sum = getsum(list);
            if (sum >= 200) {
                System.out.println("结束");
                break;
            }
        }
        // 遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    // 计算集合中的总和
    private static int getsum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
