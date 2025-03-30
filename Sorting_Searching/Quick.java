package DSA.Sorting_Searching;

public class Quick {

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;

                int temp = arr[i];      //swapping
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;   //pivot index
    }

    static void quickSort(int[] arr, int low, int high){
        if(low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args){

        int[] arr = {5,7,8,6,1,4,2};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
