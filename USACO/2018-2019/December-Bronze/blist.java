import java.io.*;
import java.util.*;

public class blist {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("blist.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("blist.out")));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        Integer[] times = new Integer[1000];
        Arrays.fill(times, 0);
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int buckets = Integer.parseInt(st.nextToken());
            for(int j = start; j < end; j++) times[j] = times[j] + buckets;
        }
        out.println(Collections.max(Arrays.asList(times)));
        out.close();
    }
}