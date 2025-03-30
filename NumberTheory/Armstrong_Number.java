package DSA.NumberTheory;

public class Armstrong_Number {

//    Input: 120
//    Output: No
//    Explanation: 120 is not a Armstrong number, 1*1*1 + 2*2*2 + 0*0*0 = 9

    static boolean arms(int n) {
        int number, org;
        number = org = n;
        int count = 0;

        while(n > 0) {          //Count, count the number of Digits
            n = n / 10;
            count++;
        }

        int sum = 0;
        int product = 1;

        while(number > 0){
            int last = number % 10;
            number = number / 10;


//            //Doing manually
//            for(int i = 1; i <= count; i++) {           //Here we multiply every digit according to there Number of count
//                product = product * last;
//            }
//            sum += product;         //Add all multiply values in sum
//            product = 1;



            //using a Math.pow library
            sum += (int) Math.pow(last, count);       //Above whole work in a sing;e line

        }

        if(sum == org) {           //it is equal to the sum or not
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int n = 1634;
        if(arms(n)) {
            System.out.println(n + " is an Armstrong Number");
        }
        else{
            System.out.println(n + " is not an Armstrong Number");
        }

    }
}
