package Java.dsa.Easy;

import Java.dsa.linkedList;
import org.w3c.dom.Node;

import java.util.List;

public class LinkedList {

    ListNode head;
    ListNode tail;
    int size=0;
    public class ListNode{
        int value;
        ListNode next;
        ListNode(int value){
            this.value=value;
        }
        ListNode(int value,ListNode next){
            this.value=value;
            this.next=next;
        }
    }
    public int display(){
        ListNode temp=head;
        while (temp.next!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.println(temp.value);
        return 0;
    }
    public void insertF(int item){
        ListNode node=new ListNode(item);
        node.next=head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size++;
    }
    public void iLast(int val){
        ListNode node=new ListNode(val);
        tail.next=node;
        tail=node;
    }
    public void makeCucle(){
        tail.next=head;
    }
    public boolean hasCycle(ListNode head) {
        ListNode node=head;
        if (head!=null&&head.next!=null&&head.next.next!=null){
            ListNode node2=node.next.next;
            while(node2!=null&&node2.next!=null){
                if (node==node2){
                    return true;
                }
                node=node.next;
                node2=node2.next.next;
            }
        }
        return false;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size=0;
        int size1=0;
        ListNode nodeA=head;
        ListNode nodeB=head;
        while(nodeA.next!=null){
            nodeA=nodeA.next;
            size++;
        }
        while(nodeB.next!=null){
            nodeB=nodeB.next;
            size1++;
        }
        nodeA=headA;
        nodeB=headB;
        if (size>size1){
            for (int i = 0; i < size-size1; i++) {
                nodeA=nodeA.next;
            }
        } else if (size1>size) {
            for (int i = 0; i < size1-size; i++) {
                nodeB=nodeB.next;
            }
        }
        while (nodeA!=null&&nodeB!=null){
            if (nodeA==nodeB){
                return nodeA;
            }
            nodeA=nodeA.next;
            nodeB=nodeB.next;
        }
        return null;
    }
    public int getDecimalValue(ListNode head) {
        ListNode node=head;
        int decimal=0;
        while(node!=null){
            decimal=decimal*2+ node.value;
            node=node.next;
        }
        return decimal;
    }
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode nodeM=head;
        int M=m-1;
        int N=n;
        while (nodeM!=null){
            ListNode nodeN=nodeM;
            if (M==0) {
                while (N >= 0&& nodeN!=null) {
                    N--;
                    nodeN = nodeN.next;
                }
                nodeM.next=nodeN;
                N=n;
                M=m;
            }
            else {
                M--;
                nodeM=nodeM.next;
            }
        }
        return head;
    }
        public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertF(10);
        list.insertF(9);
        list.insertF(8);
        list.insertF(7);
        list.insertF(6);
        list.insertF(5);
        list.insertF(4);
        list.insertF(3);
        list.insertF(2);
        list.insertF(1);
        System.out.println(list.deleteNodes(list.head,3,1));
        list.display();
    }
}
