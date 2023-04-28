import java.util.*;
public class Array_java {
    public static void main(String[] args) {

//        1-D Array

//        METHOD - 1

//        String[] name = {"DALSJ", "BALJEET"};
//        int i;
//        for (i = 0; i < name.length; i++) {
//        System.out.println(name[i]);}

//        METHOD - 2

//        String[] name = new String[2];
//        name[0]="DAKSH";
//        name[1]="SHARMA";
////        System.out.println(name[0]);
//        for(int i=name.length-1; i>=0; i--){
//            System.out.println(name[i]);
//        }

//        2-D Array

        int[][] numbers = {{2,3,33},{2,3,54}};
//        System.out.println(numbers[1][2]);

//        Accessing 2D array using for loop

//        RIGHT LOOP

//        for(int i=0;i<numbers.length;i++){
//            for(int j=0;j<numbers[i].length;j++){
//                System.out.println(numbers[i][j]);
//            }
//        }

//        REVERSE LOOP

        for(int i = numbers.length;i>=0;i--){
            for(int j = numbers.length;j>=0;j--) {
                System.out.println(numbers[i][j]);{
                }
            }
        }
    }
}
