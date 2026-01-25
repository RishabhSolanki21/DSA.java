package Java.dsa;


import java.util.Arrays;
import java.util.HashMap;

public class count_sort {
    public static void main(String[] args) {
        int[]arr={1,0, 5,6,8,1,3,2,4,3,7,6,2,4,2,1,3,8,2};
        sort(arr);
        sort2(arr);
    }
   static void sort(int []arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max,arr[i]);
        }
        int[]arr2=new int[max+1];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            index=arr[i];
            arr2[index]++;
        }
        index=0;
       for (int i = 0; i < arr2.length; i++) {

           while (arr2[i]>0){
               arr[index++]=i;
               arr2[i]--;
           }
       }
        System.out.println(Arrays.toString(arr));
    }
    static void sort2(int []arr){
        HashMap<Integer,Integer>hash=new HashMap<>();
        int max=Arrays.stream(arr).max().getAsInt();
        int min=Arrays.stream(arr).min().getAsInt();
        for (int i = 0; i < arr.length; i++) {
            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
        }
        int index=0;
        for (int i = min; i <=max; i++) {
            int j=hash.get(i);
            while (j>0){
                arr[index++]=i;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
