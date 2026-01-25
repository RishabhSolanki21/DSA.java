package Java.dsa;

public class sqrt_decomposition {
    public static void main(String[] args) {
        int[]arr={1,5,8,9,7,41,0,3,6,11,100};
        int i=(int) Math.sqrt(arr.length);
        int[]block=new int[i+1];
        int l=-1;
        for (int x=0;x< arr.length;x++){
            if (x%i==0){
                l++;
            }
            block[l]+=arr[x];
        }
        System.out.println(querySum(arr,block,3,11));
    }
    static int querySum(int[]arr,int[]block,int s,int e){
        int i=(int) Math.sqrt(arr.length);
        int ans=0;
        while (s%i!=0){
            ans+=arr[s];
            s++;
        }
        while (s%i==0&&s+i-1<=e||e==arr.length-1){
            if (s==e&&e==arr.length-1){
                ans+=block[s/i];
                break;
            }
            ans+=block[s/i];
            s+=i;
        }
        while (s<=e&&e!=arr.length-1){
            ans+=arr[s];
            s++;
        }
        return ans;
    }
}
