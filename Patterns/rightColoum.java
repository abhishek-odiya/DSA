package DSA.Patterns;

public class rightColoum {
    public static void main(String[] args) {

        int n = 5;

//        for (int i = 0; i <= n; i++) {                                     // *
//            for(int j = 0; j <= i-1; j++) {                                // * *
//                System.out.print(" *");                                    // * * *
//            }                                                              // * * * *
//            System.out.println();                                          // * * * * *
//        }


//        for(int i = 0; i <= n; i++) {                                      // * * * * *
//            for(int j = 0; j <= n; j++) {                                  // * * * * *
//                System.out.print("* ");                                    // * * * * *
//            }                                                              // * * * * *
//            System.out.println();
//        }


//        for(int i = 0; i <= n; i++) {                                        // * * * * * *
//            for(int j = i;  j <= n; j++) {                                   // * * * * *
//                System.out.print("* ");                                      // * * * *
//            }                                                                // * * *
//            System.out.println();                                            // * *
//        }                                                                    // *


        for(int i = n; i >= 0; --i) {
            for(int j = n; j >= i-1; --j){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
