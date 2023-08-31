package com.linyz.a02System;

/*System.arraycopy()方法
* 拷贝数组*/

public class demo3 {
    public static void main(String[] args) {
        int[] arr1 = {1,27,56,23,11,12};
        int[] arr2 = new int[6];

        System.arraycopy(arr1, 0, arr2, 1, 5);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

}
