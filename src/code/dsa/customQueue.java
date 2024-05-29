package code.dsa;

public class customQueue {
    int front=-1;
    int rear=front;
    //protected static final int DEFAULT_SIZE=10;
    int[]queue=new int[6];
    customQueue(int size){
        int[]queue=new int[size];
    }
    boolean insert(int item){
        if (isfull()){
            System.out.println("queue is full");
        }
        //ptr++;
        queue[++rear]=item;
        return true;
    }
    int remove(){
        if (isEmpty()){
            System.out.println("there is no queue");
        }
        int removed=queue[0];
        for (int i=1;i< queue.length;i++){
            queue[i-1]=queue[i];
        }
        return removed;
        // return queue[++front];
    }
    int peek(){
        return queue[++front];
    }
    public boolean isEmpty(){
        return rear==-1;
    }
    boolean isfull(){
        return rear== queue.length;
    }

    public static void main(String[] args) {
        customQueue q=new customQueue(6);
        q.insert(8);
        q.insert(6);
        q.insert(21);
        q.insert(95);
        q.insert(1050);
        System.out.println(q.remove());
        q.insert(100);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
