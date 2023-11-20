package com.linyz.a06Test;

// 70%概率和30%概率

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // 往集合中添加元素
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(list, 0, 0, 0);

        // 打乱集合
        Collections.shuffle(list);

        Random random = new Random();
        // 拿到索引
        int i = random.nextInt(list.size());

        // 判断
        if (list.get(i) == 1) {
            System.out.println("男生");
        }else {
            System.out.println("女生");
        }
    }
}
