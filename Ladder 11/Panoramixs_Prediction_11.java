

import java.util.Arrays;
import java.util.Scanner;

public class Panoramixs_Prediction_11 {
    public static void main(String[] args) {
        int n,m;
        int[] prime = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};
        try(Scanner sc = new Scanner(System.in)){
            n = sc.nextInt();
            m = sc.nextInt();
            int i = Arrays.binarySearch(prime, n);
            int j = Arrays.binarySearch(prime,m);
            if(j==i+1) System.out.println("YES");
            else System.out.println("NO");   
        }
    }
    
    
}
