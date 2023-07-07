package com.agbu.android.lesson2;

public class homework_4 {
    public static void main(String[] args) {

        /* 426․ Տրված են m ամբողջ թիվը և m x m չափի մատրից, որի տարրերը
        բնական թվեր են։ Կազմել բլոկ-սխեմա և ծրագիր, որոնք կհաշվեն և
        և կտպեն մատրից
        * օժանդակ անկյունագծից վերև գտնվող զույգ արժեք ունեցող
        տարրերի գումարը */

        int m = 3;

        int[][] matrix = new int[m][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++){
                matrix[i][j] = (i+1) * (j+1);
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++){
                if (matrix[i][j] % 2 == 0) {
                    if (i + j < m - 1) {
                        count += matrix[i][j];
                    }
                }

            }
        }

        System.out.println("426: " + count);

        /* 427․ Տրված են m ամբողջ թիվը և m x m չափի մատրից, որի տարրերը
        բնական թվեր են։ Կազմել բլոկ-սխեմա և ծրագիր, որոնք կհաշվեն և
        և կտպեն մատրից
        * օժանդակ անկյունագծից վերև կամ նրա վրա գտնվող այն տարրերի արտադրյալը,
         որոնք բազմապատիկ են տրված k ամբողջ թվին */

        int count1 = 1;
        int k = 3;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++){
                if (matrix[i][j] % k == 0) {
                    if (i + j <= m - 1) {
                        count1 *= matrix[i][j];
                    }
                }
            }
        }
        System.out.println("427: " + count1);

        /* 428․ Տրված են m ամբողջ թիվը և m x m չափի մատրից, որի տարրերը
        բնական թվեր են։ Կազմել բլոկ-սխեմա և ծրագիր, որոնք կհաշվեն և
        և կտպեն մատրից
        * օժանդակ անկյունագծից վերև կամ նրա վրա գտնվող զրո արժեք ունեցող
        տարրերի քանակը */

        int count2 = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++){
                if (matrix[i][j] == 0) {
                    if (i + j <= m - 1) {
                        count2++;
                    }
                }
            }
        }
        System.out.println("428: " + count2);

        /* 429․ Տրված են m ամբողջ թիվը և m x m չափի մատրից, որի տարրերը
        բնական թվեր են։ Կազմել բլոկ-սխեմա և ծրագիր, որոնք կհաշվեն և
        և կտպեն մատրից
        * գլխավոր անկյունագծից վերև կամ նրա վրա գտնվող այն տարրերի քանակը,
         որոնք 5 թվին բաժանելիս կմնա 2 մնացորդ */

        int count3 = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; i >= j; j++){
                if (matrix[i][j] % 5 == 2) {
                    count3++;
                }
            }
        }
        System.out.println("429: " + count3);

        /* 430․ Տրված են m ամբողջ թիվը և m x m չափի մատրից, որի տարրերը
        բնական թվեր են։ Կազմել բլոկ-սխեմա և ծրագիր, որոնք կհաշվեն և
        և կտպեն մատրից
        * գլխավոր անկյունագծից ներքև կամ նրա վրա գտնվող զույգ արժեք ունեցող
         տարրերի միջին թվաբանականը։ */

        int sum = 0;
        int count4 = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; i >= j; j++){
                if (matrix[i][j] % 2 == 0) {
                    sum += matrix[i][j];
                    count4++;
                }
            }
        }
        System.out.println("425: " + sum/count4);
    }
}
