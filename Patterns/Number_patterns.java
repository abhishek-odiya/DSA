package DSA.Patterns;

public class Number_patterns {

    static void halfPyramidWithNum(int m) {

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    static void invertedHalfPyramidWithNum(int m){

//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1

        for(int i = m; i >= 1; i--){
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    static void floydTriangle(int m) {

//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

        int temp = 0;
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= i; j++) {
                temp++;
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }

    static void zeroOneTriangle(int m) {

//        1
//        0  1
//        1  0  1
//        0  1  0  1
//        1  0  1  0  1

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= i; j++) {
                int sum = i+j;                 // Check the sum is even or add
                if(sum % 2 == 0 ){
                    System.out.print(" 1 ");    //Even
                } else {                        //Odd
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }


    static void numberPyramid(int m){

//             1
//            2 2
//           3 3 3
//          4 4 4 4
//         5 5 5 5 5

        for (int i = 1; i <= m; i++) {
            //Spaces
            for(int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }

            //numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


    static void palindromic(int m) {
        //BOB -> same from both side

//            1
//           212
//          32123
//         4321234
//        543212345

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }

            //1st half numbers
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }

            //2nd half numbers
            for(int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void diamond(int m){

//            *
//           ***
//          *****
//         *******
//        *********
//        *********
//         *******
//          *****
//           ***
//            *

        //Upper half
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }

            //stars
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for(int i = m; i >= 1; i--){
            for(int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }

            //stars
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {

        int m = 5;

//        halfPyramidWithNum(m);

//        invertedHalfPyramidWithNum(m);

//        floydTriangle(m);

//        zeroOneTriangle(m);

//        numberPyramid(m);

//        palindromic(m);

        diamond(m);

    }
}
