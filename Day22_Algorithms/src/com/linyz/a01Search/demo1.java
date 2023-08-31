package com.linyz.a01Search;

/*二分查找*/

public class demo1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int number = 2;
        System.out.println(binarySearch(arr, number));

    }

    public static int binarySearch(int[] arr, int number) {
        int i = 0;
        int j = arr.length;
        while (i < j) {
            int m = (i + j) / 2;
            if (number < arr[m]) {
                j = m;
            } else if (number > arr[m]) {
                i = m + 1;
            }else {
                return m;
            }
        }
        return -1;
    }
}
