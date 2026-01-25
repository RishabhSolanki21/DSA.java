package Java.dsa.Easy;

import java.util.HashMap;

public class P9 {

    public static boolean isPalindrome(int x) {
        if (x<0)return false;
        int z=x;
        int e = 0;
        while(z!=0){
            e=e*10+z%10;
            z/=10;
        }
        if (e==x){
            return true;
        }
        return false;
    }


    public static int romanToInt(String s,HashMap<Character,Integer> map) {
        int value=0;
        int prev=0;
        for (int i = s.length()-1; i>=0; i--) {
            char ch=s.charAt(i);
            int m=map.get(ch);
            if (m>=prev){
                value+=m;
            }
            else value-=m;
            prev=m;
        }
        return value;
    }

    public static void main(String[] args) {
        //System.out.println(isPalindrome(1000000001));
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        System.out.println(romanToInt("MCMXCIV",map));
    }
}
   /* Symbol       Value
I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000*/