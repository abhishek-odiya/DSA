package DSA.NumberTheory;
import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c;
        System.out.print("Enter the number of Series you want to print: ");
        int n = sc.nextInt();

        System.out.print(a + " " + b + " ");

        for(int i = 1; i <= n-2; i++) {
            c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }


    }
}
