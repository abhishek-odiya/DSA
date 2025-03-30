package DSA.Recursion;

//how to find the number of boxes in 3X3 Matrix

public class count_matrix {

    public static int totalCount(int i, int j, int n, int m) {

        if(i == n || j == m) {
            return 0;
        }
        if(i == n - 1 && j == m - 1){
            return 1;
        }

//        move right
        int right = totalCount(i+1, j, n, m);

//        move downwards
        int down = totalCount(i, j + 1, n, m);
        return right + down;
    }


    public static void main(String[] args) {
        int n = 3, m = 3;

        int total = totalCount(0, 0, n, m);
        System.out.println(total);
    }
}
