import java.util.Hashtable;
public class Hashtable_usage {
    public static void main(String[] args) {

//        Creating a hashtable
        Hashtable<Integer,String> name =new Hashtable<>();

//        Add values to hashtable
        name.put(1, "BIRDS");
        name.put(2, "ANIMALS");
        name.put(3, "LAND ANIMALS");
        name.put(4, "SKY ANIMALS");

//        Printing whole hashtable
        System.out.println("HASHTABLE VALUES WITH KEYS: " + name);

//        Printing all keys
        System.out.println("HASHTABLE ALL KEYS: " + name.keySet());

//        Printing all values of hashtable
        System.out.println("Hashtable all values: " + name.values());

//          Accesing throgh key
        System.out.println("VALUE WITH KEY 1 is: " + name.get(1));

//        Removing from hashtable
        String  n = name.remove(1);
        System.out.println("Key 1 with Value " + n + " is removed from hashtable");


    }
}
