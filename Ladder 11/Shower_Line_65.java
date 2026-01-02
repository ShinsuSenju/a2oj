import java.util.*;

public class Shower_Line_65 {
    static int generateHappiness(int[][] mat, String s) {
        int[] temp = s.chars().map((c) -> (c - '0') - 1).toArray();
        int happiness = 0;

        happiness += mat[temp[0]][temp[1]] + 2 * mat[temp[2]][temp[3]] + mat[temp[1]][temp[2]]
                + 2 * mat[temp[3]][temp[4]];

        happiness += mat[temp[1]][temp[0]] + 2 * mat[temp[3]][temp[2]] + mat[temp[2]][temp[1]]
                + 2 * mat[temp[4]][temp[3]];

        return happiness;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[][] input = new int[5][5];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++)
                    input[i][j] = sc.nextInt();
            }

            String s = "12345";
            Set<String> allPermutations = new HashSet<>();
            generatePermutations(allPermutations, s, "");

            int maxHappiness = -1;
            for (String permutation : allPermutations) {
                int happiness = generateHappiness(input, permutation);
                if (happiness > maxHappiness)
                    maxHappiness = happiness;

            }
            System.out.println(maxHappiness);
        }

    }

    private static void generatePermutations(Set<String> allPermutations, String s, String temp) {
        if (s.isEmpty()) {
            allPermutations.add(temp);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String remaining = s.substring(0, i) + s.substring(i + 1);
            generatePermutations(allPermutations, remaining, temp + ch);
        }
    }
}