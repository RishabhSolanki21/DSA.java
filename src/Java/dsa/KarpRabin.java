package Java.dsa;

public class KarpRabin {
    private final int PRIME=103;
    double hash(String str){
        double hash=0;
        for (int i = 0; i < str.length(); i++) {
            hash= hash+str.charAt(i)*Math.pow(PRIME,i);
        }
        return hash;
    }
     double update(double hash,char old,char newchar,int length){
        double newhash= (hash-old)/PRIME;
        newhash=newhash+newchar*Math.pow(PRIME,length-1);
        return newhash;
    }
     boolean search(String text,String pattern){
       double p=hash(pattern);
       double t=hash(text.substring(0,pattern.length()));
        for (int i = 0; i <text.length()-pattern.length() ; i++) {
            if (t==p){
                if (text.substring(i,i+pattern.length()).equals(pattern)){
                    return true;
                }
            }
            else {
               t= update(t,text.charAt(i),text.charAt(i+pattern.length()),pattern.length());
            }
        }
        return false;
    }
    public static void main(String[] args) {
       KarpRabin karpRabin=new KarpRabin();
       System.out.println(karpRabin.search("solarpowerplant","rishabh"));
    }
}
