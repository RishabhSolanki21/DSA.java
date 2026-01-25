package Java.dsa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class hashmap<K,V> {
    ArrayList<LinkedList<Entity>>col;
    LinkedList<Entity> entity;
    float loadF=0.5f;
    int size=0;
    hashmap() {
        col=new ArrayList<>();
        entity =new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            col.add(new LinkedList<>());
        }
    }
    void put(K key, V value) {
        int hash = Math.abs(key.hashCode() % 10);
        entity=col.get(hash);
        for (Entity entities:entity) {
            if (entities.k.equals(key)){
                entities.v=value;
                return;
            }
        }
        if (loadF<=(float) size/col.size()){
            rehash(col,col.size());
        }
        entity.add(new Entity<>(key,value));
        size++;
    }
    void rehash(ArrayList<LinkedList<Entity>>col,int size){
        for (int i = 0; i < size; i++) {
            col.add(new LinkedList<>());
        }
    }
    V get(K key){
        int hash = Math.abs(key.hashCode() % 10);
        V val=null;
        entity=col.get(hash);
        for (Entity ob:entity) {
            if (ob.k.equals(key)){
                val=(V) ob.v;
                break;
            }
        }
        return val;
    }
    V remove(K key){
        int hash = Math.abs(key.hashCode() % 10);
        entity=col.get(hash);
        V val=null;
        for (Entity object :entity) {
            if (object.k.equals(key)){
                val=(V) object.v;
                entity.remove(object);
                break;
            }
        }
        return val;
    }
    class Entity<K,V>{
        K k;
        V v;
     public Entity(K k,V v) {
         this.k = k;
         this.v = v;
     }
    }
    public static void main(String[] args) {
        hashmap<String,Integer>map=new hashmap<>();
        map.put("Rishabh",43);
        map.put("age",20);
        map.put("height",175);
        map.put("id",230043);
        map.put("number",7827);
        map.put("code",110046);
        map.put("weight",50);
        map.put("dob",2005);
        map.put("apocalypse",2012);
        map.remove("apocalypse");
        System.out.println(map.get("apocalypse"));
    }
}