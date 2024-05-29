package code.dsa;
interface Media{
    void start();
    void stop();
}
interface Engine{
    void start();
    void stop();
}
interface Brake{
    void start();
    void stop();
}
class Powerengine implements Engine{
   public void start(){
       System.out.println("start the car");
    }
   public void stop(){
       System.out.println("stop the car");
    }
}
class Electricengine implements Engine{
    public void start(){
        System.out.println("electric engine wiil  charge");
    }
    public void stop(){
        System.out.println("stop the electric car");
    }
}
class Mediaplayer implements Media{
    public void start(){
        System.out.println("start the music");
    }
    public void stop(){
        System.out.println("stop the music");
    }
}
class Braking implements Brake{
    public void start(){
        System.out.println("accelerate the car");
    }
    public void stop(){
        System.out.println("deaccelerate the car");
    }
}
class supercar{
    private Engine engine;
    private Media play=new Mediaplayer();
    public supercar(){
        engine=new Powerengine();
    }
    public supercar(Powerengine engine){
        this.engine=engine;
    }
    public void upgradeEngine(){
        this.engine=new Electricengine();
    }
    public void Estart(){
        engine.start();
    }
    public void Estop(){
        engine.stop();
    }
    public void startmusic(){
        play.start();
    }
    public void stopmusic(){
        play.stop();
    }
}
public class Interface {
    public static void main(String[] args) {
        supercar car=new supercar();
        car.Estart();
        car.startmusic();
        car.upgradeEngine();
        car.Estart();
        car.Estop();
    }
}
