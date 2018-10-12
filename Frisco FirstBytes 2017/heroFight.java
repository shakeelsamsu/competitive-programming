import java.io.*;
import java.util.*;

public class heroFight {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("heroFight.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            String name1 = in.readLine();
            String name2 = in.readLine();
            int moves1 = Integer.parseInt(in.readLine()); 
            ArrayList<String> movesp1 = new ArrayList<String>();
            for(int j = 0; j < moves1; j++) {
                movesp1.add(in.readLine());
            }
            int moves2 = Integer.parseInt(in.readLine()); 
            ArrayList<String> movesp2 = new ArrayList<String>();
            for(int h = 0; h < moves2; h++) {
                movesp2.add(in.readLine());
            }
            out.println("Match #" + (i + 1) + " Begin!");
            for(int z = 0; z < Math.max(moves1, moves2); z++) {
                if(z < moves1) out.println(name1 + " uses " + movesp1.get(z) + "!");
                if(z < moves2) out.println(name2 + " uses " + movesp2.get(z) + "!");
                if(z == Math.max(moves1, moves2) - 1) {
                    if(z == moves1 - 1) out.println(name1 + " defeats " + name2 + " using " + movesp1.get(z) + "!");
                    if(z == moves2 - 1) out.println(name2 + " defeats " + name1 + " using " + movesp2.get(z) + "!");
                    out.println();
                }
            }
        }
        out.close();
    }
}