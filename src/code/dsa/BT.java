package code.dsa;
import org.w3c.dom.Node;

public class BT {
    private class Node{
        Node left;
        Node right;
        int value;
       private Node(int value){
           this.value=value;
       }
    }
    Node root;
    int[]array=new int[10];
    public void insert(int val){
       insert(root,val);
    }
    public Node insert(Node node,int val){
        if (node==null){
            node=new Node(val);
        }
        node.left=insert(node.left,val);
        node.right=insert(node.right,val);
        return node;
    }
    public  void display(){
        display(root,"");
    }
    public void display(Node node,String indent){
        if (node==null){
            return;
        }
        System.out.println(indent+ node.value);
        display(node.left,"--->");
        display(node.right,"--->");
    }
    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(Node node){
       if (node==null){
           return;
       }
        System.out.println(node.value);
       preOrder(node.left);
       preOrder(node.right);
    }
    public void array(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr={45,456,12,44,63,11,10,18,100,49,88};
        BT b=new BT();
        b.array(arr);
        b.display();
        b.preOrder();
    }
}
