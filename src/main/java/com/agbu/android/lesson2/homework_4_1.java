package com.agbu.android.lesson2;

import java.util.*;

public class homework_4_1 {
    public static void main(String[] args) {
        /* 415. Տրված է N բնական թիվը և N տարր պարունակող միաչափ
        զանգվածը, որի բոլոր տարրերը, բացառությամբ առաջինի՝ կարգավորված
        են աճման կարգով։ Առաջին տարրի տեղափոխությամբ զանգվածը դարձնել կարգավորված։ */

//        int n = 6;
//        int[] array = new int[n];
//        Random rd = new Random();
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = rd.nextInt(100);
//
//        }
//        for (int j = 0; j < array.length; j++) {
//            Arrays.sort(array, 1, n);
//        }
//
//        System.out.println(java.util.Arrays.toString(array));
//
//        Arrays.sort(array);
//        System.out.print("415: ");
//        System.out.println(java.util.Arrays.toString(array));

        /* 416. Տրված է N բնական թիվը և N տարր պարունակող միաչափ
        զանգվածը, որի բոլոր տարրերը, բացառությամբ մեկից՝ կարգավորված
        են նվազման կարգով։ Կարգավորվածությւոնը խանգարող տարրի տեղափոխությամբ զանգվածը դարձնել կարգավորված։ */


//        Integer[] array = {5, 1, 6, 7, 8, 9};
//
//
//        for (int j = 0; j < array.length; j++) {
//            Arrays.sort(array, Collections.reverseOrder());
//        }
//
//        System.out.println("416: ");
//        System.out.println(java.util.Arrays.toString(array));


        /* 417. Տրված է N բնական թիվը և N տարր պարունակող միաչափ
        զանգվածը: Զանգվածից հեռացնել առաջին մեծագույն տարրը */

//        int n = 10;
//        int[] array = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            array[i] = new Random().nextInt(1, 50);
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//
//        max(array);


        /* 418. Տրված է N բնական թիվը և N տարր պարունակող միաչափ
        զանգվածը: Զանգվածից հեռացնել բոլոր կրկնվող տարրերը՝ դրանցից
         պահպանելով փոքր հերթական համար ունեցողը */

//        int[] array = new int[] {10, 1, 4, 3, 10, 2, 1, 5, 8};
//        for (int j: array) {
//            System.out.print(j + " ");
//        }
//        System.out.println();
//
//        duplicate(array);

        /* 419. Տրված է N բնական թիվը և N տարր պարունակող միաչափ
        զանգվածը: Զանգվածից հեռացնել այն տարրերը, որոնք երկուսից ավել
         անգամ են կրկնվում */

//        int [] array = new int[] {10, 1, 4, 3, 10, 2, 1, 5, 8, 10, 1, 4, 3, 10, 2, 1, 5, 8};
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (i != j && array[i] == array[j]) {
//                    if ( array[j] > 2) {
//                        array[j] = 0;
//                    }
//                }
//            }
//        }
//
//        for (int k : array) {
//            System.out.print(k + " ");
//        }

        /* 420. Տրված է N բնական թիվը և N տարր պարունակող միաչափ
        զանգվածը: Զանգվածից հեռացնել այն տարրերը, որոնք զանգվածում ճիշտ 4
         անգամ են կրկնվում */

        int [] array = new int[] {10, 1, 4, 3, 10, 2, 1, 5, 8, 10, 1, 4, 3, 10, 2, 1, 5, 8, 10, 1, 4, 3, 10, 2, 1, 5, 8};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    if ( array[j] > 4) {
                        array[j] = 0;
                    }
                }
            }
        }

        for (int k : array) {
            System.out.print(k + " ");
        }

    }

    static void max(int[] n) {

        int[] arrayWithoutMax = new int[n.length - 1];
        boolean isMaxAdded = false;
        int maximum = 0;
        int j = 0;

        for (int k : n) {
            if (maximum < k) {
                maximum = k;
            }
        }
        for (int k : n) {

            if (k == maximum && !isMaxAdded) {
                isMaxAdded = true;
                continue;
            }

            arrayWithoutMax[j] = k;
            j++;

        }
        for (int withoutMax : arrayWithoutMax) {
            System.out.print(withoutMax + " ");
        }

    }

    static void duplicate(int[] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (i != j && n[i] == n[j]) {
                    n[j] = 0;
                }
            }
        }

        for (int k : n) {
            System.out.print(k + " ");
        }

    }
}
