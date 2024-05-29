package code.dsa;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[]arr={989,0,77,-99,-9,-1,69};
        selection(arr);
            System.out.println(Arrays.toString(arr));
    }
   /* static void bubble(int[]arr){
        for (int n=0;n< arr.length;n++){
            for (int l=0;l<arr.length-n-1;l++){
                if (arr[l]>arr[l+1]){
                    int temp=arr[l];
                    arr[l]=arr[l+1];
                    arr[l+1]=temp;
                }
            }
        }
    }*/
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int first=0;
            int last= arr.length-i-1;
           int maxx= maximum(arr,0,last);
            sorted(arr,maxx,last);

        }
    }
     static int maximum(int[]arr,int f,int l){
        int max =f;
        for (int i = f; i <= l; i++) {
            if (arr[max]<arr[i])
                max=i;
        }
        return max;
    }
    public static void sorted(int[]arr,int f,int l){
        int temp=arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
    }
}
