

import java.util.Scanner;

public class P010_Stones_on_the_table {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            String input = sc.next();
            char prev = 0;
            int count = 0;
            for(char c:input.toCharArray()){
                if(prev==0){
                    prev=c;
                    continue;
                }
                if(c==prev){
                    count++;
                }
                else{
                    prev = c;
                    
                }
                
            }
            System.out.println(count);
            
        }
    }

    
}
