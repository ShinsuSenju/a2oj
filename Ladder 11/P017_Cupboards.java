

import java.util.Scanner;

public class P017_Cupboards{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[][] arr = new int[n][2];
            for(int i=0;i<n;i++){
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            int left0=0,left1=0;
            int right0=0,right1=0;
            for(int[] i:arr){
                if(i[0]==1) left1++;
                else left0++;
                if(i[1]==1) right1++;
                else right0++;
            }
            int countLeft = left0>left1?left1:left0;
            int countRight = right0>right1?right1:right0;
            System.out.println(countLeft+countRight);
        }
    }
}