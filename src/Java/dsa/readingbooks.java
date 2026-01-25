package Java.dsa;

public class readingbooks {
    int[]pages=new int[5];
    String[]book=new String[5];
    int top=-1;
    public boolean push(String b,int p) throws StackOverflowError{
        if (isfull()){
            throw new StackOverflowError("STACK IS OVERFLOWING");
        }
        book[++top]=b;
        pages[top]=p;
        return true;
    }
    boolean isfull(){
         return top==pages.length-1;
    }
    boolean isempty(){
        return top<=0;
    }
    public String pop() {

        while (pages[top]>0){
            System.out.println("100 pages completed of "+book[top]);
            pages[top]-=100;
        }
        return book[top--];
    }

    public static void main(String[] args) {
        readingbooks r=new readingbooks();
        r.push("aot",100);
        r.push("jjk",200);
        r.push("solo leveling",200);
        r.push("erased",500);
        r.push("java",400);
       // r.push("c#",400);
        r.pop();
        r.pop();
        r.pop();
        r.pop();
        r.pop();
       // r.pop();


    }
}
