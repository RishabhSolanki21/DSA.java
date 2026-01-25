package Java.dsa;

public class N_Knight {
    public static void main(String[] args) {
        char[][]arr=new char[3][3];
        boolean[][]bool=new boolean[arr.length][arr.length];
        System.out.println(solve(arr,bool,0,0,1));
    }
    static int solve(char[][]arr,boolean[][]bool,int r,int c,int target){
        if (target==0){
            display(bool);
            return 1;
        }
        int ans=0;
        if (r== arr.length){
            return 1;
        }
        if (c== arr.length){
            solve(arr,bool, r+1,0 ,target);
            return 1;
        }
        if (is_Safe(bool,r, c)){
            arr[r][c]='N';
            bool[r][c]=true;
            ans+=solve(arr,bool, r,c +1,target-1);
            bool[r][c]=false;
        }
        ans+=solve(arr,bool, r,c+1,target);
        return ans;
    }
    static boolean is_Safe(boolean[][]bool,int r,int c){
        if (r-2>=0&&c-1>=0&&bool[r - 2][c - 1]){
            return false;
        }
        if (r-2>=0&&c+1< bool.length&&bool[r-2][c+1]){
            return false;
        }
        if (r-1>=0&&c-2>=0&&bool[r-1][c-2]){
            return false;
        }
        if (r-1>=0&&c+2< bool.length&&bool[r-1][c+2]){
            return false;
        }
        return true;
    }
    static void display(boolean[][]booleans){
        for (boolean[] bool:booleans) {
            for (boolean ele:bool){
                if (ele) {
                    System.out.print("N |");
                }
                else System.out.print("Z |");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
