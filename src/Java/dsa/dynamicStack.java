package Java.dsa;

public class dynamicStack extends customStack{
        public dynamicStack(){
            super();
        }
        public dynamicStack(int size){
            super(size);
        }
        public boolean push(int item) {
            if (this.isFull()) {
                int[]temp=new int[arr.length*2];
                for(int i=0;i<arr.length-1;i++){
                    temp[i]=arr[i];
                }
                arr=temp;}
            return super.push(item);

        }
    }
    class sstacks{
        public static void main(String[] args) {
            dynamicStack stack=new dynamicStack(4);
            stack.push(8);
            stack.push(6);
            stack.push(21);
            stack.push(95);
            stack.push(105);
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }
    }

