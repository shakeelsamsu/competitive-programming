import java.io.*;
import java.util.*;

public class fishLine {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("fishLine.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            String line = in.readLine();
            char[] items = line.toCharArray();
            int count = 0;
            for(int j = 0; j < items.length; j++) if(items[j] != 'O' && items[j] != '#') count++;
            out.println("Line #" + (i + 1) + " will produce " + count + " Flotsam Fish Nuggets");
        }
        out.close();
    }
}