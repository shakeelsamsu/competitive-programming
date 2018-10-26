/**
 * @author: shakeelsamsu
 * https://github.com/shakeelsamsu
 */

import java.io.*;
import java.util.*;

public class H {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("H.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        System.out.println(gcd(30, 16));
    }
    
    public static long gcd(int a, int b) {
        int min = Math.min(a, b);
        if(Math.max(a, b) % min == 0) return min;
        for(int i = 2; i < min; i++) {
            if(a % i == 0 && b % i == 0) return i;
        }
        return 1;
    }
}