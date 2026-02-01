package Java.dsa.Easy;

import java.math.MathContext;
import java.util.*;

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
    public static String longestCommonPrefix(String[] strs) {
        int len= strs.length;
        int minlen=Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            minlen=Math.min(minlen,strs[i].length());
        }
        StringBuilder s=new StringBuilder();
        int x=0;

        for (int j = 0; j <minlen ; j++) {
            int i=0;
            while (i<len-1){
            if (strs[i].charAt(j)==strs[i+1].charAt(j)){
                i++;
                }
            else {
                x+=1;
                break;
            }
            }
            if (x>0){
                break;
            }
            s.append(strs[i].charAt(j));
        }
        String str=s.toString();
        return str;
    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

        public static String addBinary(String a, String b) {
            StringBuilder result = new StringBuilder();
            int i = a.length() - 1;
            int j = b.length() - 1;
            int carry = 0;

            while (i >= 0 || j >= 0 || carry > 0) {
                int sum = carry;

                if (i >= 0) sum += a.charAt(i--) - '0';
                if (j >= 0) sum += b.charAt(j--) - '0';

                result.append(sum % 2);
                carry = sum / 2;
            }

            return result.reverse().toString();
        }

    public static int climbStairs(int n) {
        if (n <= 1) return 1;

        int prev1 = 1;
        int prev2 = 1;

        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

    public static List<List<Integer>> generate(int numRows) {
        int value =1;
        List<List<Integer>> list1=new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            List<Integer>list=new ArrayList<>(row);
            if (row==0){
                list.add(value);
                list1.add(list);
            }
            else {
                for (int col = 0; col <= row; col++) {
                    if (col==0||col==row){
                        list.add(1);
                    }
                    else {
                        value = list1.get(row - 1).get(col - 1) + list1.get(row - 1).get(col);
                        list.add(value);
                    }
                }
                list1.add(list);
            }

        }
        return list1;
    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>>list1=generate(rowIndex+1);
        return list1.get(rowIndex);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            int ascii=(int)target;
            if (ascii<(int) letters[i]) return letters[i];
        }
        return letters[0];
    }
    public static int mySqrt(int x) {
        int r=x;
        while(r*r>x){
            r=(r+(x/r))/2;
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
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