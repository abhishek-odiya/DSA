package DSA.NumberTheory;
import java.util.Scanner;

public class prime {

    static boolean checkPrime(int n) {
        if(n <= 0){
            return false;
        }
        for(int j = 2; j < n; j++) {
            if(n % j == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number you want to check: ");
        int n = sc.nextInt();

//        int count = 0;
//        for(int i = 2; i <= n; i++) {
//            if (n % i == 0) {
//                count++;
//            }
//        }
//
//        if(count == 1) {
//            System.out.println(n + " is Prime Number");
//        }
//        else {
//            System.out.println(n + " is not Prime Number");
//        }


//            Using Method

        if(checkPrime(n)){
            System.out.println(n + " is Prime Number");
        }
        else{
            System.out.println(n + " is not Prime Number");
        }

    }
}
