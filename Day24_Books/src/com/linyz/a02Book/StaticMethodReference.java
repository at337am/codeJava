package com.linyz.a02Book;

/*静态方法引用*/

// 函数式接口
interface StringFunc{
    String func(String string);
}

// 反转字符串
class MyStringOps{
    public static String strReverse(String str) {
        var sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}

public class StaticMethodReference {
    public static String stringOps(StringFunc sf, String str) {
        return sf.func(str);
    }

    public static void main(String[] args) {
        var str = "hsilgnE";
        // 声明一个静态方法引用
        // 底层会先实现一个函数式接口StringFunc的实例sf
        // 并将strReverse的方法体覆盖到实例sf中的func方法里.
        // 最后执行stringOps方法体中的sf.func(str)  返回结果
        var outStr = stringOps(MyStringOps::strReverse, str);
        System.out.println(outStr);
    }
}
