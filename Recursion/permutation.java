package DSA.Recursion;

public class permutation {
    public static void printPermu(String str, String permu) {

        if(str.length() == 0) {
            System.out.print(permu + "  ");
            return;
        }

        for(int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
//            ABC -> BC
            String newStr = str.substring(0, i) + str.substring(i +1);
            printPermu(newStr, permu+currChar);

        }

    }

    public static void main(String[] args) {

        String str = "abc";
        printPermu(str, "");

    }
}
