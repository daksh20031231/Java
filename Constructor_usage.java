public class Constructor_usage {
    String name;
    int age;

    public Constructor_usage(String name , int age){
        this.name =name;
        this.age = age;
    }

    public void display(){
        System.out.println("NAME: " + name);
        System.out.println("AGE: "+age);
    }

    public static void main(String[] args) {
        Constructor_usage na = new Constructor_usage("DAKSH" , 13);
        na.display();
    }
}
