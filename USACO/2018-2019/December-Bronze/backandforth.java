import java.io.*;
import java.util.*;

public class backandforth {
    public static void main(String[] args) throws Exception {
            
        BufferedReader in = new BufferedReader(new FileReader("backforth.in"));
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("backforth.out")));
        //PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int[] a = new int[11];
        int[] b = new int[11];
        for(int i = 0; i < 10; i++) a[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(in.readLine());
        for(int i = 0; i < 10; i++) b[i] = Integer.parseInt(st.nextToken());
        HashSet<Integer> amounts = new HashSet<Integer>();  
        int currentBucket = 0;
        amounts.add(1000);
        for(int i = 0; i < 10; i++) {
            a[10] = 0;
            b[10] = 0;
            int temp = 1000 - a[i];
            currentBucket = a[i];
            //out.print(temp + " ");
            for(int j = 0; j < 11; j++) {
                temp += b[j];
                b[10] = currentBucket;
                int newBucket = b[j];
                // out.print(temp + " ");
                for(int k = 0; k < 11; k++) {
                    if(k == i) continue;
                    temp -= a[k];
                    a[10] = newBucket;
                    // out.print(temp + " ");            
                    for(int l = 0; l < 11; l++) {
                        if(l == j) continue; 
                        temp += b[l];           
                        // out.print(temp + "    ");
                        // out.print(temp + " " + i + " " + j + " " + k + " " + l);
                        // out.print(" " + Arrays.toString(a));
                        // out.println(" " + Arrays.toString(b));
                        amounts.add(temp);
                        temp -= b[l];
                    }
                    temp = 1000 - a[i] + b[j];
                }
                temp = 1000 - a[i];
            }         
        }   
        //out.println(amounts);
        out.println(amounts.size());
        out.close();
    }

    private static int bucketCount(int[] arr, int bucketSize) {
        int count = 0;
        for(int i : arr) if(i == bucketSize) count++;
        return count;
    }
}
