package DSA.NumberTheory;

import java.util.Scanner;

public class change_chareInString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String res = "";

        int len = str.length();
        for(int i = 0; i < len; i++) {
            if(str.charAt(i) == 'i') {
                res += 'e';
            }
            else{
                res += str.charAt(i);
            }
        }

        System.out.println(res);

    }
}
