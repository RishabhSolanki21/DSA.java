package Java.dsa;
abstract class shape2d{
    abstract void resize();
    abstract void draw();
}
class circles extends shape2d{
   void resize(){
        System.out.println("increase the radius");
    }
    void draw(){
        System.out.println("draw the circle");
    }
        }
public class abstractque1 {
    public static void main(String[] args) {
        circles c=new circles();
        c.draw();
    }
}
