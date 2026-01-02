import java.util.Scanner;

public class The_number_of_positions_51 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(Math.min(n-a,b+1));
            
        }
    }
    
}
