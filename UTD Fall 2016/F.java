/**
 * @author: shakeelsamsu
 * https://github.com/shakeelsamsu
 */


import java.io.*;
import java.util.*;

public class F {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("F.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        while(true) {
            String str = in.readLine();
            if(str.equals("#")) break;
            boolean even = str.contains("e");
            int numOnes = countOnes(str);
            if(even) {
                if(numOnes % 2 == 0) {
                    out.println(str.substring(0, str.length() - 1) + "0");
                }
                else {
                    out.println(str.substring(0, str.length() - 1) + "1");
                }
            }
            else {
                if(numOnes % 2 == 0) {
                    out.println(str.substring(0, str.length() - 1) + "1");
                }
                else {
                    out.println(str.substring(0, str.length() - 1) + "0");
                }
            }
        }
        out.close();
    }
    public static int countOnes(String str) {
        int count = 0;
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.substring(i, i + 1).equals("1")) count++;
        }
        return count;
    }
}