package Java.dsa;

import java.util.Arrays;

public class search2d {
    public static void main(String[] args) {
        int[][] array = {{11,33,44},
                {55,66,77},
                {88,99,100}};
        System.out.println(Arrays.toString(search(array, 100)));

    }
    public static int[] search(int[][] arr, int target) {
        int f = 0;
        int l = arr.length - 1;
        while (f< arr.length && l>=0){
            if (arr[f][l] == target) {
                return new int[]{f,l};
            } else if (arr[f][l] < target) {
                f++;
            } else if (arr[f][l] > target) {
                l--;
            }
        }
        return new int[]{-1,-1} ;
    }
}
