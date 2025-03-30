package DSA.NumberTheory;
import java.util.Scanner;

public class Fact {

    static long fact(int n){
        if(n <= 0) {
            return 1;
        }
        else {
            return (n * fact(n-1));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        System.out.println("Fcatorial of " + n + " is: " + fact(n));

    }
}
