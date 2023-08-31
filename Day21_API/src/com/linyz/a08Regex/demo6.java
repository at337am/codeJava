package com.linyz.a08Regex;

/*带条件的爬取*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo6 {
    public static void main(String[] args) {
        String str = "java11 JaVa11 JvaA11 8 java12  Java17 Java8";
        // 第一题
        String regex1 = "((?i)Java)(?=11|8|17)";

        // 第二题
        String regex2 = "((?i)Java)(?:11|8|17)";

        // 第三题
        String regex3 = "((?i)Java)(?!11|8|17)";

        Pattern p = Pattern.compile(regex3);
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
