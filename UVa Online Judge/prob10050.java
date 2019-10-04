import java.io.*;
import java.util.*;

public class prob10050 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            boolean[] days = new boolean[n + 1];
            int p = Integer.parseInt(in.readLine());
            for(int i = 0; i < p; i++) {
                int h = Integer.parseInt(in.readLine());
                for(int j = 1; j <= n / h; j++) {
                    if(h * j % 7 != 6 && h * j % 7 != 0)
                        days[h * j] = true;
                }
            }
            int freq = 0;
            for(int i = 0; i < n + 1; i++) {
                if(days[i]) freq++;
            }
            out.println(freq);
        }
        out.close();
    }
}