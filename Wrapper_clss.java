public class Wrapper_clss {
    public static void main(String[] args) {
//        CONVERTING INTEGER TO INT
        Integer a =  new Integer(3);
        int i = a.intValue();    //converting Integer to int explicitly
        int j = a;               //Unboxing
        System.out.println(a+" "+i+" "+j);
    }

}
