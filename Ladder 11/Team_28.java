import java.util.Scanner;

public class Team_28 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[][] arr = new int[n][3];
            for(int i=0;i<n;i++){
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
                arr[i][2] = sc.nextInt();
            }
            int countProblems=0;
            for(int[] i : arr){
               int  count = 0;
                if(i[0]==1) count++;
                if(i[1]==1) count++;
                if(i[2]==1) count++;
                if(count>=2) countProblems++;
            }
            System.out.println(countProblems);
        }
    }
    
}
