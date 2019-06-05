import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class walk {

    private static BigInteger xCoff = new BigInteger("2019201913");
    private static BigInteger yCoff = new BigInteger("2019201949");
    private static BigInteger mod = new BigInteger("2019201997");

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("walk.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("walk.out")));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        out.println(calc(new BigInteger(Integer.toString(k - 1)), new BigInteger(Integer.toString(n))));
        out.close();
    }

    private static BigInteger calc(BigInteger x, BigInteger y) {
        return (xCoff.multiply(x).add(yCoff.multiply(y))).mod(mod);
    }
}