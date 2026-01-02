

import java.util.Arrays;
import java.util.Scanner;

public class Arrival_of_the_General_14 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            int min = Arrays.stream(arr).min().getAsInt();
            int max = Arrays.stream(arr).max().getAsInt();
            int min_Index = -1;
            int max_Index = -1;
            int swap1=0;
            int swap2=0;
            for(int i = 0;i<n;i++){
                if(arr[i]==min){
                    min_Index=i;
                }
            }
            for(int i = min_Index;i<n-1;i++){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1]=temp;
                swap1++;
            }

            for(int i=0;i<n;i++){
                if(arr[i]==max){
                    max_Index=i;
                    break;
                }
            }
            for(int i=max_Index;i>=1;i--){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1]=temp;
                swap2++;      
            }
            System.out.println(swap1+swap2);
            

            
            
            
        }
    }
    
}
