package code.dsa;

public class circularqueue {
    protected int[]data;
    int end=0;
    int front=0;
    int size=0;
    public circularqueue(int size){
        this.data=new int[size];
    }
    public boolean isfull(){
        return size== data.length;
    }
    boolean isEmpty(){
        return size==0;
    }
    public boolean insert (int que){
        if (isfull()){
            return false;
        }
        data[end++]=que;
        end=end%data.length;
        size++;
        return true;
    }
    public int remove(){
        if (isEmpty()){
            System.out.println("there is no queue");
        }
        int removed=data[front++];
        front=front% data.length;
        size--;
        return removed;
    }
    int front() throws Exception{
        if (isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[front];
    }
    public void display(){
        if (isEmpty()){
            return;}
        int i=front;
        do {
            System.out.print(data[i]+"-->");
            i++;
            i%=data.length;
        }while (i != end);
            System.out.println("end");
        }

    public static void main(String[] args) throws Exception{
        circularqueue q=new circularqueue(5);
        q.insert(4);
        q.insert(40);
        q.insert(87);
        q.insert(1);
        q.insert(9);
        q.display();
        System.out.println(q.remove());
        q.insert(100);
        q.display();
    }
}
