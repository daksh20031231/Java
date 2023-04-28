import java.net.DatagramSocket;

class Bike{
    void run(){
        System.out.println("running");
    }
}

class Hero extends Bike {
    void run(){
        System.out.println("ONN petrol");
    }
}
public class Polymorphism_overriding_dynamic {
    public static void main(String[] args) {
        Bike na = new Hero();
        na.run();
    }
}
