package com.linyz.a04Generic.GenericMethod;

import java.util.ArrayList;

/*泛型方法, 适用于在方法中不确定类型时使用*/

public class ListUtil {
    // 构造方法设置成私有, 因为是工具类, 不需要被实例化
    private ListUtil() {

    }

    // <E>卸写在修饰符后面, 添加若干的元素到集合中
    // E... e等同于E e1,E e2,E e3,E e4...
    public static <E> void addAll(ArrayList<E> list, E... e) {
        // E... e底层是一个数组
        for (E element : e) {
            list.add(element);
        }
    }
}
