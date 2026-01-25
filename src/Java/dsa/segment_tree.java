package Java.dsa;
public class segment_tree {
    private class Node{
        Node left;
        Node right;
        int start;
        int end;
        int value;
        private Node(int s,int e){
            this.start=s;
            this.end=e;
        }
    }
    Node root;
    public segment_tree(int[]arr){
        root=insert(arr,0,arr.length-1);
    }
    private Node insert(int[] arr, int i, int i1) {
        if (i==i1) {
            Node node1=new Node(i,i1);
            node1.value=arr[i];
            return node1;
        }
        Node node=new Node(i,i1);
        int mid = (i + i1) / 2;
            node.left = insert(arr, i, mid);
            node.right = insert(arr, mid + 1, i1);
            node.value= node.left.value+node.right.value;
        return node;
    }
    int QuerySum(int s,int e){
        return QuerySum(root,s,e);
    }
    int QuerySum(Node node,int s,int e){
        if (s<=node.start&&e>=node.end){
            return node.value;
        }
        if (s>node.end){
            return 0;
        }
        if (e<node.start){
            return 0;
        }
        int sum=QuerySum(node.left,s,e)+QuerySum(node.right,s,e);
        return sum;
    }
    int QueryMax(Node node){
        if (node.left==null&&node.right==null){
            return node.value;
        }
        return Math.max(QueryMax(node.left),QueryMax(node.right));
    }
    void replace(int[]arr,int data,int index){
        replace(root,arr,data,index);
    }
    int replace(Node node,int[]arr,int data,int index){
        if (node == null) { return 0; }
        if (node.start==index&&node.end==index){
            node.value=data;
            return node.value;
        }
        if (index>node.end||index<node.start){
            return node.value;
        }
        int left= replace(node.left,arr,data,index);
        int right=replace(node.right,arr,data,index);
        node.value=left+right;
        return node.value;
    }
    public static void main(String[] args) {
        int[]arr={9,8,0,2,5,6,4,1,7,10};
        segment_tree tree=new segment_tree(arr);
        System.out.println(tree.QuerySum(0,9));
        System.out.println(tree.QueryMax(tree.root));
        tree.replace(arr,55,4);
        System.out.println(tree.QueryMax(tree.root));
        System.out.println(tree.QuerySum(0,9));
    }
}
