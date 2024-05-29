package recursionProblems;

public class factorial {
    static int fact(int n){
        if (n<=1) {
            return 1;
        }
        return n*fact(n-1);
    }
    static void repeat(int n){
        if (n==1){
            System.out.println(1);
            return ;
        }
        System.out.println(n);
        repeat(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
        repeat(5);
    }
}
