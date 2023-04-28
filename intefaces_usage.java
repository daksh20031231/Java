interface Animal{
    public void animalSound();
    public void Sleep();
}

class Pig implements Animal{
    @Override
    public void animalSound() {
        System.out.println("WOO WOWOW OWOW ");
    }

    @Override
    public void Sleep() {
        System.out.println("zzzzz  z z z z z z z");
    }
}
public class intefaces_usage  {
    public static void main(String[] args) {
        Pig ne = new Pig();
        ne.animalSound();
        ne.Sleep();
    }
}
