/**
 * @author: shakeelsamsu
 * https://github.com/shakeelsamsu
 * This solution works but:
 * Sample Test Case 4 in the Problem Packet seems incorrect...
 */

import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("B.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        String mods = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
             st = new StringTokenizer(in.readLine());
             int caseNum = Integer.parseInt(st.nextToken());
             int b = Integer.parseInt(st.nextToken());
             String num = st.nextToken();
             ArrayList<Character> digits = new ArrayList<Character>();
             for(int j = 0; j < num.length(); j++) {
                 digits.add(num.charAt(j));
             }
             int pow = 0;
             long sum = 0;
             for(int z = digits.size() - 1; z >= 0; z--) {
                sum += mods.indexOf(digits.get(z)) * Math.pow(b, pow);
                pow++;
             }
            long mod = sum % (b-1);
            out.println("mod: " + mod);
            out.println(caseNum + " " + mods.charAt( (int) mod));
        }
        out.close();
    }
}