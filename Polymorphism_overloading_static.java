class Addition{
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
}
public class Polymorphism_overloading_static {
    public static void main(String[] args) {
        Addition addw = new Addition();
        System.out.println(addw.add(23,3));

    }

}
