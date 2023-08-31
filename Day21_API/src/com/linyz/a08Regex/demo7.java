package com.linyz.a08Regex;

/*贪婪爬取:尽可能多的爬取
* 非贪婪爬取:尽可能少的爬取
* */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo7 {
    public static void main(String[] args) {
        String str = "abbbbbaaass";
        // 贪婪
        String regex1 = "ab+";
        // 非贪婪
        String regex2 = "ab+?";
        Pattern p = Pattern.compile(regex1);
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
