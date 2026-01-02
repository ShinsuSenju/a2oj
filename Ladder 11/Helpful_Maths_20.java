
import java.util.Arrays;
import java.util.Scanner;

public class Helpful_Maths_20 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.next();

            String[] arr = input.split("\\+");

            int[] numbers = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                numbers[i] = Integer.parseInt(arr[i]);
            }

            Arrays.sort(numbers);

            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < numbers.length; i++) {
                ans.append(numbers[i]);
                if (i < numbers.length - 1)
                    ans.append('+');
            }

            System.out.println(ans);
        }
    }
}

// package ladder_11;

// import java.util.Arrays;
// import java.util.Scanner;

// public class Helpful_Maths_20 {
// public static void main(String[] args) {
// try (Scanner sc = new Scanner(System.in)) {
// String input = sc.next(); // e.g. "3+2+1"

// String result = Arrays.stream(input.split("\\+"))
// .mapToInt(Integer::parseInt)
// .sorted()
// .mapToObj(String::valueOf)
// .reduce((a, b) -> a + "+" + b)
// .orElse("");

// System.out.println(result);
// }
// }
// }
