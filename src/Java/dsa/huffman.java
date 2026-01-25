package Java.dsa;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class huffman {
    HashMap<Character,String>encode;
    HashMap<String,Character>decode;
    class Node implements Comparable<Node>{
        Character data;
        Node left;
        Node right;
        int cost;
        Node(Character data,int cost){
            this.data=data;
            this.cost=cost;
            this.left=null;
            this.right=null;
        }
        @Override
        public int compareTo(Node node){
            return this.cost- node.cost;
        }
    }
    void count(StringBuilder message) throws Exception{
        HashMap<Character,Integer>map=new HashMap<>();
        for (int i = 0; i <message.length(); i++) {
            map.put(message.charAt(i),map.getOrDefault(message.charAt(i),0)+1);
        }
        Heap<Node> heap=new Heap<>();
        Set<Map.Entry<Character, Integer>>set=map.entrySet();
        for (Map.Entry<Character,Integer>entry:set){
            Node node=new Node(entry.getKey(), entry.getValue());
            heap.insert(node);
        }
        while (heap.size()!=1){
        Node f=heap.remove1();
        Node s=heap.remove1();
        heap.insert(join(f,s));
        }
        encode=new HashMap<>();
        decode=new HashMap<>();
        Node node=heap.remove1();
        StringBuilder sb=new StringBuilder();
        code(node,sb);
        System.out.println(encode);
        System.out.println(map);
    }
    void code(Node node,StringBuilder code){
        if (node==null){
            return;
        }
        if (node.right==null&&node.left==null){
            encode.put(node.data,code.toString());
            decode.put(code.toString(),node.data);
            return;
        }
        code(node.left,new StringBuilder(code).append(0));
        code(node.right,new StringBuilder(code).append(1));
    }
    Node join(Node f,Node s){
        Node newNode=new Node(null, f.cost+s.cost);
        newNode.left=f;
        newNode.right=s;
        return newNode;
    }
    String encoder(StringBuilder message){
        StringBuilder code= new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            code.append(encode.get(message.charAt(i)));
        }
        return code.toString();
    }
    String decoder(String code){
        StringBuilder message= new StringBuilder();
        StringBuilder KEY=new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            KEY.append(code.charAt(i));
           if (decode.containsKey(KEY.toString())){
               message.append(decode.get(KEY.toString()));
               KEY=new StringBuilder();
           }
        }
        return message.toString();
    }
    public static void main(String[] args) throws Exception{
        StringBuilder message=new StringBuilder();
        message.append("hii what's up ?");
        huffman man=new huffman();
        man.count(message);
        String output= man.encoder(message);
        System.out.println(output);
        System.out.println(man.decoder(output));
    }
}

