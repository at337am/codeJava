package com.linyz.a11innerclassdemo3;
/*成员内部类 题目:
* 要求在内部类的show()方法内打印10,20,30*/
public class Outer {
    private int a = 10;

    class Inner{
        private int a = 20;

        public void show(){
            int a = 30;
            /*不能用Outer.a直接访问Outer中的a,因为Outer.a被当作静态变量了
            * 而a不是静态变量,故报错
            * 需要用Outer.this.a来访问*/

            /*Outer.this是隐藏在内部类中的,它记录的是外部类对象的地址值*/
            System.out.println(Outer.this.a);
            System.out.println(this.a);
            System.out.println(a);

        }
    }
}
