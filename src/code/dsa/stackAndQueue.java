package code.dsa;

//import org.jetbrains.annotations.NotNull;

import java.util.*;

public class stackAndQueue {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(8);
        stack.push(6);
        stack.push(21);
        stack.push(95);
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.println(stack.pop());
        Queue<Integer> quest=new LinkedList<>();
        quest.add(0);
        quest.add(87);
        quest.add(77);
        quest.add(70);
        quest.add(100);
        quest.poll();
        quest.poll();
        System.out.println(quest.peek());
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(90);
        deque.add(99);
        deque.add(9099);
        deque.addLast(909);
        System.out.println(deque.poll());
        System.out.println(deque.pop());
    }
}
