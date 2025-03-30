package DSA.NumberTheory;

public class smallest_Element_unsorted_array {

    static int small(int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {

        int[] arr = {12,45,78,65,10,24,40,7,55};
        System.out.println(small(arr));
    }
}
