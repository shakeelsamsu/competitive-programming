import java.util.*;
import java.io.*;
import java.math.*;

public class a {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("a.txt"));
        int n = in.nextInt();
        for(int i = 0;  i < n; i++) {
            System.out.print(in.nextInt() + " ");
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            long xk = in.nextLong();
            System.out.println(recursion(a, b, k , xk));
        }
    }
    public static long recursion(int a, int b, int k, long xk) {
        long prev = xk;
        for(int i = 0; i < k; i++) {
            prev = (prev - b) / a;
        }
        return prev;
    }
}