

import java.util.Scanner;

public class P008_Word_Capitalization {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String input = sc.next();
            String ans=input;
            if(input.charAt(0)>90) ans = input.replaceFirst(input.charAt(0) + "", (char) (input.charAt(0) - 32) + "");
            System.out.println(ans);   
        }
        
    }
    
}
