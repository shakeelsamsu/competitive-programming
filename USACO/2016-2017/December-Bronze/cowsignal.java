import java.io.*;
import java.util.*;

public class cowsignal {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("cowsignal.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowsignal.out")));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        for(int i = 0; i < m; i++) {
            String line = in.readLine();
            String temp = "";
            for(int j = 0; j < line.length(); j++) {
                for(int t = 0; t < k; t++) temp += line.substring(j, j + 1);
            }
            for(int j = 0; j < k; j++) out.println(temp);
        }
        out.close();
    }
}