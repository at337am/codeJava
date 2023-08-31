package com.linyz.a08Regex;

/*捕获分组*/

public class demo9 {
    public static void main(String[] args) {

        // 捕获分组

        /*判断一个字符串开始部分和结束部分是否一致,开始部分和结束部分的内部也要一致*/
        String str1 = "aaa4564123aaa";
        String regex1 = "((.)\\2*).+\\1";
        System.out.println(str1.matches(regex1));

        /*替换
         * 把以下内容改为我要吃饭*/
        String str2 = "我要吃吃吃吃吃吃吃吃饭饭饭饭饭饭饭饭";
        String regex2 = "(\\W)\\1+";
        System.out.println(str2.replaceAll(regex2, "$1"));

        // 非捕获分组
        /*(?:) (?=) (?!)都是非捕获分组
        * 不占用分组序号*/
        String regex3 = "[1-9]\\d{16}(?:\\d|X|x)";

    }

}
