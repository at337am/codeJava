package com.linyz.a01ExceptionMethods;

public class demo1 {
    public static void main(String[] args) {
        /*
        * Common exception methods
        *
        * public String getMessage()    // Infrequently used
        * public String toString()      // Infrequently used
        * public void printStackTrace()
        *
        * */

        int[] arr = {1, 2, 3, 4, 5};

        try {
            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.toString());
//            System.out.println(e.getMessage());

            e.printStackTrace();// Print information to the console
        }

        System.out.println("xswl");

        // Expand
        System.err.println("error");

    }
}
