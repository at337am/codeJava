package com.linyz.a09innerclassdemo1;
/*什么是内部类*/
public class Car {
/*外部类 车*/
    String carName;
    int carAge;
    String carColor;

    public void show(){
        System.out.println(carName);

        /*访问内部类的属性时,需要创建内部类的对象*/
        Engline e = new Engline();
        e.engineName = "发动机一号";
        System.out.println(e.engineName);

    }


    class Engline{
    /*内部类 发动机*/
        String engineName;
        int engineAge;

        public void show(){
            /*内部类可以直接访问外部类的属性*/
            System.out.println(carName);
            System.out.println(engineName);
        }

    }
}
