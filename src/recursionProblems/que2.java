package recursionProblems;
//sum of array
public class que2 {
    static int sum(int[]arr,int n){
        if (n<=0)
            return 0;
      return   sum(arr,n-1)+arr[n-1];
    }
    public static void main(String[] args) {
        int[]arra={1,2,3,4,5,6,7};
        System.out.println(sum(arra,4));
    }
}
