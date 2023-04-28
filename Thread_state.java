public class Thread_state {
    public static void main(String[] args) {

//        Creating a new thread
        Thread t = new Thread();
        System.out.println("THE CURRENT THREAD STATE IS: " + t.getState());

        t.start();
        System.out.println("THE CURRENT THREAD STATE IS: " + t.getState());

        try{
            t.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("THE CURRENT THREAD STATE IS: " + t.getState());
    }
}
