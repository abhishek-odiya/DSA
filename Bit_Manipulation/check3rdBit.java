package DSA.Bit_Manipulation;

import java.util.Scanner;

public class check3rdBit {

    static void get_andBit(int pos, int n) {
        int num = 1 << pos;
        if((num & n) == 0) {
            System.out.println("zero");
        }
        else {
            System.out.println("one");
        }
    }


    static void set_orBit(int pos, int n) {
        int num = 1 << pos;
        System.out.println(num | n);
        if((num | n) == 0) {
            System.out.println("zero");
        }
        else {
            System.out.println("one");
        }
    }


    static void clear_andNot(int pos, int n) {
        int bitMask = 1<<pos;
        int notBitMasks = ~(bitMask);

        int newNum = notBitMasks & n;
        System.out.println(newNum);
    }


    public static void main(String[] args) {

        int pos = 1;
        int n = 5;  //0101 -> 0111 -> dec 7

//        get_andBit(bit, n);

//        set_orBit(pos, n);

//        clear_andNot(pos,n);


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to convert into 0/1: ");
        int oper = sc.nextInt();
        //oper = 1 : set, oper = 0 clear

        if(oper == 1){      // Convert into one
            // set oper
            int bitMask = 1 << pos;
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else {          // Have to convert in zero
            int bitMask = 1 << pos;
            int notBitMask = ~(bitMask);
            int newNumber = notBitMask & n;
            System.out.println(newNumber);
        }

    }
}
