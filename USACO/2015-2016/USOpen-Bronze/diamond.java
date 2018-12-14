import java.io.*;
import java.util.*;

public class diamond {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("diamond.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("diamond.out")));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        int diff = Integer.parseInt(st.nextToken());
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int max = 1;
        for(int i = 0; i < n; i++) nums.add(Integer.parseInt(in.readLine()));
        Collections.sort(nums);
        for(int i = 0; i < n; i++) {
            ArrayList<Integer> display = removeAll(nums, nums.get(i), diff);
            if(max < display.size()) max = display.size();
            //out.println(display + " " + nums.get(i) + " " + max);
        }
        out.println(max);
        out.close();
    }

    public static ArrayList<Integer> removeAll(ArrayList<Integer> nums, int n, int diff) {
        ArrayList<Integer> result1 = new ArrayList<Integer>();
        ArrayList<Integer> result2 = new ArrayList<Integer>();
        for(int x : nums) {
            if(x <= n + diff && x >= n) result1.add(x);
        }
        for(int x : nums) {
            if(x >= n - diff && x <= n) result2.add(x);
        }
        if(result2.size() > result1.size()) return result2;
        return result1;
    }
}