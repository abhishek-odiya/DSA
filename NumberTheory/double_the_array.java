package DSA.NumberTheory;

public class double_the_array {

//    LeetCode Question

    static void printArr(int[] arr) {
        System.out.print("Element inside the array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] doublee(int[] arr) {
        int[] ans = new int[2 * arr.length];

        for(int j = 0; j < arr.length; j++) {
            ans[j] = arr[j];
            ans[j + arr.length] = arr[j];
        }

        return ans;
    }


    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        printArr(a);
        int[] answer = doublee(a);
        System.out.println();
        printArr(answer);


    }
}
