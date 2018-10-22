import java.io.*;
import java.util.*;

public class E {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("E.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            HashMap<Integer, Integer> coords = new HashMap<Integer, Integer>(); 
            ArrayList<Integer> xCoords = new ArrayList<Integer>();
            ArrayList<Integer> yCoords = new ArrayList<Integer>();
            st = new StringTokenizer(in.readLine());
            int t = Integer.parseInt(st.nextToken());
            for(int j = 0; j < t; j++) {
                st = new StringTokenizer(in.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                xCoords.add(x);
                yCoords.add(y);
            }
            Collections.reverse(xCoords);
            Collections.reverse(yCoords);
            out.println(calcArea(xCoords, yCoords));
        }
        out.close();
    }

    public static double calcArea(ArrayList<Integer> x, ArrayList<Integer> y) {
        double area = 0;
        for(int i = 0; i < x.size(); i++) {
            if(i == x.size() - 1) area += x.get(i) * y.get(0);
            else area += x.get(i) * y.get(i + 1);
        }
        for(int j = 0; j < y.size(); j++) {
            if(j == y.size() - 1) area -= y.get(j) * x.get(0);
            else area -= y.get(j) * x.get(j + 1);
        }
        return 0.5 * Math.abs(area);
    }
}