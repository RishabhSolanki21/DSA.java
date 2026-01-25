package Java.dsa;

public class BST {
    private static class Node {
        Node left;
        Node right;
        int value;
        int height;

        Node(int value) {
            this.value = value;
        }
    }
        Node root;
        public  void insert(int value){
            root=insert(root,value);
        }
        private Node insert(Node node,int value){
            if (node==null){
                node= new Node(value);
                return node;
            }
            if (value< node.value){
                node.left=insert(node.left,value);
            }
            if (value> node.value){
               node.right= insert(node.right,value);
            }
            node.height=Math.max(height(node.left),height(node.right))+1;
            return node;
        }
        public void preorder(){
            System.out.print("preorder--->");
            preorder(root);
        }
        public void preorder(Node node){
            if (node==null){
                return;
            }
            System.out.print(node.value+" ");
            preorder(node.left);
            preorder(node.right);
        }
    public void postorder(){
        System.out.print("postorder--->");
        postorder(root);
    }
    public void postorder(Node node){
        if (node==null){
            return;
        }
        postorder(node.left);
         postorder(node.right);
        System.out.print(node.value+" ");
    }
    public void Inorder(){
        System.out.print("Inorder--->");
        Inorder(root);
    }
    public void Inorder(Node node){
        if (node==null){
            return;
        }
        Inorder(node.left);
        System.out.print(node.value+" ");
        Inorder(node.right);
    }
        public void multipart(int[] num){
            for (int i:num) {
                this.insert(i);
            }
        }
        public int height(Node node){
            if (node==null){
                return -1;
            }
            return node.height;
        }
        public void display(){
            display(this.root,"root node");
        }
        private void display(Node node,String details){
            if (node == null) {
                return;
            }
            System.out.println(details+" "+node.value);
            display(node.left,"left of "+node.value+" is :");
            display(node.right,"right of "+node.value+" is :");
        }
        public void balanced(){
            System.out.println(balanced(root));
        }
        private boolean balanced(Node node){
            if (node == null) {
                return  true;
            }
            return Math.abs(height(node.right)-height(node.left))<=1&& balanced(node.left) &&balanced(node.right);
        }
    public static void main(String[] args) {
        BST b=new BST();
        int[]numbs={90,100,95,105,102,83,80,85,84,70,-1,-20,-88,-100,-856};
        b.multipart(numbs);
        b.display();
        b.balanced();
        System.out.println(b.height(b.root));
        b.preorder();
        System.out.println();
        b.postorder();
        System.out.println();
        b.Inorder();
    }
}
