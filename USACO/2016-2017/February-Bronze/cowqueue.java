import java.io.*;
import java.util.*;

public class cowqueue {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("cowqueue.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowqueue.out")));
        StringTokenizer st = new StringTokenizer(in.readLine());

        TreeMap<Integer, Integer> cows = new TreeMap<Integer, Integer>(); 
        int n = Integer.parseInt(st.nextToken());
        int total = 0;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            int arrival = Integer.parseInt(st.nextToken());
            int processing = Integer.parseInt(st.nextToken());
            if(cows.get(arrival) != null) {
                total += processing;
            }
            else cows.put(arrival, processing);
        }
        //out.println(total);
        //out.println(cows.keySet());
        boolean first = true;
        for(int cow : cows.keySet()) {
            if(first) {
                total += cow;
                first = false;
            }
            if(!first && cow > total) total += (cow - total);
            total += cows.get(cow); 
            //out.println(cow + " " + total);
        }
        out.print(total);
        out.close();
    }
}