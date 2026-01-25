package Java.dsa;

import java.util.Arrays;

public class Radix_sort {
    public static void main(String[] args) {
        int[]arr={29,15,297,2,893,11,104};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[]arr){
        int digits=(int) Math.log10(Arrays.stream(arr).max().getAsInt())+1;
        int exp=1;
        for (int i = 0; i < digits; i++) {
            count_sort(arr,exp);
            exp*=10;
        }
    }
    static void count_sort(int[]arr,int exp){
        int n=arr.length;
        int[]arr2=new int[n];
        int[]count=new int[10];
        for (int j : arr) {
            count[(j / exp) % 10]++;
        }
        System.out.println("count array for "+exp+":"+Arrays.toString(count));
        for (int i=1;i<10;i++){
            count[i]= count[i]+ count[i-1];
        }
        System.out.println("updated count array for "+exp+":"+Arrays.toString(count));
        for (int i = n-1; i >=0; i--) {
            arr2[count[arr[i]/exp %10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }
        System.out.println("arr2 array for "+exp+":"+Arrays.toString(arr2)+"\n");
        System.arraycopy(arr2,0,arr,0,n);
    }
}
