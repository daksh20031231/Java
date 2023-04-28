import java.util.*;
public class Vector_class_usage {
    public static void main(String[] args) {

//        CREATING A NEW VECTOR
       Vector<String> name =  new Vector<>();

//       ADDING VALUES TO A Vector
       name.add("DAKSH");
       name.add("SHUBHAM");
       name.add("RAMAN");

//       PRINTING WHOLE VECTOR
        System.out.println("VECTOR DAKSH CONTAINS: " + name );

//        REMOVING ELEMENT FROM THE Vector
        name.remove("DAKSH");
        System.out.println("NEW VECTOR IS " + name);

    }
}
