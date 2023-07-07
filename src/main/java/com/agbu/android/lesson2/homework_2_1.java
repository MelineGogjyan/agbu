package com.agbu.android.lesson2;

public class homework_2_1 {
    public static void main(String[] args) {

        /* 161․ Տպել այն ամենափոքր քառանիշ թիվը, որը 26-ով բազմապատկելիս
         դառնում է բնական թվի քառակուսի */
        for (int i = 1000; i < 10000; i++) {
            int p = i * 26;
            double sqrt = Math.sqrt(p);
            int x = (int) sqrt;

            if (sqrt - x == 0.0) {
                System.out.println("161: " + i);
                break;
            }
        }


        /* 162․ Տպել այն ամենամեծ քառանիշ թիվը, որը 14-ով բազմապատկելիս
         դառնում է բնական թվի քառակուսի */

        for (int i = 10000; i > 1000; i--) {
            int p = i * 14;
            double sqrt = Math.sqrt(p);
            int x = (int) sqrt;

            if (sqrt - x == 0.0) {
                System.out.println("162: " + i);
                break;
            }
        }


        /* 163․ Տպել այն ամենամեծ քառանիշ թիվը, որը 18-ով բազմապատկելիս
         դառնում է բնական թվի քառակուսի */

        for (int i = 10000; i > 1000; i--) {
            int p = i * 18;
            double sqrt = Math.sqrt(p);
            int x = (int) sqrt;

            if (sqrt - x == 0.0) {
                System.out.println("163: " + i);
                break;
            }
        }

         /* 164․ Տպել այն ամենափոքր եռանիշ թիվը, որի քառակուսի արմատը մեծ է
            տրված n բնկան թվից */

        for (int i = 100; i < 1000; i++) {
            int n = 18;
            double p = Math.sqrt(i);
            int x = (int) p;

            if ( p - x == 0.0 && p > n ) {
                System.out.println("164: " + i);
                break;
            }

        }

        /* 165․ t տրամաբանական տիպի փոփոխականին կվերագրի true արժեքը, եթե տրված n
           բնական թիվը 3-ի աստիճան է, հակառակ դեպքում՝ false: Տպել t-ի արժեքը */

        boolean t = false;
        double n = 9;
        while ( n > 1) {
            n /= 3;
            if (n == 1) {
                t = true;
            }
        }
        System.out.println("165: " + t);

        /* 166․ y փոփոխականին վերագրել 0 արժեքը, եթե տրված n
          բնական թիվը 4-ի աստիճան չէ, հակառակ դեպքում՝ 1 արժեքը: Տպել y-ի արժեքը */

        int y = 0;
        int x = 44;
        while ( x > 1) {
            x %= 4;
            if (x != 0) {
                y = 0;
            } else {
                y = 1;
            }
        }
        System.out.println("166: " + y);


        /* 167․ y տրամաբանական տիպի փոփոխականին վերագրել true արժեքը, եթե  sin x^n (n = 1, 2, ..., 30)
        արտահայտության ընդունած արժեքների մեջ կա գոնե մեկ բացասական արժեք, հակառակ դեպքում false:
         Տպել y փոփոխականի արժեքը */


        boolean y1 = false;
        int n3 = 1;
        int x1 = 4;

        while (n3 < 30) {
            n3++;
            if (Math.round(Math.sin(Math.pow(x1, n3))) < 0) {
                y1 = true;
            }
        }
        System.out.println("167: " + y1);

        /* 168․ p տրամաբանական տիպի փոփոխականին վերագրել true արժեքը, եթե  n(n>1)
        թիվը պարզ է, հակառակ դեպքում false։ Տպել p փոփոխականի արժեքը */

        boolean p = true;
        int n4 = 10;

        if (((n4 % n4) == 0)  && (n4 % 2 != 0)) {
            System.out.println("168: " + p);
        }
        for ( int i = (n4 - 1); i> 1 ;--i) {
            if (n4 % i == 0) {
                p = false;
                break;
            }
        }
        System.out.println("168: " + p);



        /* 169․ Տրված են x և y բնական թվերը։ z փոփոխականին վերագրել 5 արժեքը,
        եթե (x+y) թիվը պարզ է, հակառակ դեպքում՝ 6 արժեքը։ Տպել z փոփոխականի արժեքը */

        int x2 = 3;
        int y2 = 10;
        int z = 5;
        int sum = x2 + y2;

        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                System.out.println("169: " + z);
                break;
            } else {
                z = 6;
                System.out.println("169: " + z);
                break;
            }
        }




        /* 170․ Տրված են N բնական թվերը։ Ստանալ և տպել n-ից մեծ այն
        * ամենափոքր թիվը, որը 2-ի աստիճանն է */

        int N = 5;

        for (int i = N; ;i++) {
            double x5 = Math.log10(i) / Math.log10(2);
            int X = (int) x5;
            if (x5 == X) {
                System.out.println("170: " + i);
                break;
            }

        }


    }


}

