package DSA.NumberTheory;
import java.util.Scanner;

public class Reverse_Digite {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        int org = num;
        int rev = 0;

        while(num > 0){
            rev = (10 * rev) + num % 10;
            num = num / 10;
        }


        System.out.println("Original Value: " + org);
        System.out.println("After Reverse: " + rev);

        //After reversing a number its Equal to the Original value then it is Palindrome
        if(org == rev) {
            System.out.println("it's Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }

    }
}
