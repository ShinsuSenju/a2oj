

import java.util.Scanner;

public class P018_I_love_username {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            int maxEle = arr[0],minEle = arr[0];
            int performance = 0;
            for(int i:arr){
                if(i>maxEle){
                    performance++;
                    maxEle=i;
                }
                if(i<minEle){
                    performance++;
                    minEle = i;
                }
            }
            System.out.println(performance);
        }
    }
    
}
