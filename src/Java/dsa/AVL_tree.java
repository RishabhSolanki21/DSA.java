package Java.dsa;
public class AVL_tree {
    private class Node{
        Node left;
        Node right;
        int value;
        int height;
       private Node(int value){
           this.value=value;
       }
    }
    Node root;
    public void insert(int val){
       root=insert(root,val);
    }
    public Node insert(Node node,int val){
        if (node==null){
            node=new Node(val);
            return node;
        }
        if (node.value>val) {
            node.left = insert(node.left, val);
        }
        if (node.value<val) {
            node.right = insert(node.right, val);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
         return balancing(node);
    }
    private Node balancing(Node node) {
        if (height(node.left)-height(node.right)>1){
            if (height(node.left.left)-height(node.left.right)>0){
                return rightRotate(node);
            }
            if (height(node.left.right)-height(node.left.left)>0){
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if (height(node.right)-height(node.left)>1){
            if (height(node.right.right)-height(node.right.left)>0){
               return leftRotate(node);
            }
            if (height(node.right.left)-height(node.right.right)>0){
               node.right= rightRotate(node.right);
               return leftRotate(node);
            }
        }
        return node;
    }
    private Node leftRotate(Node node) {
        Node c=node;
        Node g=node.right;
        c.right=g.left;
        g.left=c;
        return g;
    }
    private Node rightRotate(Node node) {
        Node p=node;
        Node c=node.left;
        p.left=c.right;
        c.right=p;
        return c;
    }
    int height(Node node){
        if (node==null){
            return -1;
        }
        return node.height;
    }
    public  void display(){
        display(root,"root node ");
    }
    public void display(Node node,String indent){
        if (node==null){
            return;
        }
        System.out.println(indent+ node.value);
        display(node.left,"left of "+node.value+"-->");
        display(node.right,"right of "+node.value+"-->");
    }
    public void array(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
    }
    public static void main(String[] args) {
        AVL_tree avlTree=new AVL_tree();
        int[] arr={45,456,12,44,63,11,10,18,100,49,88};
        for (int i = 0; i < arr.length; i++) {
            avlTree.insert(arr[i]);
        }
    }
}
