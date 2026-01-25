package Java.dsa;

public class arraySearch {

    public static void main(String[] args) {
        int[]array={0,1,2,3,5,7,9,11,22,33};
        int target=2;
       // int result=Linearsearch(56);
      //  System.out.println(result);
        //System.out.println(Binarysearch(2));
        int resultb=Binarysearch(array,target);
        if (resultb!=-1){
        System.out.println(resultb);}
        else System.out.println(resultb);
    }
   /* public  static int Linearsearch(int target){
        int[]array={12,2,3,23,45,67,88,90,32,56};
        for (int i=0;i<=array.length-1;i++){
            if (target==array[i]){
                return i;
            }
            else return -1;
        }
        return Linearsearch(target);
    }*/
    public  static int Binarysearch(int[]array,int target){
        int s=0;
        int l= array.length-1;
        while (s<=l){
            int mid=(s+l)/2;
            if (target==array[mid]){
                return mid;}
            if (target>array[mid]) {
               s=mid+1;
            }
            else if (target<array[mid]){
                l=mid-1;
            }
        }
        return -1;
    }
}