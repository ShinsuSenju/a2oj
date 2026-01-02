
import java.util.Scanner;

public class Perfect_Permutation_13 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            if(n%2==1){
                System.out.println("-1");
                return;
            } 
            else{
                for(int i=1,j=2;i<n;i+=2,j+=2){
                    System.out.print(j+" "+i);
                    if(i!=n-1) System.out.print(" "); 
                }
            }
            
        }
    }
    
}
