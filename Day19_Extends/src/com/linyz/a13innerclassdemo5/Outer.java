package com.linyz.a13innerclassdemo5;
/*局部内部类
* 不太重要*/

public class Outer {

    public void show(){
        int a = 10;
        /*局部内部类*/
        class Inner{

            int age;
            String name;

            public void mathod1(){
                System.out.println("这是局部内部类中的mathod1方法");
            }
            public static void mathod2(){
                System.out.println("这是局部内部类中的mathod2方法");
            }
            public void show(){
                System.out.println("这是定义在外部类show()方法内的变量a: "+a);
            }


        }

        /*创建局部内部类的对象*/
        Inner i = new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.mathod1();
        Inner.mathod2();
        i.show();
    }

}
