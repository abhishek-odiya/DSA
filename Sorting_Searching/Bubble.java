package DSA.Sorting_Searching;

public class Bubble {

    static void bubble(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {

        int[] arr = {5,4,12,63,5,45,23,4,8};

        bubble(arr);

        for(int i : arr) {
            System.out.print(i + " ");
        }

    }
}
