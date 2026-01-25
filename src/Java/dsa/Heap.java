package Java.dsa;
import java.util.ArrayList;
public class Heap<T extends Comparable<T>> {
    ArrayList<T>list;
    Heap(){
        list=new ArrayList<>();
    }
    int parent(int index){
        return (index-1)/2;
    }
    int left(int index){
        return (index*2)+1;
    }
    int right(int index){
        return (index*2)+2;
    }
    void insert(T value){
        list.add(value);
        uphead(list.indexOf(value));
    }
    private void uphead(int index) {
        if (index<1){
            return;
        }
        int p=parent(index);
        if (list.get(index).compareTo(list.get(p))<0){
            swap(p,index);
        }
        uphead(p);
    }
    public int size() {
        return list.size();
    }
    T remove1() throws Exception{
        if (list.isEmpty()){
            throw new Exception("can't remove from an empty list");
        }
        T temp=list.get(0);
        if (list.size()<=1){
            return list.remove(0);
        }
       list.set(0, list.remove(list.size()-1));
       downheap(0);
       return temp;
    }
    void downheap(int index){
        int tempI=index;
        int l=left(index);
        int r=right(index);
        if (l< list.size()&&list.get(tempI).compareTo(list.get(l))>0){
            tempI=l;
        }
        if (r<list.size()&&list.get(tempI).compareTo(list.get(r))>0){
            tempI=r;
        }
        if (tempI!=index){
            swap(index,tempI);
            downheap(tempI);
        }
    }
    void downheapMax(int index){
        if (index>= list.size()/2){
            return;
        }
        int tempI=index;
        int l=left(index);
        int r=right(index);
        if (l< list.size()&&list.get(tempI).compareTo(list.get(l))<0){
            tempI=l;
        }
        if (r<list.size()&&list.get(tempI).compareTo(list.get(r))<0){
            tempI=r;
        }
        if (tempI!=index){
            swap(index,tempI);
            downheapMax(tempI);
        }
    }
    void swap(int f,int s){
        T temp=list.get(f);
        list.set(f, list.get(s));
        list.set(s,temp);
    }
    ArrayList sort() throws Exception {
        ArrayList sortList=new ArrayList<>();
        while (!list.isEmpty()){
            sortList.add(remove1());
        }
        return sortList;
    }
    void heapify(ArrayList list1){
        list=new ArrayList<>(list1);
        for (int i = list.size()/2-1; i >=0; i--) {
            downheapMax(i);
        }
    }
    public String toString(){
        return ""+list+"";
    }
    public static void main(String[] args) throws Exception{
        Heap<String> heap=new Heap<>();
        String []arr={"rishabh","rishu","dsa","solanki","devlopment"};
        for (int i = 0; i <arr.length; i++) {
            heap.insert(arr[i]);
        }
        ArrayList<String>list1=new ArrayList<>();
        for (String element:arr){
            list1.add(element);
        }
        System.out.println(heap);
        heap.heapify(list1);
        System.out.println(heap);
        System.out.println(heap.sort());
    }
}
