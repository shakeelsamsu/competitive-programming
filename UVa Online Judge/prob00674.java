import java.io.*;
import java.util.*;

public class prob00674 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        int[] coins = {1, 5, 10, 25, 50};

        String line = "";
        int[] dp = new int[7850];
        dp[0] = 1;
        for(int i = 0; i < coins.length; i++) {
            for(int j = coins[i]; j < dp.length; j++) {
                    dp[j] += dp[j - coins[i]];
            }
        }
        while((line = in.readLine()) != null) {
            out.println(dp[Integer.parseInt(line)]);
        }
        out.close();
    }
}