import java.util.Scanner;

public class P051_The_number_of_positions {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(Math.min(n-a,b+1));
            
        }
    }
    
}
