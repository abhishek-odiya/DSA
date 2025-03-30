package DSA.Recursion;

//have to place the tiles in vertical and horizontal way

public class Tiles {

    public static int tile(int n, int m) {
        if(n == m) {
            return 2;
        }
        if(n < m){
            return 1;
        }

        int vertPlacements = tile(n-m, m);

        int horiPlacement = tile(n-1, m);

        return vertPlacements + horiPlacement;
    }

    public static void main(String[] args){

    int n = 4, m = 2;

        System.out.println(tile(n, m));

    }
}
