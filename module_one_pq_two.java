import java.util.*;
public class module_one_pq_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER STRING WORDS: ");
        String str = sc.nextLine();
        int num = str.length();
        if(num>5) {
            System.out.println("Total number of words are: " + num);
            System.out.println("Original String: " + str);

//            REVERSING STRING
            String[] snak = str.split(" ");
            System.out.println(snak.length);
            for (int i = 0; i < snak.length; i++) {
//                System.out.println("REVESE STRING IS: " + snak[i] + " ");
                if (snak[i].length() > 5) {
                    char ch[] = snak[i].toCharArray();
                    String rev = "";
                    for (int j = ch.length - 1; j >= 0; j--) {
                        rev += ch[j];
                    }
                    System.out.println(rev);
                }
            }
        }



        else{
            System.out.println("ITS ALL RIGHT");
        }
    }

}


