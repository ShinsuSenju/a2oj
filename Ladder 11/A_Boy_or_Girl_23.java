import java.util.HashSet;
import java.util.Scanner;

public class A_Boy_or_Girl_23 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String input = sc.nextLine();
            HashSet<Character> container= new HashSet<>();
            for(char c:input.toCharArray()){
                container.add(c);
            }
            if(container.size()%2==0) System.out.println("CHAT WITH HER!");
            else System.out.println("IGNORE HIM!");
        }
    }
    
}
