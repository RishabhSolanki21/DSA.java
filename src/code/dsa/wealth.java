package code.dsa;

public class wealth {
    public static void main(String[] args) {
        int[][]accout={{1,2,3},{4,56,9},{76,9,-76}};
        System.out.println(value(accout));
    }
    static int value(int[][]money){
        int ans=Integer.MIN_VALUE;
        for (int cus[]:money){
            int max=0;
            for (int ban:cus){
                    max+=ban;
            }
            if (max>ans)
                ans=max;
        }
        return ans;
    }
}
