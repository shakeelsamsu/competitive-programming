/**
 * @author: shakeelsamsu
 * https://github.com/shakeelsamsu
 */
import java.util.*;
import java.io.*;

public class I {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("I.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        out.println("Gnomes:");
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            ArrayList<Integer> nums = new ArrayList<Integer>();
            for(int j = 0; j < 3; j++) nums.add(Integer.parseInt(st.nextToken()));
            ArrayList<Integer> sorted = new ArrayList<Integer>(nums);
            Collections.sort(sorted);
            ArrayList<Integer> sorted1 = new ArrayList<Integer>(sorted);
            Collections.reverse(sorted1);
            if(sorted.equals(nums) || sorted1.equals(nums)) out.println("Ordered");
            else out.println("Unordered");
        }
        out.close();
    }
}