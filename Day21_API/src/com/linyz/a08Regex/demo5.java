package com.linyz.a08Regex;

/*爬取一段文本中的信息*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo5 {
    public static void main(String[] args) {
        String regex_phone_number = "1[3-9]\\d{9}";
        String regex_email = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        String regex_table_number = "0\\d{2,3}-?[1-9]\\d{4,9}";
        String regex_hot_number = "400-?[1-9]\\d{2}-?[1-9]\\d{3}";

        String str = "这里是测试用的文本" +
                "phone_number:18221722838,1987645832,19283745032" +
                "email:lueqit@gmail.com,170712@oi.com,yayq@io.pos.sm" +
                "table_number = 011-12121,0123112,022-1212" +
                "hot_number = sdasd,1212,21212,400-125-2122,400-212-2120";

        String regex = "(\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2})" +
                "|(1[3-9]\\d{9})" +
                "|(0\\d{2,3}-?[1-9]\\d{4,9})" +
                "|(400-?[1-9]\\d{2}-?[1-9]\\d{3})";

        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(str);

        while (m.find()){
            String s = m.group();
            System.out.println(s);
        }
    }
}
