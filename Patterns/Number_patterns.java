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

    }


    public static void main(String[] args) {

        int m = 5;

//        halfPyramidWithNum(m);

//        invertedHalfPyramidWithNum(m);

//        floydTriangle(m);

        zeroOneTriangle(m);

    }
}
