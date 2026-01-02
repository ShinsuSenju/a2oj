import java.util.Scanner;

public class P025_Soft_Drinking {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int l = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int p = sc.nextInt();
            int nl = sc.nextInt();
            int np = sc.nextInt();
            int totalDrink = k*l/nl;
            int totalLime = c*d;
            int totalSalt = p/np;
            System.out.println(Math.min(Math.min(totalDrink,totalLime),totalSalt)/n);
            
        }
        
    }
    
}
