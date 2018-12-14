import java.io.*;
import java.util.*;

public class reduce {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("reduce.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("reduce.out")));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            x.add(Integer.parseInt(st.nextToken()));
            y.add(Integer.parseInt(st.nextToken()));
        }
        int maxIndexX = x.indexOf(Collections.max(x));
        int maxIndexY = y.indexOf(Collections.max(y));
        int minIndexX = x.indexOf(Collections.min(x));
        int minIndexY = y.indexOf(Collections.min(y));
        ArrayList<Integer> xTemp = new ArrayList<Integer>(x);
        ArrayList<Integer> yTemp = new ArrayList<Integer>(y);
        ArrayList<Integer> dists = new ArrayList<Integer>();
        xTemp.remove(maxIndexX);
        yTemp.remove(maxIndexX);
        dists.add(Math.abs(Collections.max(xTemp) - Collections.min(xTemp)) * Math.abs(Collections.max(yTemp) - Collections.min(yTemp)));
        
        xTemp = new ArrayList<Integer>(x);
        yTemp = new ArrayList<Integer>(y);
        xTemp.remove(maxIndexY);
        yTemp.remove(maxIndexY);
        dists.add(Math.abs(Collections.max(xTemp) - Collections.min(xTemp)) * Math.abs(Collections.max(yTemp) - Collections.min(yTemp)));
        
        xTemp = new ArrayList<Integer>(x);
        yTemp = new ArrayList<Integer>(y);
        xTemp.remove(minIndexX);
        yTemp.remove(minIndexX);
        dists.add(Math.abs(Collections.max(xTemp) - Collections.min(xTemp)) * Math.abs(Collections.max(yTemp) - Collections.min(yTemp)));
    
        xTemp = new ArrayList<Integer>(x);
        yTemp = new ArrayList<Integer>(y);
        xTemp.remove(minIndexY);
        yTemp.remove(minIndexY);
        dists.add(Math.abs(Collections.max(xTemp) - Collections.min(xTemp)) * Math.abs(Collections.max(yTemp) - Collections.min(yTemp)));
    
        out.println(Collections.min(dists));
        out.close();
    }
}
