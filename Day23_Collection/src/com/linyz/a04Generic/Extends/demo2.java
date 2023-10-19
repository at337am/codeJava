package com.linyz.a04Generic.Extends;

import java.util.ArrayList;

/*泛型的通配符*/

public class demo2 {
    public static void main(String[] args) {

        ArrayList<Animal> list1 = new ArrayList<>();
        ArrayList<Cat> list3 = new ArrayList<>();
        ArrayList<Dog> list2 = new ArrayList<>();

        method(list1);
        method(list2);
        method(list3);

    }

    public static void method(ArrayList<? extends Animal> list) {


    }
}
class Animal{
}
class Cat extends Animal {
}
class Dog extends Cat {
}


