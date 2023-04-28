import java.util.*;
public class module_one_pq_one{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER UR NAME: ");
        String name = sc.next();
        int nis = name.length();
        if(nis%2==1){
            System.out.println("\"O\" is added to string since its odd and now is even new name is: "+name+"O");
        }
        else{
            System.out.println("String is already even: "+ name);
        }
    }
}
