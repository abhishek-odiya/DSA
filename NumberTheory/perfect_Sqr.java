package DSA.NumberTheory;

public class perfect_Sqr {


//    A Sunny Number is a number where if you add 1 to it, the result is a perfect square.
//            8 + 1 = 9  which is perfect squre of 3

    static int sqrt(int num) {
        for(int i = 2; i <= num; i++) {
            if(i * i == num ){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int n =  225;

        int result = sqrt(n);
        if(result == -1){
            System.out.println(n + " is not the perfect squere");
        }
        else {
            System.out.println(n + " is the perfect squere of: " + result);
        }

    }
}
