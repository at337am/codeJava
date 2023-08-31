package com.linyz.a05Objects;

import java.util.Objects;

/*Objects工具类
*
* Objects.equals()
* Objects.isNull()
* Objects.nonNull()*/

public class demo1 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student stu1 = new Student("xswl", 12);
        Student stu2 = (Student) stu1.clone();
        Student stu3 = null;

        /*Objects中的equals()调用的是对象类中的equals方法*/
        boolean result0 = Objects.equals(stu1, stu2);
        System.out.println(result0);

        boolean result1 = Objects.equals(stu1, stu3);
        System.out.println(result1);

        boolean result2 = Objects.isNull(stu3);
        System.out.println(result2);

        boolean result3 = Objects.nonNull(stu3);
        System.out.println(result3);


    }
}
