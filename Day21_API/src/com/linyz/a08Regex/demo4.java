package com.linyz.a08Regex;

/*爬虫*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo4 {
    public static void main(String[] args) {
        String str = "Java17.xsk说的骄傲是较大奥斯哦发生的idJava11..哈啊哈...JAVA127";
        System.out.println(method(str));
    }

    public static String method(String str) {
        StringBuilder sb = new StringBuilder();
        Pattern p = Pattern.compile("Java\\d{0,2}");
        Matcher m = p.matcher(str);
        while (m.find()){
            sb.append(m.group());
        }
        return sb.toString();
    }

}
