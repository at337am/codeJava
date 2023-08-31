package com.linyz.a12innerclassdemo4;

/*静态内部类
* 注意事项:
* 静态内部类也是成员内部类的一种
* 静态内部类只能访问外部类中的静态变量和静态方法
* 静态内部类想访问非静态的需要创建外部类对象*/
public class Outer {
    int a = 10;
    static int b = 20;

    static class Inner{

        public void show1(){
            /*访问外部类静态变量和非静态变量:
            Outer o = new Outer();
            System.out.println(o.a);
            System.out.println(b);*/

            System.out.println("这是非静态方法");
        }

        public static void show2(){
            /*访问外部类静态变量和非静态变量:
            Outer o = new Outer();
            System.out.println(o.a);
            System.out.println(b);*/
            System.out.println("这是静态方法");
        }
    }
}
