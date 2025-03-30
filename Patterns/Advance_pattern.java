package DSA.Patterns;

public class Advance_pattern {

    static void butterflyPattern(int m) {

//        *                          *
//        *  *                    *  *
//        *  *  *              *  *  *
//        *  *  *  *        *  *  *  *
//        *  *  *  *  *  *  *  *  *  *
//        *  *  *  *  *  *  *  *  *  *
//        *  *  *  *        *  *  *  *
//        *  *  *              *  *  *
//        *  *                    *  *
//        *                          *

        for(int i = 1; i <= m; i++){        // Inner loop
            for(int j = 1; j <= i; j++){        // Outer loop
                System.out.print(" * ");
            }
            int spaces = 2*(m-i);
            for(int j = 1; j <= spaces; j++) {  // For Space
                System.out.print("   ");
            }
            // 2nd part
            for(int j = 1; j <= i; j++) {       // Right triangle
                System.out.print(" * ");
            }
            System.out.println();
        }


        //Reverse the pattern

        for(int i = m; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(" * ");
            }
            int spaces = 2*(m-i);
            for(int j = 1; j <= spaces; j++) {
                System.out.print("   ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


    static void solidRhombus(int m){

        for(int i = 1; i <= m; i++) {

            //Spaces
            for(int j = 1; j <= m - i; j++) {
                System.out.print("    ");
            }

            //Stars
            for (int j = 1; j <= m; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int m = 5;

//        butterflyPattern(m);

        solidRhombus(m);

    }
}
