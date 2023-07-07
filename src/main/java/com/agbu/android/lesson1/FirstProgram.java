package com.agbu.android.lesson1;

public class FirstProgram {
    public static void main(String[] args) {



        int[] intArray = {1, 6, 5, 8, 9, 5};

        int c = 1;
        int d = 5;
        int count = 0;

        for (int i = 0; i < intArray.length; ++i) {
            if (i > c && i < d) {
                count++;
            }
        }

        System.out.println("222: " + count);


//        long product7 = 1;

//        for ( int i = 1; i < 1000 ; i++) {
//            if (i % 3 == 1 && i % 4 == 2) {
//                if (i >= 100) {
//                    product7 *= i;
//                }
//
//            }
//        }
//        System.out.println("159 result: " + product7);

    }
}
