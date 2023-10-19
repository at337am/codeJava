package com.linyz.a02Iterator;

/*增强for循环遍历*/

import java.util.ArrayList;
import java.util.Collection;

public class demo2 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("xsl");
        collection.add("swl");
        collection.add("xwl");
        collection.add("xsw");

        for (String str : collection) {
            System.out.println(str);
        }
    }
}
