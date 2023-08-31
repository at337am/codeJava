package com.linyz.a04Object;

/*toString()方法
* equals()方法*/

public class demo1 {
    public static void main(String[] args) {
        Object obj = new Object();
        //打印Object中toString方法返回的字符串
        System.out.println(obj.toString());
        //直接打印Object对象
        System.out.println(obj);

        //System: 类名
        //out:静态变量
        //System.out:获取打印对象
        //println():方法

        /*核心逻辑:打印对象时,底层会默认调用对象的toString方法

         * Object类中:
         * toString()方法默认返回的是地址值
         * equals方法默认比较的是地址值

         * */

        Student stu1 = new Student("s", 1);
        Student stu2 = new Student("s", 1);
        //重写toString方法后,打印对象
        System.out.println(stu1);

        //重写equals方法后,比较stu1和stu2
        System.out.println(stu1.equals(stu2));

    }
}
