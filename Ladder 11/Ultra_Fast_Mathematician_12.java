

import java.math.BigInteger;
import java.util.Scanner;

public class Ultra_Fast_Mathematician_12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input1 = sc.next();
            String input2 = sc.next();

            
            BigInteger b1 = new BigInteger(input1, 2);
            BigInteger b2 = new BigInteger(input2, 2);
            BigInteger xorResult = b1.xor(b2);
            String ans = xorResult.toString(2);

            while (ans.length() < input1.length()) {
                ans = "0" + ans;
            }
            System.out.println(ans);
        }
    }
}