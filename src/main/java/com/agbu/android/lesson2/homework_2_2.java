package com.agbu.android.lesson2;

public class homework_2_2 {
    public static void main(String[] args) {

        /* 221. Կազմել բլոկ-սխեմա և ծրագիր, որնք կհաշվեն և կտմեն տրված n տարրեր պարունակող միաչափ զանգվածի
         * տրված [a; b] միջակայքին պատկանող տարրերի գումարը */

        int a = 0;
        int b = 5;
        int[] intArray = {1, 6, 5, 8, 9, 5};
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += intArray[i];

        }
        System.out.println("221: " + sum);

        /* 222. Կազմել բլոկ-սխեմա և ծրագիր, որնք կհաշվեն և կտմեն տրված n տարրեր պարունակող միաչափ զանգվածի
         * տրված [c; d] միջակայքին պատկանող տարրերի արտադրյալը */

        //int[] intArray = {1, 6, 5, 8, 9, 5};

        int c = 1;
        int d = 3;
        int product = 1;

        for (int i = c; i < d; ++i) {
            product *= intArray[i];
        }
        System.out.println("222: " + product);


        /* 223. Կազմել բլոկ-սխեմա և ծրագիր, որնք կհաշվեն և կտմեն տրված n տարրեր պարունակող միաչափ զանգվածի
         * տրված [a; b] միջակայքին պատկանող տարրերի քանակը */

//        int[] intArray = {1, 6, 5, 8, 9, 5};

        int a1 = 1;
        int b2 = 5;
        int count1 = 0;

        for (int i = 0; i < intArray.length; ++i) {
            if (i > a1 && i < b2) {
                count1++;
            }
        }

        System.out.println("222: " + count1);


        /* 224. Կազմել բլոկ-սխեմա և ծրագիր, որնք կհաշվեն և կտմեն տրված n տարրեր պարունակող միաչափ զանգվածի
         * այն տարրերի խորանարդերի գումարը, որոնք բացարձակ
         արժեքով փոքր են տրված k թվից։ */

        //int[] intArray = {1, 6, 5, 8, 9, 5};

        int k = 511;
        int cube_var;
        int sum_cube = 0;

        for (int i = 0; i < intArray.length; i++) {
            cube_var = cube(intArray[i]);
            if (Math.abs(cube_var) < k ) {
                sum_cube += cube_var;
            }
        }
        System.out.println("224: " + sum_cube);

        /* 225. Կազմել բլոկ-սխեմա և ծրագիր, որնք կհաշվեն և կտմեն տրված n տարրեր պարունակող միաչափ զանգվածի
         * այն տարրերի արտադրյալը, որոնք բացարձակ
         արժեքով փոքր են տրված t թվից։ */

        //int[] intArray = {1, 6, 5, 8, 9, 5};

        int t = 6;
        int productArr = 1;

        for (int i = 0; i < intArray.length; i++) {
            if (Math.abs(intArray[i]) < t) {
                productArr *= intArray[i];
            }
        }
        System.out.println("225: " + productArr);

        /* 226. Կազմել բլոկ-սխեմա և ծրագիր, որնք կհաշվեն և կտմեն տրված n տարրեր պարունակող միաչափ զանգվածի
         * այն տարրերի քանակը, որոնք բացարձակ
         արժեքով փոքր են տրված k թվից։ */

        //int[] intArray = {1, 6, 5, 8, 9, 5};

//        int k1 = 7;
//
//        for (int i = 0; i < intArray.length ;i++) {
//
//
//        }

        /* 227. Կազմել բլոկ-սխեմա և ծրագիր, որնք կհաշվեն և կտմեն տրված n տարրեր պարունակող միաչափ զանգվածի
         * այն տարրերի միջին թվաբանականը, որոնց ինդեքսը
         բազմապատիկ է տրված k ամբողջ թվին։ */

        int k1 = 4;
        int count = 0;
        float sum1 = 0;

        for (int i = 1; i < intArray.length; i++) {
            if (i % k1 ==0){
                sum1 += intArray[i];
               count ++;
            }

        }
        float average = sum1/count;
        System.out.println("227: " + average);

        /* 228. Կազմել բլոկ-սխեմա և ծրագիր, որնք կհաշվեն և կտմեն տրված n տարրեր պարունակող միաչափ զանգվածի
         * այն տարրերի գումարը, որոնց ինդեքսը
         առանց մնացորդի բաժանվում տրված k ամբողջ թվի վրա։ */



        int k3 = 2;
        int sum2 = 0;

        for (int i = 1; i < intArray.length; i++) {
            if (i % k3 == 0){
                sum2 += i;

            }
        }

        System.out.println("228: " + sum2);

        /* 229. Կազմել բլոկ-սխեմա և ծրագիր, որնք կհաշվեն և կտմեն տրված n տարրեր պարունակող միաչափ զանգվածի
         * այն տարրերի արտադրյալը, որոնց արժեքի և ինդեքսի
         տարբերությունը դրական թիվ է։ */

//        int k1 = 4;
//        int count = 0;
//        float sum1 = 0;
        int product1 = 1;

        for (int i = 1; i < intArray.length; i++) {
            if (i % k1 ==0){
                sum1 += intArray[i];
                count ++;
            }
            if (intArray[i] - i > 0) {
                product1 *= intArray[i];
            }

        }
//        float average = sum1/count;
        System.out.println("229: " + product1);

        /* 230. Կազմել բլոկ-սխեմա և ծրագիր, որնք կհաշվեն և կտմեն տրված n տարրեր պարունակող միաչափ զանգվածի
         * այն տարրերի միջին քառակուսայինը, որոնց ամբողջ մասը
         բազմապատիկ է տրված k ամբողջ թվին։ */

        double[] doubleArray = {1.2, 6.5, 5.4, 8.6, 9.9, 5.0};
        int count4 = 0;
        int sum3 = 0;

        for (double l : doubleArray) {
            int x = (int) l;
            if (x % k1 == 0) {
                count4++;
                sum3 += l*l;

            }

        }
        int resulte1 = (int) Math.sqrt(sum3 / count1);

        System.out.println("230: " + resulte1);
    }
    static int cube (int a) {
        return a*a*a;
    }
}
