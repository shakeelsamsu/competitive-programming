import java.io.*;
import java.util.*;

public class square {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("square.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("square.out")));
        StringTokenizer st = new StringTokenizer(in.readLine());

        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        x.add(Integer.parseInt(st.nextToken()));
        y.add(Integer.parseInt(st.nextToken()));
        x.add(Integer.parseInt(st.nextToken()));
        y.add(Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(in.readLine());
        x.add(Integer.parseInt(st.nextToken()));
        y.add(Integer.parseInt(st.nextToken()));
        x.add(Integer.parseInt(st.nextToken()));
        y.add(Integer.parseInt(st.nextToken()));
        Collections.sort(x);
        Collections.sort(y);
        int max = Math.max(x.get(x.size() - 1) - x.get(0), y.get(y.size() - 1) - y.get(0));
        out.println(max * max);
        out.close();
    }
}