package com.linyz.a06Test;

// 抽取到的人不再抽取, 结束后开启第二轮

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "a", "b", "c", "d", "e", "f", "g");

        // 创建一个临时的集合用来存储被抽取到的人
        ArrayList<String> list2 = new ArrayList<>();

        Random r = new Random();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("====第" + i + "轮点名开始了====");
            // 记录一开始集合的长度
            int size = list1.size();
            for (int j = 0; j < size; j++) {
                // 生成随机删除的索引
                int index = r.nextInt(list1.size());
                // remove会返回被删除的元素, 直接用变量接收即可
                String remove = list1.remove(index);
                // 将抽取的人存入第二个集合中
                list2.add(remove);
                System.out.println(remove);
            }
            // 结束后, 将list2中的数据存入list1中, 并且清空list2中的数据
            list1.addAll(list2);
            list2.clear();
        }
    }
}
