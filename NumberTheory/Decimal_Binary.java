package DSA.NumberTheory;

public class Decimal_Binary {

    static void convert(int n) {
        int[] binary = new int[100];

        int i = 0;
        while(n > 0) {
            binary[i] = n % 2;
            i++;
            n = n / 2;
        }

        for(int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j] + " ");
        }

    }

    public static void main(String[] args) {

        int num = 17;
        System.out.println("Decimal Value: " + num);
        System.out.print("Binary value: ");
        convert(num);


    }
}
