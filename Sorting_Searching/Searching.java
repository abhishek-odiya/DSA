package DSA.Sorting_Searching;

public class Searching {

    static int linear(int[] arr, int value){                    //Linear Search
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == value) {
                return i;
            }
        }
        return -1;
    }


    static int binary(int[] arr, int value, int low, int high) {          //Binary Search
        if(low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if(arr[mid] == value) {
            return mid;
        }
        else if (arr[mid] < value) {
            return binary(arr, value, mid+1, high);
        }
        else {
            return binary(arr, value,low, mid -1);
        }
    }


    public static void main(String[] args) {

//        int value = 8;
//        int[] array = {1,2,8,6,4,5,8,6,4};        //Linear search is applicable for Sorted and unsorted list
//        int result = linear(array, value);



        int value = 99;
        int[] array = {1,2,3,45,56,78,89,99,101,125};       //Binary Search only use sorted Array
        int result = binary(array, value, 0, array.length);


        if(result == -1) {
            System.out.println(value + " is not found");
        }
        else {
            System.out.println(value + " is found at index: " + result);
        }

    }
}
