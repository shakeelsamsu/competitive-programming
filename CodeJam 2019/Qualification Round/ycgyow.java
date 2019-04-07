import java.io.*;
import java.util.*;
import java.math.*;

public class ycgyow {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int t = Integer.parseInt(in.readLine());
        for(int i = 1; i <= t; i++) {
            int n = Integer.parseInt(in.readLine());
            String p = in.readLine();
            String res = "";
            for(int j = 0; j < p.length(); j++) {
                res += p.substring(j, j + 1).equals("S") ? "E" : "S";
            }
            out.println("Case #" + i + ": " + res);
        }
        out.close();
    }

}