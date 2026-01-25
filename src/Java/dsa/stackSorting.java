package Java.dsa;

import java.util.Stack;

public class stackSorting {
    public static void main(String[] args) {
        Stack<Integer> unsorted = new Stack<>();
        Stack<Integer> sorted = new Stack<>();
        int[] array = {55, 69, 78, 10, 23, 98, 100};
        for (int j : array) {
            unsorted.push(j);
        }
        System.out.println(unsorted);
        while (!unsorted.empty()){
            int temp=unsorted.pop();
            while (!sorted.empty()&&sorted.peek()>temp){
                unsorted.push(sorted.pop());
            }
            sorted.push(temp);
        }
        System.out.println(sorted);
    }

}
