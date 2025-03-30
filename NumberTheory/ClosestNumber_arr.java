package DSA.NumberTheory;

public class ClosestNumber_arr {

    static int smallest(int[] arr) {                            // Closest Number Manually
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length ; j++ ){
                if(Math.abs(arr[i]) > Math.abs(arr[j])) {
                    int temp = Math.abs(arr[i]);
                    arr[i] = Math.abs(arr[j]);
                    arr[j] = (temp);
                }
                else{
                   int a = Math.abs(arr[i]);
                   arr[i] = a;
                }
            }
        }
        return arr[0];
    }



    public static int findClosestToZero(int[] arr) {                // Closest Number
        int closest = arr[0];                             // Assume first element is closest

        for (int i = 1; i < arr.length; i++) {
            int absClosest = Math.abs(closest);
            int absCurrent = Math.abs(arr[i]);

            if (absCurrent < absClosest || (absCurrent == absClosest && arr[i] > closest)) {
                closest = arr[i];                       // Update the closest if new number is nearer
            }
        }

        return closest;
    }




    public static void main(String[] args) {
        int[] arr = {-100000,-100000};
        System.out.println(findClosestToZero(arr));
    }
}



