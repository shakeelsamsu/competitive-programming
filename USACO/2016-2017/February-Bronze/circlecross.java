import java.io.*;
import java.util.*;

public class circlecross {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("circlecross.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("circlecross.out")));
    
        String line = in.readLine();
        int count = 0;
        for(int i = 0; i < 26; i++) {
            String str = Character.toString((char) ('A' + i));
            if(line.indexOf(str) != line.lastIndexOf(str) - 1) {
                for(int j = line.indexOf(str); j < line.lastIndexOf(str); j++) {
                    String s = line.substring(j, j + 1);
                    if(line.lastIndexOf(s) > line.lastIndexOf(str)) count++;
                }
            }
        }
        out.println(count);
        out.close();
    }

}