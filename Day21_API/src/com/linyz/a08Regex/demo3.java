package com.linyz.a08Regex;

/*身份证格式*/

public class demo3 {
    public static void main(String[] args) {
        String regex1 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}(\\d|(?i)x)";
        System.out.println("33108120030206741X".matches(regex1));
    }
}
