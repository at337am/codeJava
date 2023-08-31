package com.linyz.a08Regex;

/*邮箱号码*/

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        /*邮箱号码
        * 如: ods23@1s3.cnn   12371asd@gmail.com    6sda8s@xss.com.cn
        * 第一部分: @的左边
        *           - 任意数字字母下划线,至少出现一次
        * 第二部分: @本身
        *           - 出现一次
        * 第三部分:
        * 3.1: .的左边
        *       - 任意数字字母,不能是下划线
        *       - 出现2-6次
        * 3.2: .本身
        *       - 出现一次
        * 3.3: .的右边
        *       - 任意字母
        *       - 出现2-3次
        * 把3.2和3.3看成一组,这一组可以出现1次或者2次
        * */
        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("输入邮箱号码:");
        System.out.println(getString().matches(regex3));

        System.out.println("------------------------------");

        /*用户插件自动生成正则表达式
        * Alt+A键自动生成24小时*/
        // 24小时
        String regex4 = "([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        // 用分组可以写成:
        String regex5 = "([01]\\d|2[0-3])(:[0-5]\\d){2}";
        System.out.println("23:59:59".matches(regex4));// true
        System.out.println("23:59:59".matches(regex5));// true
    }

    public static String getString(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
