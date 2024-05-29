package code.dsa;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.*;
 class Heap<T extends Comparable<T>>{
    private ArrayList<T> list;
    public Heap(){
        list=new ArrayList<>();
    }
    private void swap(int f,int s){
        T temp= list.get(f);
        list.set(f, list.get(s));
        list.set(s,temp);
    }
    private int parent(int index){
        return (index-1)/2;
    }
    private int left(int index){
        return (index*2)+1;
    }
    private int right(int index){
        return (index*2)+2;
    }
    public void insert(T item){
        list.add(item);
        upHeap(list.size()-1);
    }
    private void upHeap(int index){
       int p=parent(index);
        if (list.get(index).compareTo(list.get(p))<0){
            swap(p,index);
            upHeap(p);
        }
    }
    public T remove() throws Exception{
        if (list.isEmpty()) {
            throw new Exception("heap is empty!");
        }
        T temp= list.get(0);
        T last=list.remove(list.size()-1);
        if (!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }
        return temp;
    }
    private void downheap(int index){
        int min=index;
        int left=left(index);
        int right=right(index);
        if (left<list.size()&&list.get(min).compareTo(list.get(left))>0){
            min=left;
        }
        if (right<list.size()&&list.get(min).compareTo(list.get(right))>0){
            min=right;
        }
        if (min!=index) {
            swap(min, index);
            downheap(min);
        }
    }
    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> data=new ArrayList<>();
        while (!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }

    public static void main(String[] args)throws Exception {
       Heap<Character> heap= new Heap<>();
       heap.insert('i');
       heap.insert('r');
       heap.insert('p');
       heap.insert('a');
       heap.insert('j');
       heap.insert('x');
       heap.insert('z');
       heap.insert('m');
     //  System.out.println(heap.remove());
     //  System.out.println(heap.remove());
     //  System.out.println(heap.remove());
        System.out.println(heap.heapSort());


    }
}
