package com.linyz.a04demo;

/*案例*/

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {

        GirlFriend gf1 = new GirlFriend(12, "ymx", 167);
        GirlFriend gf2 = new GirlFriend(15, "yyq", 165);
        GirlFriend gf3 = new GirlFriend(15, "lyx", 172);
        GirlFriend gf4 = new GirlFriend(12, "ybq", 167);
        GirlFriend gf5 = new GirlFriend(11, "shy", 165);

        GirlFriend[] arr = {gf1, gf2, gf3, gf4, gf5};

        // 排序
        Arrays.sort(arr, (o1, o2) -> {
            double temp = o1.getAge() - o2.getAge();
            temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

            return temp > 0 ? 1 : (temp < 0 ? -1 : 0);

        });

        // 遍历
        for (GirlFriend i : arr) {
            System.out.println(i.toString());
        }
    }
}

class GirlFriend{
    private int age;
    private String name;
    private double height;

    public GirlFriend() {
    }

    public GirlFriend(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "GirlFriend{age = " + age + ", name = " + name + ", height = " + height + "}";
    }
}