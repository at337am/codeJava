package com.linyz.a02Arrays;

/*Arrays.sort()快速排序*/

import java.util.Arrays;
import java.util.Comparator;

public class demo1 {
    public static void main(String[] args) {
        Integer[] arr = {11, 34, 24, 15, 69, 27};
        /*降序: o2 - o1
        * 升序: o1 - o2*/
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr));

    }
}
