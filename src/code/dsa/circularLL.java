package code.dsa;

public class circularLL {
   Node head;
    Node tail;
    int size=0;
    private class Node{
      Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next=next;
        }
    }
    public void insert(int item){
        Node node=new Node(item);
        if (head == null) {
            head=node;
            tail=node;
        }
        tail.next=node;
        node.next=head;
        head=node;
    }
    public void insertLast(int item){
        Node node=new Node(item);
        if (head == null) {
            head=node;
            tail=node;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void delete(int item){
        Node node=head;
        if (head.value==item){
            head=head.next;
            tail.next=head;
        }
        do {
            Node j=node.next;
            if (j.value==item){
                node.next=j.next;
                break;
            }
            node=node.next;
        }
        while (node!=tail.next);
    }
    public void display(){
        Node node=head;
        do {
            System.out.print(node.value+"->");
            node=node.next;
        }
        while (node!=tail.next);
    }
    public static void main(String[] args) {
        circularLL l=new circularLL();
        l.insert(9);
        l.insert(945);
        l.insert(19);
        l.insert(100);
        l.insertLast(55);
        l.insertLast(105);
        l.delete(19);
        l.display();
    }
}
