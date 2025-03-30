package DSA.Patterns;

public class Square {

//    rows -> outer loops
//    column -> inner loops

    static void squares() {

//        *  *  *  *
//        *  *  *  *
//        *  *  *  *
//        *  *  *  *

        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 4; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


    static void hollowSquare(int n, int m) {

//        *  *  *  *  *
//        *           *
//        *           *
//        *  *  *  *  *

        for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= m; j++) {
                    if ( i == 1 || j == 1 || j == m || i == n){
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
    }


    static void halfTriangleRev(int n) {

//        *  *  *  *
//        *  *  *
//        *  *
//        *

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


    static void halfTriangle(int n) {

//        *
//        *  *
//        *  *  *
//        *  *  *  *

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


    static void invertedHalfTriangle(int n){

//          *
//       *  *
//    *  *  *
// *  *  *  *

        // outer loop
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n -i; j++) {
                System.out.print("   ");
            }

            //inner loop -> start print
            for(int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

        int n = 4;
        int m = 5;

//        squares();

//        hollowSquare(n, m);

//        halfTriangleRev(n);

//        halfTriangle(n);

//        invertedHalfTriangle(n);

    }
}
