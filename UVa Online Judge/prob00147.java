import java.io.*;
import java.util.*;

public class prob00147 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String line = "";
        int[] coins = {5, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000};
        long[] dp = new long[30001];
        dp[0] = 1;
        for(int i = 0; i < coins.length; i++) {
            for(int j = coins[i]; j < dp.length; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        while((line = in.readLine()) != null) {
            double x = Double.parseDouble(line);
            if(x == 0) break;
            int value = Integer.parseInt(line.replace(".", ""));
            out.println(String.format("%6.2f", x) + String.format("%17d", dp[value]));
        }
        out.close();
    }
}