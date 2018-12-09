import java.io.*;
import java.util.*;

public class crossroad {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("crossroad.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("crossroad.out")));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int[] sides = new int[10];
        Arrays.fill(sides, -1);
        int n = Integer.parseInt(st.nextToken());
        int crosses = 0;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            int cow = Integer.parseInt(st.nextToken());
            int side = Integer.parseInt(st.nextToken());
            if(sides[cow - 1] == -1) sides[cow - 1] = side;
            else if(sides[cow - 1] != side) {
                sides[cow - 1] = side;
                crosses++;
            }
        }
        out.println(crosses);
        out.close();
    }
}