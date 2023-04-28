 class Outerclass{
     class Innerclass{
         void nam(){
            System.out.println("This is innner class");
        }
    }
}

public class Inner_class_java_usage {
    public static void main(String[] args) {
        Outerclass obj = new Outerclass();
        Outerclass.Innerclass name = obj.new Innerclass();
        name.nam();
    }
}
