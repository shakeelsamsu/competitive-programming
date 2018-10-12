import java.util.*;
import java.io.*;

public class middle {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("middle.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            String input = in.readLine();
            String[] menu = input.split(", ");
            String pricesTemp = menu[3];
            String[] prices = new String[3];
            for(int j = 0; j < 3; j++) {
                prices = pricesTemp.split(" ");
            } 
            
            out.print(menu[1] + " " + prices[1]);
            out.println();
        }
        out.close();
    }
}