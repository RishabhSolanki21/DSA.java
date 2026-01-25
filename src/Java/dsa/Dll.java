package Java.dsa;


public class Dll {
     Node head;
    Node tail;
    int size;
    private class Node{
        int value;
        Node next;
        Node prev;
        public Node(int value,Node next,Node prev) {
            this.value=value;
            this.next = next;
            this.prev=prev;
        }

        public Node(int value) {
            this.value = value;
        }
    }
    public void iFirst(int item){
        Node node=new Node(item);
        node.next=head;
        node.prev=null;
        if (head!=null){
            head.prev=node;
        }
        head=node;

    }
    public void ilast(int val){
        Node node=new Node(val);
        tail=head;
        while (tail.next!=null){
            tail=tail.next;
        }
       tail.next=node;
       node.prev=tail;
       // tail=node;
    }
    public void iANY(int val,int index){
        Node temp=head;
        if (index==0){
            iFirst(val);
        }
        for (int i =1; i <index; i++) {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next,temp.prev);
        node.next= temp.next;
        temp.next=node;
        node.prev=temp;
        if (node.next!=null) {
            node.next.prev = node;
        }
    }
    public void display(){
        Node node=head;
        tail=null;
        while (node!=null){
            System.out.print(node.value+"->");
            tail=node;
            node=node.next;
        }
        System.out.println("THE END");
        while (tail!=head.prev){
            System.out.print(tail.value+"->");
            tail=tail.prev;
        }System.out.println("START");
    }
    public static void main(String[] args) {
        Dll ll=new Dll();
        ll.iFirst(9);
        ll.iFirst(94);
        ll.iFirst(95);
        ll.iFirst(6);
        ll.ilast(1234);
        ll.iANY(102,4);
        ll.display();
    }
}