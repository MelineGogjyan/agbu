package com.agbu.android.lesson1;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {

        /* 152 Տպել բոլոր այն բնական թվերի արտադրյալը,
            որոնց վրա առանց մնացորդի բաժանվում է տրված n բնական թիվը */
        System.out.println("Enter number");

        int n = new Scanner(System.in).nextInt();
        int product = 1;

        for (int i = 1; i < 100; i++) {

            if (i % n == 0) {
                product *= i;
            }

        }
        System.out.println("152 result: " + product);

        /* 153 Տպել բոլոր այն բնական թվերի գումարը,
            որոնց վրա տրված n բնական թիվը բաժանելիս կմնա 2 մնացորդ */
        System.out.println("Enter number");
        int n1 = new  Scanner(System.in).nextInt();
        int product1 = 1;
        for (int i = 1; i < 100; i++) {

            if (i % n1 == 2) {
                product1 += i;
            }

        }
        System.out.println("153 result: " + product1);

        /* 154 Տպել բոլոր այն բնական թվերի արտադրյալը,
            որոնց վրա տրված n բնական թիվը բաժանելիս կմնա 3 մնացորդ */
        System.out.println("Enter number");
        int n2 = new  Scanner(System.in).nextInt();
        int product2 = 1;

        for (int i = 1; i < 100; i++) {

            if (i % n2 == 3) {
                product2 *= i;
            }

        }
        System.out.println("154 result: " + product2);

        /* 155 Տպել բոլոր այն երկնիշ թվերի գումարը,
            որոնք բազմապատիկ են 3 թվին */

        int product3 = 1;

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                if (i >= 10) {
                    product3 += i;
                }

            }
        }
        System.out.println("155 result: " + product3);

        /* 156 Տպել բոլոր այն երկնիշ թվերի արտադրյալը,
            որոնք բազմապատիկ են 3 և 5 թվերին */

        long product4 = 1;

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                if (i >= 10) {
                    product4 *= i;
                }
            }
        }
        System.out.println("156 result: " + product4);

        /* 157 Տպել բոլոր այն եռանիշ թվերի գումարը,
            որոնք բազմապատիկ չեն 5 թվին */

        int product5 = 1;

        for ( int i = 1; i < 1000 ; i++) {
            if (i % 5 != 0) {
                if (i >= 100) {
                    product5 += i;
                }

            }
        }
        System.out.println("157 result: " + product5);

        /* 158 Տպել բոլոր այն եռանիշ թվերի արտադրյալը,
            որոնք բազմապատիկ չեն 2 և 3 թվերին */

        long product6 = 1;

        for ( int i = 1; i < 1000 ; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                if (i >= 100) {
                    product6 *= i;
                }

            }
        }
        System.out.println("158 result: " + product6);

        /* 159 Տպել բոլոր այն եռանիշ թվերի արտադրյալը,
            որոնք 3-ի բաժանելիս կմնա 1 մնացորդ, իսկ 4-ի բաժանելիս՝ 2 մնացորդ */

        double product7 = 1;

        for ( int i = 1; i < 1000 ; i++) {
            if (i % 3 == 1 && i % 4 == 2) {
                if (i >= 100) {
                    product7 *= i;
                }

            }
        }
        System.out.println("159 result: " + product7);

//----------------------------------------------------------------------------
        /* 212 Կազմել բլոկ-սխեմա և ծրագիր, որնք կհաշվեն և կտմեն տրված n տարրեր պարունակող միաչափ զանգվածի
        * դրական տարրերի միջին քառակուսայինը */

        int[] array = {1, 2, -5, 56, -98, 78, 250};

        int sum = 0;
        int positiveCount = 0;

        for (int i : array) {
            if (i > 0) {
                sum += i*i;
                positiveCount++;
            }
        }


        System.out.println("212 result: " + (sum / positiveCount));

        /* 213 Կազմել բլոկ-սխեմա և ծրագիր, որնք կհաշվեն և կտմեն տրված n տարրեր պարունակող միաչափ զանգվածի
         * բացասական տարրերի միջին քառակուսայինը */

        // int[] array = {1, 2, -5, 56, -98, 78, 250};

        float sum1 = 0f;
        int negativeCount = 0;

        for (int i : array) {
            if (i < 0) {
                sum1 += i*i;
                negativeCount++;
            }
        }
         float average = sum1 / negativeCount;
        System.out.println("213 result: " + average);


        /* 214 Կազմել բլոկ-սխեմա և ծրագիր, որնք կհաշվեն և կտմեն տրված n տարրեր պարունակող միաչափ զանգվածի
         * բացասական տարրերի միջին թվաբանականը */

        // int[] array = {1, 2, -5, 56, -98, 78, 250};

        float sum2 = 0f;
        int negativeCount1 = 0;

        for (int i : array) {
            if (i < 0) {
                sum2 += i;
                negativeCount1++;

            }
        }
        float average1 = sum2 / negativeCount1;

        System.out.println("214 result: " + average1);

        /* 215 Կազմել բլոկ-սխեմա և ծրագիր, որնք կհաշվեն և կտմեն տրված n տարրեր պարունակող միաչափ զանգվածի
         * զույգ ինդեքս ունեցող տարրերի գումարը */

        // int[] array = {1, 2, -5, 56, -98, 78, 250};

        int sumIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && i != 0){
                sumIndex += array[i];
            }

        }
        System.out.println("215 result: " + sumIndex);

        /* 216 Կազմել բլոկ-սխեմա և ծրագիր, որնք կհաշվեն և կտմեն տրված n տարրեր պարունակող միաչափ զանգվածի
         * զույգ ինդեքս ունեցող տարրերի արտադրյալը */

        // int[] array = {1, 2, -5, 56, -98, 78, 250};

        int sumIndex1 = 1;

        for (int i = 1; i < array.length; i++) {
            if (i % 2 == 0){
                sumIndex1 *= array[i];
            }

        }
        System.out.println("216 result: " + sumIndex1);

        /* 217 Կազմել բլոկ-սխեմա և ծրագիր, որնք կհաշվեն և կտմեն տրված n տարրեր պարունակող միաչափ զանգվածի
         * կենտ ինդեքս ունեցող տարրերի քառակուսիների արտադրյալը */

        // int[] array = {1, 2, -5, 56, -98, 78, 250};

        int sumIndex2 = 1;

        for (int i = 0; i < array.length; i++){
            if (i % 2 != 0) {
                sumIndex2 *= array[i]*array[i];

            }
        }
        System.out.println("217 result: " + sumIndex2);

        /* 218 Կազմել բլոկ-սխեմա և ծրագիր, որնք կհաշվեն և կտմեն տրված n տարրեր պարունակող միաչափ զանգվածի
         * կենտ ինդեքս ունեցող տարրերի բացարձակ արժեքների գումարը */

        // int[] array = {1, 2, -5, 56, -98, 78, 250};

        int sum_index = 0;

        for (int i = 1; i < array.length; i++) {
            if (i % 2 != 0) {
                if (array[i] < 0) {
                    array[i] *= -1;
                }
                sum_index += array[i];
            }
        }
        System.out.println("218 result: " + sum_index);

        /* 219 Կազմել բլոկ-սխեմա և ծրագիր, որնք կհաշվեն և կտմեն տրված n տարրեր պարունակող միաչափ զանգվածի
         * տրված k թվին բազմապատիկ ինդեքս ունեցող տարրերի քանակը */

        // int[] array = {1, 2, -5, 56, -98, 78, 250};

        int k = 2;
        int arrayIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (i % k == 0 ) {
                arrayIndex++;
            }
        }
        System.out.println("219 result: " + arrayIndex);

        /* 220 Կազմել բլոկ-սխեմա և ծրագիր, որնք կհաշվեն և կտմեն տրված n տարրեր պարունակող միաչափ զանգվածի
         * դրական և բացասական թվերի քանակը */

        // int[] array = {1, 2, -5, 56, -98, 78, 250};

        int negativenumber = 0;
        int positivenumber = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 ) {
                positivenumber++;
            }
            if (array[i] < 0 ) {
                negativenumber++;
            }
        }
        System.out.println("220 result: ");
        System.out.println("Positive numbers - " + positivenumber);
        System.out.println("Negative numbers - " + negativenumber);

    }
}
