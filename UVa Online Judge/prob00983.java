import java.io.*;
import java.util.*;

public class prob00983 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        String line = "";
        while((line = in.readLine()) != null) {
            if(line.equals("")) {
                out.println();
                continue;
            }
            StringTokenizer st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[][] grid = new int[n][n];
            int[][] prefix = new int[n][n];
            for(int i = n - 1; i >= 0; i--) {
                int sum = 0;
                for(int j = 0; j < n; j++) {
                    grid[i][j] = Integer.parseInt(in.readLine());
                    sum += grid[i][j];
                    prefix[i][j] = sum;
                }
            }
            int total = 0;
            for(int i = n - 1; i >= m - 1; i--) {
                for(int j = m - 1; j < n; j++) {
                    int sum = 0;
                    for(int k = 0; k < m; k++) {
                        sum += j - m < 0 ? prefix[i - k][j] : prefix[i - k][j] - prefix[i - k][j - m];
                    }
                    total += sum;
                    out.println(sum);
                }
            }
            out.println(total);
        }
        out.close();
    }
}