import java.io.*;
import java.util.*;

public class blocks {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("blocks.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("blocks.out")));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] letters = new int[26];
        for(int t = 0; t < n; t++) {
            st = new StringTokenizer(in.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            for(int i = 0; i < a.length(); i++) {
                String str = a.substring(i, i + 1);
                if(b.contains(str)) {
                    //out.println(str);
                    b = b.substring(0, b.indexOf(str)) + b.substring(b.indexOf(str) + 1, b.length());
                    letters[(a.charAt(i) - 97)]++;
                    //out.println(a + " " + b);
                }
                else letters[(a.charAt(i) - 97)]++;
            }
            for(int i = 0; i < b.length(); i++) letters[(b.charAt(i) - 97)]++;
        }
        for(int i = 0; i < 26; i++) out.println(letters[i]);
        out.close();
    }
}