package Java.dsa;

public class EvenOrOdd {
    public static void main(String[] args) {
        int[]array={1,23,456,8769,474,44535};
        System.out.println("even-->" +e(array));
        System.out.println(digits2(98765));
        System.out.println(even(238));
    }
    static int e(int[]list){
        int value=0;
        for (int nums:list){
            if (even(nums)){
                value++;
            }
        }
        return value;
    }
    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    static int digits2(int num){
        return (int)(Math.log10(num))+1;

    }
    static boolean even(int numb){
        int noOfdigits=digits2(numb);
        return noOfdigits%2==0;
    }

}
