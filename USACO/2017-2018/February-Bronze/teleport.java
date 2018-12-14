import java.io.*;
import java.util.*;

public class teleport {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("teleport.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("teleport.out")));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int distToEnd = Math.abs(b - a);
        int distToTeleport1 = Math.abs(x - a) + Math.abs(y - b);
        int distToTeleport2 = Math.abs(y - a) + Math.abs(x - b);
        out.println(Math.min(Math.min(distToTeleport1, distToTeleport2), distToEnd));
        out.close();
    }
}