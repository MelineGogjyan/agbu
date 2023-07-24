package com.agbu.android.lesson3;

import java.util.*;
public class homework_7_1 {

    public static void main(String[] args) {
        /* Կազմել բլոկ֊սխեմա և ծրագիր, որոնք կհաշվեն և կտպեն n հատ ամբողջ տիպի տարրեր պարունակող
        միաչափ զանգվածի
        * 231. զույգ արժեք ունեցող տարրերի քառակուսիների գումարը։ */
        int sum = 0;
        int count = 0;
        int product = 1;
        int[] array = new int[] {72, 62, 95, 64, 99, 66, 45};
        System.out.println(java.util.Arrays.toString(array));

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                int square = array[i] * array[i];
//                sum += square;
//            }
//        }
//
//        System.out.println(sum);

        // 232. զույգ արժեք ունեցող տարրերի քանակը։

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);

        // 233. զույգ արժեք ունեցող տարրերի արտադրյալը և գումարը։
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                product *= array[i];
//                sum += array[i];
//            }
//        }
//
//        System.out.println("Product: " + product);
//        System.out.println("Sum: " + sum);

        // 234. կենտ արժեք ունեցող տարրերի միջին թվաբանականը։
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 1) {
//                sum += array[i];
//                count++;
//            }
//        }
//        System.out.println(sum/count);

        // 235․ կենտ արժեք ունեցող տարրերի միջին քառակուսայինը։
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 1) {
//                sum += array[i] * array[i];
//                count++;
//            }
//        }
//        System.out.println(sum/count);

        // 236. կենտ արժեք ունեցող տարրերի քանակը և արտադրյալը։

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 1) {
//                product *= array[i];
//                count++;
//            }
//        }
//        System.out.println(count);
//        System.out.println(product);

        // 237․ զրո արժեք ունեցող տարրերի քանակը։

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);

        // 238․ 3֊ին բազմապատիկ տարրերի միջին թվաբանականը։

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 3 == 0) {
//                sum += array[i];
//                count++;
//            }
//        }
//        System.out.println(sum/count);

        // 239. 5֊ին բազմապատիկ տարրերի միջին քառակուսայինը։

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 5 == 0) {
//                sum += array[i] * array[i];
//                count++;
//            }
//        }
//        System.out.println(sum/count);

        // 240. 7֊ին բազմապատիկ տարրերի քանակը։
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 7 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);

        // 241. տրված k թվին բազմապատիկ տարրերի գումարը։

//        int k = 2;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % k == 0) {
//                sum += array[i];
//            }
//        }
//        System.out.println(sum);

        // 242. տրված m թվին բազմապատիկ տարրերի արտադրյալը։
//        int m = 4;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % m == 0) {
//                product *= array[i];
//            }
//        }
//        System.out.println(product);

        // 243. տրված t թվին բազմապատիկ տարրերի քանակը։
//        int t = 8;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % t == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);

        // 244. այն տարրերի արտադրյալը, որոնք 5֊ի բաժանելիս կմնա  2 մնացորդ։

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 5 == 2) {
//                product *= array[i];
//            }
//        }
//        System.out.println(product);

        /* 245. այն տարրերի քառակուսիների գումարը, որոնց արժեքների և ինդեքսների գումարը
        առանց մնացորդի բաժանվում է 3֊ի։ */

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 3 == 0 && i % 3 == 0) {
//                int square = array[i] * array[i];
//                sum += square;
//            }
//        }
//        System.out.println(sum);

        // 246. այն տարրերի միջին թվաբանականը, որոնց ինդեքսը որևէ բնական թվի քառակուսի է։

//        for (int i = 0; i < array.length; i++) {
//            if ( i % 4 == 0 || i % 8 == 1 ) {
//                sum += array[i];
//                count++;
//            }
//        }
//        System.out.println(sum/count);

        // 247. այն տարրերի միջին քառակուսայինը, որոնց արժեքը մեծ է ինդեքսի արժեքից։

//        for (int i = 0; i < array.length; i++) {
//            if ( array[i] > i ) {
//                sum += array[i] * array[i];
//                count++;
//            }
//        }
//        System.out.println(sum/count);

        /* 248. այն տարրերի գումարը, որոնց արժեքի և ինդեքսի գումարի քառակուսին առանց մնացորդի
        բաժանվում է տրված k ամբողջ թվին։ */
//        int k = 3;

//        for (int i = 0; i < array.length; i++) {
//            int sumSquare = (array[i] + i) * (array[i] + i);
//            System.out.println(sumSquare);
//            if ( sumSquare % k == 0 ) {
//                sum += array[i];
//            }
//        }
//        System.out.println(sum);

        /* 249. այն տարրերի քանկաը, որոնց արժեքի և ինդեքսի տարբերությունը բացարձակ արժեքով մեծ է
        տրված k թվից: */

//        int k = 65;
//
//        for (int i = 0; i < array.length; i++) {
//            int difference = (array[i] - i);
//
//            if ( difference > k) {
//                count++;
//            }
//        }
//        System.out.println(count);

        /* 250. այն տարրերի քառակուսիների արտադրյալը, որոնց արժեքների և ինդեքսների արտադրյալը 3֊ի
        բաժանելիս կմնա 2 մնացորդ։ */

//        int result = 1;
//
//        for (int i = 0; i < array.length; i++) {
//            int product1 = array[i] * i;
//
//            if ( product1 % 3 == 2 ) {
//                int square = array[i] * array[i];
//                result *= square;
//            }
//        }
//        System.out.println(result);

        /* Կազմել բլոկ֊սխեմա և ծրագիր, որոնք կհաշվեն և կտպեն տրված n տարրեր պարունակող միաչափ զանգվածի */
        // 251. մեծագույն տարրը։

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i] < array[j]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//
//        System.out.println(array[array.length-1]);

        // 252. փոքրագույն տարրը։

//        System.out.println(array[0]);

        // 253. մեծագույն և փոքրագույն տարրերի գումարը։

//        System.out.println(array[0] + array[array.length-1]);

        // 254․ մեծագուն և փոքրագույն տարրերի արտադրյալը։

//        System.out.println(array[0] * array[array.length-1]);

        // 255. մեծագույն տարրի և իր համարի գումարը (ենթադրվում է, որ զանգվածում կա միայն մեկ մեծագույն տարր)։}

//        System.out.println(array[array.length - 1] + array.length - 1);


        // 256․ փոքրագույն տարրի և իր համարի գումարը (ենթադրվում է, որ զանգվածում կա միայն մեկ փոքրագույն տարր)։

//        System.out.println(array[0] + 0);

        // 257. առաջին մեծագույն տարրի համարը։

//        int max = 0;
//        for (int i = 0; i < array.length; i++) {
//            max = array[i];
//            for (int j = 0; j < array.length; j++) {
//                if (array[j] > max) {
//                    max = array[j];
//                    break;
//                }
//            }
//        }
//        System.out.println(max);


        // 258․ վերջին մեծագույն տարրի համարը։
//        int max = 0;
//        for (int i = 0; i < array.length; i++) {
//            max = array[i];
//            for (int j = 0; j < array.length; j++) {
//                if (array[j] > max) {
//                    max = array[j];
//                }
//            }
//        }
//        System.out.println(max);

        // 259․ առաջին փոքրագույն տարրի համարը։
//        int min = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            min = array[i];
//            for (int j = 0; j < array.length; j++) {
//                if (array[j] < min) {
//                    min = array[j];
//                    break;
//                }
//            }
//        }
//        System.out.println(min);

        // 260. վերջին փոքրագույն տարրի համարը։
//        int min = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            min = array[i];
//            for (int j = 0; j < array.length; j++) {
//                if (array[j] < min) {
//                    min = array[j];
//                }
//            }
//        }
//        System.out.println(min);

    }
}
