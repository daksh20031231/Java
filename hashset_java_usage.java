import javax.lang.model.type.NoType;
import java.util.Collections;
import java.util.HashSet;

public class hashset_java_usage {
    public static void main(String[] args) {

//        CREATING A HASHSET
        HashSet<Integer> nu = new HashSet<>();

//        ADDING VALUES  TO HASHSSET
        nu.add(123);
        nu.add(142);
        nu.add(13);
        nu.add(234);
        nu.add(236);
        //        PRINTING SIZE OF HASHSET
        System.out.println("SIZE OF THE HASHSET IS: " + nu.size());

//        PRinting whole hashset
        System.out.println("VALUE OF WHOLE HASHSET is: " + nu);

//        CHECHING THAT THE VALUE CONTAINS BY HASHSET OR NoT
        System.out.println("CHECk THAT hASHSet Contains 123 or not if yes print 'true' else print 'FALSE': " + nu.contains(123));

//        Removing element from hashset
        nu.remove(142);
        System.out.println("VALUE OF WHOLE HASHSET is: " + nu);


    }
}
