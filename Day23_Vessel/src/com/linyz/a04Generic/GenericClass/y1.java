package com.linyz.a04Generic.GenericClass;

public class y1 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");

        System.out.println(list.get(0));
        System.out.println(list);


        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(122);
        list2.add(144);

        System.out.println(list2.get(1));
        System.out.println(list2);
    }
}
