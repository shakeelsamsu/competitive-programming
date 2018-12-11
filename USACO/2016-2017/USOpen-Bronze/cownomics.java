import java.io.*;
import java.util.*;

public class cownomics {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("cownomics.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cownomics.out")));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<String>> spotty = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> plain = new ArrayList<ArrayList<String>>();
        for(int i = 0; i < n; i++) {
            String genome = in.readLine();
            for(int j = 0; j < m; j++) {
                ArrayList<String> temp = new ArrayList<String>();
                temp.add(genome.substring(j, j + 1));
                if(i == 0) spotty.add(temp);
                else spotty.get(j).addAll(temp);
            }    
        }
        for(int i = 0; i < n; i++) {
            String genome = in.readLine();
            for(int j = 0; j < m; j++) {
                ArrayList<String> temp = new ArrayList<String>();
                temp.add(genome.substring(j, j + 1));
                if(i == 0) plain.add(temp);
                else plain.get(j).addAll(temp);
            }
        }
        int count = 0;
        for(int i = 0; i < m; i++) {
            ArrayList<String> a = spotty.get(i);
            ArrayList<String> b = plain.get(i);
            if(Collections.disjoint(a, b)) count++;
        }
        out.println(count);
        out.close();
    }
}