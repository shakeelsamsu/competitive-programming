import java.io.*;
import java.util.*;

public class B {
    
    private static HashMap<Character, Integer> hex = new HashMap<Character, Integer>();
    
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("B.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        hex.put('A', 10);
        hex.put('B', 11);
        hex.put('C', 12);
        hex.put('D', 13);
        hex.put('E', 14);
        hex.put('F', 15);
        
        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            int radix = Integer.parseInt(st.nextToken());
            String first = st.nextToken();
            String last = st.nextToken();
            int start = Integer.parseInt(convertBase(first, radix, 10));
            int end = Integer.parseInt(convertBase(last, radix, 10));
            int sum = sumDigitsRange(start, end, radix);
            System.out.println(Integer.toString(sum, radix).toUpperCase());
        }
        out.close();
    }

    public static String convertBase(String str, int fromBase, int toBase) {
        return Integer.toString(Integer.parseInt(str, fromBase), toBase);
    }

    public static int sumDigits(int num, int radix) {
        String str = Integer.toString(num, radix).toUpperCase();
        int sum = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 65)    
                for(Character key : hex.keySet()) {
                    if(str.charAt(i) == key) sum += hex.get(key);
                }
            else sum += Integer.parseInt(str.substring(i, i + 1));
        }
        return sum;
    }

    public static int sumDigitsRange(int start, int end, int radix) {
        int sum = 0;
        for(int i = 0; i <= end - start; i++) {
            sum += sumDigits(start + i, radix);
        }
        return sum;
    }
}