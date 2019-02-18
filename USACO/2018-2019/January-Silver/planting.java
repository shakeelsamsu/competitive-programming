import java.io.*;
import java.util.*;

public class planting {
    public static void main(String[] args)  throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("planting.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("planting.out")));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer> fields = new ArrayList<Integer>();
        for(int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(in.readLine());
            fields.add(Integer.parseInt(st.nextToken()));
            fields.add(Integer.parseInt(st.nextToken()));
        }        
        Collections.sort(fields);
        int max = 0;
        int temp = 1;
        for(int i = 1; i < fields.size(); i++) {
            if(fields.get(i - 1) == fields.get(i))
                temp++;
            else {
                if(temp > max) max = temp;
                temp = 1;
            }
        }
        out.println(max + 1);
        out.close();
    }
}