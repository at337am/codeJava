package com.linyz.a03List;

/*List的五种遍历方式*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class demo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

// 1. 迭代器遍历
        // 在遍历的过程中将元素删掉
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("aaa")) {
                iterator.remove();// 遍历到aaa时将这个元素从list中删掉
            }
            System.out.println(next);
        }
        System.out.println(list);// [bbb, ccc, ddd, eee]

// 2. 增强for循环遍历
        for (String s : list) {
            System.out.println(s);
        }

// 3. lambda表达式遍历
        // forEach方法匿名内部类
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        // lambda表达式
        list.forEach(s -> System.out.println(s));
        // 只是为了打印元素时, 可以使用这种方式, 简化了上面的lambda表达式
        list.forEach(System.out::println);

// 4. 普通for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

// 5. 列表迭代器
        // 比迭代器多了个方法
        // 在遍历的时候可以添加元素
        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()) {
            String str = stringListIterator.next();
            if ("ccc".equals(str)) {
                stringListIterator.add("qqq");// 使用迭代器对象添加元素到集合中
                // 如果使用list.add("qqq")会出现并发修改异常
            }
            System.out.println(str);
        }
        System.out.println(list);// [bbb, ccc, qqq, ddd, eee]

    }
}