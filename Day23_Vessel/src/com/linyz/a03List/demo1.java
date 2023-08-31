package com.linyz.a03List;

/*List有序集合接口 常见的方法
* 继承自collection
* */

import java.util.ArrayList;
import java.util.List;

public class demo1 {
    public static void main(String[] args) {
        // 创建一个集合
        List<String> list = new ArrayList<>();
        // 添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        // 插入元素
        list.add(1, "xxx");
        System.out.println(list);// [aaa, xxx, bbb, ccc, ddd]

        // 根据索引删除时会返回删除的元素
        String remove = list.remove(0);
        System.out.println(remove);// aaa
        System.out.println(list);// [xxx, bbb, ccc, ddd]

        // 通过元素删除
        list.remove("xxx");
        System.out.println(list);// [bbb, ccc, ddd]

        // 通过索引修改元素, 会返回被修改的元素
        String set = list.set(0, "yyy");
        System.out.println(set);// bbb
        System.out.println(list);// [yyy, ccc, ddd]

        // 返回指定索引的元素
        String get = list.get(0);
        System.out.println(get);// yyy

    }
}
