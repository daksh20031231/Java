import java.util.*;
public class Stack_class_java {
    public static void main(String[] args) {

//        CREATING A NEW STACK
        Stack<Integer> daksh=new Stack<>();

//        PUSHING ELEMENTS INTO STACK
        daksh.push(10);
        daksh.push(23);
        daksh.push(130);
        daksh.push(223);

//        DISPLAYING THE STACK
        System.out.println("STACK: "+daksh);

//        REMOVING ELEMENTS FROM STACK
        int elen = daksh.pop();
        System.out.println("REMOVED ELEMENT: "+ elen );
        System.out.println("NEW STACK: " +daksh);

//        TOP ELEMENT IN STACK
        System.out.println("TOP ELEMENT OF STACK IS: " + daksh.peek());

//        FIND POSITION OF AN ELEMENT IN STACK
        System.out.println("POSITION OF 10 IN THE STACK IS: " + daksh.search(10));

//        CHECKING THE STACK IS EMPTY????
        System.out.println("THE STACK IS: "+ daksh.isEmpty());
    }
}
