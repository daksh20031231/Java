import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_queue {
    public static void main(String[] args) {

//        Creating a priority class
        PriorityQueue<Integer> asd= new PriorityQueue<>();

//        adding values to queue
        asd.add(1);
        asd.add(2);
        asd.add(3);
        asd.add(4);
        asd.add(5);

//        Printing Whole queue
        System.out.println("PRINTING WHOLE QUEUE: " + asd);

//        REMOVING ELEMENT FROM QUEUE
        asd.remove(2);
        System.out.println("NEW QUEUE: "  + asd);

    }
}
