package Java.dsa;

public class linkedList {
    Node head;
    Node tail;
    int size=0;
    private class Node{
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value,Node next) {
            this.value = value;
            this.next=next;
        }
    }
    public void iLast(int val){
        Node node=new Node(val);
        tail.next=node;
        tail=node;
    }
    public void dLast(){
        Node prev=head;
        while (prev.next!=tail) {
            prev = prev.next;
        }
           tail=prev;
        tail.next=null;
    }
    public void dAt(int index){
        if (index==0){
            dFirst();}
        if (index==size){
            dLast();
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    public void iAt(int index,int value){
        if (index==0){
            insertF(value);
            return;
        }
        if (index==size){
            iLast(value);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        System.out.println(index);
        Node node=new Node(value,temp.next);
        temp.next=node;
        temp=node;
    }

    public void insertF(int item){
        Node node=new Node(item);
       node.next=head;
       head=node;
       if (tail==null){
           tail=head;
       }
       size++;
    }
    public void dFirst(){
        head=head.next;
    }
    public int display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.println("END");
        return 0;
    }
    public static void main(String[] args) {
        linkedList l = new linkedList();
        l.insertF(9);
        l.insertF(7);
        l.insertF(4);
        l.insertF(1);
        l.insertF(11);
        l.iLast(99);
        l.iAt(0, 110);
        // l.dFirst();
        l.dLast();
        l.dAt(5);
        l.display();
    }

}