package DSA.NumberTheory;

public class productOfNumber {

    static int product(int n) {
        int prod = 1;
        while(n > 0) {
            int digit = digit = n % 10;
            prod *= digit;
            n = n / 10;
        }
        return prod;
    }

    public static void main(String[] args){

        int n = 1234567;
        System.out.println("Product is: " + product(n));

    }
}
