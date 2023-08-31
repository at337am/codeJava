package com.linyz.a04Object;

/*深克隆
* - 引用数据类型会重新创建新的,而不是拷贝地址值
* - 字符串复用
* - 基本数据类型会拷贝过来
 *
 * 浅克隆
 * - 不管是什么, 全都拷贝过来, 修改其中一个对象的引用数据, 另一个对象也会被更改*/

public class demo2 {
    public static void main(String[] args) throws CloneNotSupportedException {

        int[] data = {1, 2, 3, 4, 5, 6, 7};

        User user1 = new User(12, "xs", "123", data);

        User user2 = (User) user1.clone();

        System.out.println(user1);
        System.out.println(user2);

        // 修改user1中的data数据看看user2中的是否有变化
        user1.getData()[0] = 100;
        System.out.println(user1.datatoString());
        System.out.println(user2.datatoString());
    }
}
