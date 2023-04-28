public class Patterns2_java {
    public static void main(String[] args){

//        RIGHT TRIANGLE FROM RIGHT

        for(int i = 0 ; i<=5 ; i++){
            for (int j = 2*(5-i); j>=0;  j--){
                System.out.print(" ");
            }
            for(int k= 0 ; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

//        RIGHT TRIANGLE REVERSE FROM RIGHT
        for(int i = 5-1 ; i>=0 ; i--){
            for (int j = 2*(5-i); j>=0;  j--){
                System.out.print(" ");
            }
            for(int k= 0 ; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
