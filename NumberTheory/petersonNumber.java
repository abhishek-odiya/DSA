package DSA.NumberTheory;

public class petersonNumber {

//     145 = 5! + 4! + 1!
//             = 120 + 24 +1
//             = 145

    static boolean peterson(int n){
        int org = n;
        int fact = 1;
        int sum = 0;
        while (n > 0) {
            int num = n % 10;
            n = n / 10;
            for(int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            sum += fact;
            fact = 1;
        }
        if(sum == org){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        int n = 40585;
        if(peterson(n)){
            System.out.println("it's a Peterson Number");
        }
        else {
            System.out.println("it's Not a Peterson Number");
        }


//        int fact = 1;                 // Without Method
//        int sum = 0;
//        while (n > 0) {
//            int num = n % 10;
//            n = n/10;
//            System.out.println("value of num = " + num);
//            for(int i = 1; i <= num; i++) {
//                fact = fact * i;
//                System.out.println("fact = " + fact  + " value of i = " + i);
//            }
//             sum += fact;
//            fact = 1;
//        }
//        System.out.println("fact final: " + sum);


    }
}
