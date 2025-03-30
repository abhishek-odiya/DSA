package DSA.Recursion;

public class recur_level2 {


//    Reverse an String
    static void reverse(String str, int inx){
        if(inx == 0){
            System.out.print(str.charAt(inx));
            return;
        }
        System.out.print(str.charAt(inx));
        reverse(str, inx - 1);
    }


//    Finding the first and last occurrence in the String

    static int first = -1;
    static int last = -1;

    static void occurre(String str, int index, char value){
        if(index == 0){
            System.out.println("index == 0");
            return;
        }

        char check = str.charAt(index);
        System.out.println("char: " + check) ;

        if(check == value){
            if(first == -1){
                first = index;
                System.out.println("First: " + first);
                occurre(str, first, value);
            }
            else {
                last = index;
                System.out.println("last: " + last);
                occurre(str, last, value);
            }
        }
//        System.out.println("First: " + first);
//        System.out.println("last: " + last);
    }


    public static void main(String[] args) {

//        String str = "abcd";
//        reverse(str, str.length() - 1);


        String str = "auhahauhahahuu";
        occurre(str, str.length() - 1, 'a');


    }
}
