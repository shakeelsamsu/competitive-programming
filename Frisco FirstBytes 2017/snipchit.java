import java.util.*;
import java.io.*;

public class snipchit {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("snipchit.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            String a = in.readLine();
            String b = in.readLine();
            String best = a + b;
            String temp = "";
            boolean exception = false;
            for(int j = b.length(); j >= 0; j--) {
                int difference = b.length() - j;
                if(difference > a.length()) {
                    j = 0;
                    break;
                }
                String start = a.substring(a.length() - difference, a.length());
                String end = b.substring(0, difference);
                //out.println("start: " + start);
                //out.println("end: " + end);
                if(end.equals("")) exception = true;
                if(start.equals(end) && j != b.length()) {
                    //out.println("    " + start + " " + end + " " + j);
                    temp = a.substring(0, a.length() - difference) + b.substring(difference, b.length());
                    if(temp.length() < best.length()) best = temp;
                    exception = false;
                }
                if(j == 0 && exception) out.println(a + b);
                
            }
            if(!exception) out.println(best);
        }
        out.close();
    }
}