package DSA.Recursion;

public class recur_level1 {


 // Print from 5 to 1
    static void print_5to1(int n){               // 1 to 5
        if(n == 0) {
            return;
        }
        System.out.print(n + " ");
        print_5to1(n-1);
    }


// Print from 1 to 5
    static void print_1to5(int n){
        if(n == 6) {
            return;
        }
        System.out.print(n + " ");
        print_1to5(n+1);
    }


// Sum of N Natural Number
    static void sumofnum(int i, int sum,  int n){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        System.out.println(sum + " Sum ki value");
        sum += i;
        sumofnum(i+1, sum, n);
    }


    //Factorial of a number
    public static int fact(int n){
        if(n < 0 || n == 1) {
            return 1;
        }
        return  n * fact(n-1);
    }


    //Fibonacci Sequence
    public static void fibo(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        fibo(b,c,n-1);
    }


//    Calculate power
    public static int calPower(int x, int n) {
        if(n == 0){     //base case 1
            return 1;
        }
        if(x == 0) {        //base case 2
            return 0;
        }
        int pownm1 = calPower(x,n-1);
        int pow = x * pownm1;
        return pow;
    }


//    Calculate power in logn
    public static int calculatePower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }

        // For Even Number
        if(n % 2 == 0){
            return calculatePower(x,n/2) * calculatePower(x, n/2);
        }
        //For odd Number
        else{
            return calculatePower(x,n/2) * calculatePower(x, n/2) * x;
        }
    }



    public static void main(String[] args) {

//        print_5to1(5);
//        System.out.println();
//        print_1to5(1);
//        sumofnum(1, 0,5);
//        System.out.println(fact(5));
        //Fibonacci
//        int a = 0, b = 1;
//        System.out.println(a);
//        System.out.println(b);
//        fibo(a,b,5);

//        System.out.println(calPower(2,5));

        System.out.println(calculatePower(2,5));

    }
}
