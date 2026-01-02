

import java.util.Scanner;

public class P007_Words {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String input = sc.next();
            int count = 0;
            int n = input.length();
            for(char c:input.toCharArray()){
                if(c<=90) count++;
            }
            // System.out.println("Total Length:"+n+" Total UpperCase:"+count);
            if(count>n/2) System.out.println(input.toUpperCase());
            else System.out.println(input.toLowerCase());
        }
    }
    
}
