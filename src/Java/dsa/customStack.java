package Java.dsa;

import java.util.EmptyStackException;

class customStack {
    int pointer=-1;
    int[] arr;
    protected static final int DEFAULT_SIZE=10;
    public customStack(){
        this(DEFAULT_SIZE);
    }
    public customStack(int size){
        this.arr=new int[size];
    }
    public int pop()throws EmptyStackException{
     if (isEmpty()) {
     throw new EmptyStackException();
}
   return arr[pointer--];
}
    public boolean isEmpty(){
        return pointer==-1;
}
    public boolean push(int item) throws StackOverflowError{
    if (isFull()) {
    throw new StackOverflowError("stack is full");
}
       // pointer++;
        arr[++pointer]=item;
    return true;
}
public boolean isFull(){
        return pointer==arr.length-1;
}
}
class stacks{
    public static void main(String[] args) {
        customStack stack=new customStack(5);
        stack.push(8);
        stack.push(6);
        stack.push(21);
        stack.push(95);
        stack.push(105);
        stack.push(105);
        stack.push(55);
        stack.push(54);
        stack.push(58);
        stack.push(25);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}