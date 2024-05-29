package code.dsa;

public class sorting {
    public static void main(String[] args) {
        //bubble sort--->
       /* int[] array = {9, 3, 45, 6, 8, 2, 1, 0, 7, 4};
        int temp = 0;
        System.out.println("before sorting");
        for (int num:array){
            System.out.print(num+" ");
        }
        System.out.println();
        int s = array.length;
        for (int i = 0; i < array.length-2 ; i++) {
            for (int j=0;j<array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }System.out.println("after sorting");
            for (int num:array){
                System.out.print(num+" ");}
       }
        System.out.println();
        System.out.println("after sorting ends");
        for (int num:array){
            System.out.print(num+" ");
        }*/
        //selection sort--->
       /* int[]array2={67,7,99,99,90,22,40,21,22,19};
        int tempo=0;
        int minIndex=-1;
        for (int p=0;p< array2.length-1;p++){
            for (int w=p+1;w< array2.length-1;w++){
                minIndex=p;
                if (array2[w]<array2[w+1]){
                    array2[minIndex]=array2[w];
                }
            }
        }
        for (int num:array2){
            System.out.print(num+" ");
        }*/
       // shifting sort-->
        int[]array3={67,9,0,90,22,40,21,19};
       // int tempo=0;
        //int h=0;
       // int key=0;
        int size= array3.length;
        for (int l=1;l<size; l++){
            int key=array3[l];
            int h=l-1;
            while (h>=0 && array3[h]>key){
                array3[h+1]=array3[h];
                h=h-1;
            }
            array3[h+1]=key;
        }
        for (int num:array3){
            System.out.print(num+" ");}
    }
}

