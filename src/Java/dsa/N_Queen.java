package Java.dsa;

import java.util.Arrays;

public class N_Queen {
    public static void main(String[] args) {
        char[][]arr=new char[4][4];
        boolean[][]bool=new boolean[4][4];
        System.out.println(solve(arr,bool,0));
    }
    static int solve(char[][]arr,boolean[][]bool,int r){
        if (r== arr.length){
            display(bool);
            return 1;
        }
        int ans=0;
        for (int i = 0; i <arr[0].length; i++) {
            if (is_Safe(bool,r, i)){
                 arr[r][i]='Q';
                 bool[r][i]=true;
                 ans+=solve(arr,bool, r +1);
                 bool[r][i]=false;
            }
        }
        return ans;
    }
    static boolean is_Safe(boolean[][]bool,int r,int c){
        for (int i = c; i>=0; i--) {
             if (bool[r][i]){
                 return false;
             }
        }
        for (int i = r; i >=0; i--) {
            if (bool[i][c]){
                return false;
            }
        }
        int row=r;
        int col=c;
        //int Max=Math.min(r,c);
        while (row>=0&&col>=0){
            if (bool[row][col]){
                return false;
            }
            row--;
            col--;
        }
        row=r;
        col=c;
        while (row>=0&&col< bool.length){
            if (bool[row][col]){
                return false;
            }
            row--;
            col++;
        }

        return true;
    }
    static void display(boolean[][]booleans){
        for (boolean[] bool:booleans) {
            for (boolean ele:bool){
                if (ele) {
                    System.out.print("Q |");
                }
                else System.out.print("Z |");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
