import java.util.Scanner;

public class P032_Jzzhu_and_Children {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            int maxIndex = -1;
            int quotient = -1;
            for(int i=0;i<n;i++){
                int round = (arr[i]+m-1)/m;
                if(round>=quotient){
                    maxIndex = i;
                    quotient = round;
                }
            }
            System.out.println(maxIndex+1);            
        }
    }
    
}
