package code.dsa;

import java.util.Scanner;

public class binaryTrees {
    Node root;
    private class Node {
        Node left;
        Node right;
        int value;

        Node(int value) {
            this.value = value;
        }
    }
        public void populate(Scanner scanner){
            System.out.println("enter the root node");
            int val=scanner.nextInt();
            root=new Node(val);
            populate(scanner,root);
        }
        public  void populate(Scanner scanner,Node node){
            System.out.println("do u want to enter the left of "+node.value);
            boolean left=scanner.nextBoolean();
            if (left) {
                System.out.println("enter the left of " + node.value);
                int val = scanner.nextInt();
                node.left = new Node(val);
                populate(scanner, node.left);
            }
            System.out.println("do u want to enter the right "+node.value);
            boolean right=scanner.nextBoolean();
            if (right) {
                System.out.println("enter the right of " + node.value);
                int val = scanner.nextInt();
                node.right = new Node(val);
                populate(scanner, node.right);
            }
        }
        public void display(){
        display(this.root,"");
        }
        public void display(Node node,String indent){
        if (node==null){
            return;
        }
            System.out.println(indent+node.value);
        display(node.left,indent + "\t");
        display(node.right,indent + "\t");
        }

        public void prettyDisplay(){
        prettyDisplay(root,0);
        }
        public void prettyDisplay(Node node,int level){
        if (node==null){
            return;
        }
        prettyDisplay(node.right,level+1);
        if (level!=0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.print("|--->"+node.value);
        }
        else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left,level+1);
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        binaryTrees b=new binaryTrees();;
        b.populate(sc);
        b.prettyDisplay();
        b.display();
    }
}
