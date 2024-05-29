package code.dsa;

import java.util.Arrays;

public class sorted2dSearch {
    public static void main(String[] args) {
        int[][]array={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        System.out.println(Arrays.toString(search(array,2)));
    }
    public static int[] search(int[][]arr,int target){
        int row=arr.length;
        int col= arr[0].length;
        int rstart=0;
        int rEnd=row-1;
       int cmid=col/2;
        while (rstart<rEnd-1){
            int rmid=rstart+(rEnd-rstart)/2;
            if (arr[rmid][cmid]==target){
                return new int[]{rmid,cmid};
            }
            if (arr[rmid][cmid]<target){
                rstart=rmid;
            }
            if (arr[rmid][cmid]>target){
                rEnd=rmid;
            }
        }
        //********
        if (arr[rstart][cmid]==target){
            return new int[]{rstart,cmid};
        }
        if (arr[rstart+1][cmid]==target){
            return new int[]{rstart+1,cmid};
        }
        //////////
        if (arr[rstart][cmid-1]>=target){
            return binary(arr, target, 0,cmid-1, rstart);
        }
        if (arr[rstart+1][cmid-1]>=target && arr[rstart+1][0]<=target){
            return binary(arr, target, 0,cmid-1, rstart+1);
        }
        if (arr[rstart][cmid+1]<=target && arr[rstart][col-1]>=target){
            return binary(arr, target, 0,col-1, rstart);
        }
        if (arr[rstart+1][cmid+1]<=target && arr[rstart+1][col-1]>=target){
            return binary(arr, target, 0,col-1, rstart+1);
        }
        return new int[]{-1,-1};
    }
    public static int[] binary(int[][]arr,int target,int cstart,int cEnd,int row){
       // cstart=0;
      //  cEnd= arr.length-1;
        while (cstart<=cEnd) {
            int cmid=cstart+(cEnd-cstart)/2;
            if (target == arr[row][cmid]){
                return new int[]{row, cmid};}
            if (target < arr[row][cmid]){
                cEnd=cmid-1;}
            if (target > arr[row][cmid]){
                cstart=cmid+1;}
        }
        return new int[]{-1,-1};
    }
}
