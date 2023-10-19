package com.linyz.a04Generic.GenericIterfaceDemo2;

public class y1 {
    public static void main(String[] args) {
        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(1);
        // 可以创建不同类型的实现类
        MyArrayList<String> list2 = new MyArrayList<>();
        list2.add("xs");
    }
}
