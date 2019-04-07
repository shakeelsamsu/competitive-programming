import java.io.*;
import java.util.*;
import java.math.*;

public class foregonesolution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int t = Integer.parseInt(in.readLine());
        for(int i = 1; i <= t; i++) {
            BigInteger n = new BigInteger(in.readLine());
            BigInteger a = new BigInteger(getA(n));
            out.println("Case #" + i + ": " + a + " " + n.subtract(a));
        }
        out.close();
    }

    private static String getA(BigInteger n) {
        String s = n.toString();
        String res = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.substring(i, i + 1).equals("4"))
                res += "1";
            else res += "0";
        }
        return trim0(res);
    }

    private static String trim0(String s) {
        while(s.substring(0, 1).equals("0"))
            s = s.substring(1);
        return s;
    }
}