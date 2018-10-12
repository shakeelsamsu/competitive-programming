import java.util.*;
import java.io.*;

public class direction {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("direction.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        HashMap<String, Integer> directions = new HashMap<String, Integer>();
        directions.put("N", 90);
        directions.put("NE", 45);
        directions.put("E", 0);
        directions.put("NW", 135);
        directions.put("W", 180);
        directions.put("SW", 225);
        directions.put("S", 270);
        directions.put("SE", 315);

        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            int difference1 = Math.abs(directions.get(a) - directions.get(b));
            out.println(Math.min(difference1, (360 - difference1)));
        }
        out.close();
    }
}