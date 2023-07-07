package com.agbu.android.lesson2;


public class homework_3 {
    public static void main(String[] args) {
        /* 421․ Տտրված են m ամբողջ թիվը և m x m չափի մատրից, որի տարրերը
        բնական թվեր են։ Կազմել բլոկ-սխեմա և ծրագիր, որոնք կհաշվեն և
        և կտպեն մատրից
        * գլխավոր անկյունագծից ներքև գտնվող այն տարրերի քանակը, որոնք բազմապատիկ են
         տրված ամբողջ k թվին*/

        int m = 5;
        int k = 7;

        int[][] matrix = new int[m][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++){
                matrix[i][j] = (i+1) + (j+1);
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; i > j; j++){
                if (matrix[i][j] % k == 0) {
                    count++;
                }
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("421: " + count);


        /* 422․ Տտրված են m ամբողջ թիվը և m x m չափի մատրից, որի տարրերը
        բնական թվեր են։ Կազմել բլոկ-սխեմա և ծրագիր, որոնք կհաշվեն և
        և կտպեն մատրից
        * գլխավոր անկյունագծից ներքև գտնվող այն տարրերի միջին թվաբանականը ,
        որոնք բազմապատիկ են տրված ամբողջ 5 թվին */


        int sum = 0;
        int count1 = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; i > j; j++){
                if (matrix[i][j] % 5 == 0) {
                    sum += matrix[i][j];
                    count1++;
                }
            }
        }
        System.out.println("422: " + sum/count1);


        /* 423․ Տտրված են m ամբողջ թիվը և m x m չափի մատրից, որի տարրերը
        բնական թվեր են։ Կազմել բլոկ-սխեմա և ծրագիր, որոնք կհաշվեն և
        և կտպեն մատրից
        * գլխավոր անկյունագծից ներքև կամ նրա վրա գտնվող զույգ արժեք ունեցող
        տարրերի միջին քառակուսայինը */

        int sum1 = 0;
        int count2 = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; i >= j; j++){
                if (matrix[i][j] % 2 == 0) {
                    sum1 += matrix[i][j] * matrix[i][j];
                    count2++;
                }

            }
        }

        System.out.println("423: " + Math.round(Math.sqrt(sum1)));


        /* 424․ Տտրված են m ամբողջ թիվը և m x m չափի մատրից, որի տարրերը
        բնական թվեր են։ Կազմել բլոկ-սխեմա և ծրագիր, որոնք կհաշվեն և
        և կտպեն մատրից
        * գլխավոր անկյունագծից ներքև կամ նրա վրա գտնվող կենտ արժեք ունեցող
        տարրերի միջին թվաբանականը */

        int sum2 = 0;
        int count3 = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; i >= j; j++){
                if (matrix[i][j] % 2 != 0) {
                    sum2 += matrix[i][j];
                    count3++;
                }
            }
        }
        System.out.println("424: " + sum2/count3);

        /* 425․ Տտրված են m ամբողջ թիվը և m x m չափի մատրից, որի տարրերը
        բնական թվեր են։ Կազմել բլոկ-սխեմա և ծրագիր, որոնք կհաշվեն և
        և կտպեն մատրից
        * գլխավոր անկյունագծից ներքև գտնվող զույգ արժեք ունեցող
        տարրերի քանակը */

        int count4 = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; i > j; j++){
                if (matrix[i][j] % 2 == 0) {
                    count4++;
                }
            }
        }
        System.out.println("425: " + count4);
    }


}
