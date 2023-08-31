package com.linyz.a02Iterator;

/*迭代器遍历*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo1 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("xsl");
        collection.add("swl");
        collection.add("xwl");
        collection.add("xsw");

        // 遍历结束后, 指针不会复位, 最后指向空值
        // 空值时next()会报NoSuchElementException异常
        // 一个循环中只能有一个next()
        // 遍历时. 不能用集合的方法进行增加或删除

        Iterator<String> iterator = collection.iterator();  // 获取迭代器对象
        while (iterator.hasNext()) {        // 当前位置为空时 hasNext()返回false
            String str = iterator.next();   // 获取当前的值, 并移动指针到下一位
            System.out.println(str);
        }
    }
}
