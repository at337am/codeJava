package com.linyz.a07Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.function.Consumer;

public class PokerGame {
    // 静态代码块, 跟着类的加载而加载
    static ArrayList<String> list = new ArrayList<>();

    // 计算牌的价值, String是牌, Integer是价值
    static HashMap<String, Integer> hm = new HashMap<>();

    static {
        String[] color = {"♣", "♥", "♠", "♦"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add(" 大王");
        list.add(" 小王");

        // 拿着每个list集合的数字到map中进行寻找
        // 如果找的到, 那么价值就是value
        // 如果找不到, 那么牌自身的值的就是价值本身
        hm.put("J", 11);
        hm.put("Q", 12);
        hm.put("K", 13);
        hm.put("A", 14);
        hm.put("2", 15);
        hm.put("小王", 50);
        hm.put("大王", 100);
    }

    public PokerGame() {

        // 洗牌
        Collections.shuffle(list);
        // 发牌 将牌分给三个人,  但是还要有三张底牌给地主, 所以是四个集合

        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            if (i <= 2) {
                lord.add(poker);
            }

            // 给三个玩家轮流发牌
            // 取模, 如果结果是0 发给玩家`1, 1 玩家2,  2 玩家3
            if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else {
                player3.add(poker);
            }
        }

        // 排序
        order(lord);
        order(player1);
        order(player2);
        order(player3);

        lookPoker("底牌", lord);
        lookPoker("玩家一: ", player1);
        lookPoker("玩家二: ", player2);
        lookPoker("玩家三: ", player3);
    }

    // 看牌
    // 参数1 玩家一 的名字
    // 参数2 玩家的集合
    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name + ": ");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s + " ");
            }
        });
        // 换行
        System.out.println();
    }

    // 根据牌的价值进行排序
    public void order(ArrayList<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 获取o1的花色
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);
                String color2 = o2.substring(0, 1);
                int value2 = getValue(o2);
                // 比较价值
                int i = value1 - value2;
                // 如果价值数字一样, 比较花色
                return i == 0 ? color1.compareTo(color2) : i;
            }
        });
    }

    // 获取牌的价值
    public int getValue(String poker) {
        // 获取牌上的数字
        String number = poker.substring(1);
        // 定义价值
        // 拿着数字到map集合中
        if (hm.containsKey(number)) {
            return hm.get(number);
        } else {
            // 如果不在map中, 价值就是本身, 转换成整数返回
            return Integer.parseInt(number);
        }
    }
}
