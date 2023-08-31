package com.linyz.a04Generic.Extends;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {

        // 泛型不具备继承性 但是数据具有继承性
        ArrayList<ye> list1 = new ArrayList<>();
        list1.add(new ye());
        list1.add(new fu());
        list1.add(new zi());

        ArrayList<fu> list2 = new ArrayList<>();

        list2.add(new zi());
        list2.add(new fu());

        ArrayList<zi> list3 = new ArrayList<>();

        list3.add(new zi());


        method(list1);// 可以

        /*
        method(list2);// 报错
        method(list3);// 报错
        */

    }

    public static void method(ArrayList<ye> list) {

    }
}

class ye{
}
class fu extends ye {
}
class zi extends fu {
}
