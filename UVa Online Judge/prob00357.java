import java.io.*;

public class prob00357 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String line = "";
        long[] dp = new long[300001];
        int[] coins = {1, 5, 10, 25, 50};
        dp[0] = 1;
        for(int i = 0; i < coins.length; i++) {
            for(int j = coins[i]; j < dp.length; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        while((line = in.readLine()) != null) {
            int val = Integer.parseInt(line);
            if(dp[val] == 1)
                out.println("There is only " + dp[val] + " way to produce " + val + " cents change.");
            else
                out.println("There are " + dp[val] + " ways to produce " + val + " cents change.");

        }
        out.close();
    }
}