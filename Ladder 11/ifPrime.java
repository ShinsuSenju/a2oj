

import java.util.Scanner;

public class ifPrime{
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            int num = sc.nextInt();
            if(num==2 || num ==3) {
                System.out.println("Prime");
                return;
            }
            
            for(int i=5;i<=Math.sqrt(num);i+=6){
                if(num%i==0 || (num+2)%i==0){
                    System.out.println("Prime");
                    return;
                }
            }
            System.out.println("Not Prime");
        }
        

    }
}