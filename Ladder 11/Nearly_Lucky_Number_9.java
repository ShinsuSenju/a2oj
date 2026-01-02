

import java.util.Scanner;

public class Nearly_Lucky_Number_9{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            long num = sc.nextLong();
            int count = 0;
            for(char c:String.valueOf(num).toCharArray()){
                if(c=='4'||c=='7'){
                    count++;
                }
            }
            if(count==4 || count == 7) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}