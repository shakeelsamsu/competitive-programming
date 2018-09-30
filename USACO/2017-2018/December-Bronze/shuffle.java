/*
ID: 
LANG: JAVA
TASK: shuffle
*/

import java.io.*;
import java.util.*;

public class shuffle {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("shuffle.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("shuffle.out")));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] seqTemp = new int[n];
        int[] seq = seqTemp.clone();
        st = new StringTokenizer(in.readLine());
        for(int i = 0; i < n; i++) seqTemp[i] = Integer.parseInt(st.nextToken()) - 1;
        for(int l = 0; l < n; l++) seq[l] = seqTemp[l]; //radical idea
        st = new StringTokenizer(in.readLine());
        ArrayList<String> positions = new ArrayList<String>();
        
        for(int k = 0; k < n; k++) positions.add(st.nextToken());
        for(int j = 0; j < 3; j++) {
            ArrayList<String> positionsTemp = new ArrayList<String>(positions);
            for(int v = 0; v < n; v++) {
                positions.set(v, positionsTemp.get(seq[v]));
            }
        }
        Iterator<String> itr = positions.iterator();
        while(itr.hasNext()) {
            out.println(itr.next());
        }
        out.close();
    }
}
