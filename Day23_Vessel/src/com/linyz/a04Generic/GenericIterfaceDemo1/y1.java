package com.linyz.a04Generic.GenericIterfaceDemo1;

public class y1 {
    public static void main(String[] args) {
        // 这里不用设置类型, 因为MyArrayList实现了String类型的接口List
        MyArrayList list = new MyArrayList();

        // add方法只能添加字符串类型
        list.add("xswl");
        System.out.println(list);

        /*不能添加其它类型
        list.add(122);// 报错*/
    }
}
