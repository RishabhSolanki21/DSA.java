package Java.dsa;

import java.util.*;

public class Arraylists {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]array=new int[5];
        array[0]=8;
        array[1]=9;
        array[2]=78;
        array[3]=85;
        array[4]=80;
        System.out.println(Arrays.toString(array));
        for (int elements:array){
            System.out.print(elements+" ");}
        System.out.println();
        String[] array1={"rishabh","solanki","btech","cse"};
       /* for (int i=0;i<1;i++){
            array1[i]=sc.nextLine();
        }System.out.println(Arrays.toString(array1));*/
        //int[][]array2={{1,2,3},{0,9,8},{7,6,5}};
        int row=3;
        int col=3;
        int[][]array2=new int[row][col];
       /* for (int[]num:array2){
            System.out.println(num);
        }*/
       // int row= array2.length;
        for (int o=0;o<row;o++){
            for (int l=0;l< col;l++){
                System.out.print(array2[o][l]+" ");
            }
            System.out.println();

        }
    }
}
