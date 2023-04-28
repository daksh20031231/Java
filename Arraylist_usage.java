import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist_usage {
    public static void main(String[] args) {

//        CREATING NEW ARRAYLIST
        List<Integer> name = new ArrayList<>();

//        ADDING VALUES TO ARRAY LIST
        name.add(10);
        name.add(20);
        name.add(5640);

//        PRINTING ARRAYLIST
        System.out.println("VALUES IN THE ARRAYLIST: " + name);

//        REMOVING ELEMENT FROM ARRAYLIST
        name.remove(0);
        System.out.println("NEW ARRAYLIST IS: " + name);
        name.add(23);
        System.out.println("VALUES IN THE ARRAYLIST: " + name);

//        SORTING ARRAYLIST
        Collections.sort(name);
        System.out.println("SORTED ARRAYLIST: " + name );
    }
}
