import java.io.*;

public class P080_Boys_and_Girls {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter pw = new BufferedWriter(new FileWriter("output.txt"));

        String[] parts = br.readLine().split(" ");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);

        StringBuilder sb = new StringBuilder();

        if (n > m) {
            sb.repeat("BG", m);
            sb.append("B".repeat(n - m));
        } else {
            sb.repeat("GB", n);
            sb.append("G".repeat(m - n));
        }
        pw.write(sb.toString());
        pw.close();
        br.close();

    }
}
