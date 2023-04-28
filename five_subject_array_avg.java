import java.util.Scanner;
import  java .util.Scanner.*;
public class five_subject_array_avg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] marks = new int[5];
        System.out.println("ENTER MARKS FOR FIVE SUBJECTS: ");
        for(int i=0; i < 5;i++){
            marks[i]= sc.nextInt();
            sum += marks[i];
        }
        double result = (double) sum / 5;
        System.out.println("THE AVG IS: " + result);
    }
}
