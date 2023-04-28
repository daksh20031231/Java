enum color{
    BLUE,RED,GREEN
}
public class enumeration_usage {
    public static void main(String[] args) {
           color nar = color.RED;

           switch (nar){
               case BLUE:
                   System.out.println("BLUE COLOR");
                   break;
               case RED:
                   System.out.println("RED COLOR");
                   break;
               case GREEN:
                   System.out.println("GREEN COLOR");
                   break;
           }

    }
}
