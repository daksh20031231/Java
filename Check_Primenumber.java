import java.sql.SQLOutput;
import java.util.Scanner;
public class Check_Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        int number =  sc.nextInt();
        int count = 0;
        for(int i = 1; i<=number; i++ ){
            if(number%i==0){
            count++;}
        }

        if(count==2){
            System.out.println("Its a PRIME NUMBER");
        }
        else {
            System.out.println("ITS NOT A PRIME NUMBER");
        }
    }
}
