import java.io.*;
import java.util.*;

public class mountains {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("mountains.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("mountains.out")));

        int n = Integer.parseInt(in.readLine());
        ArrayList<Mountain> list = new ArrayList<Mountain>();
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            Mountain m = new Mountain(x, y);
            list.add(m);
        }
        // out.println(list.toString());
        int visible = n;
        Collections.sort(list);
        for(int i = 0; i < list.size(); i = i) {
            int j = i + 1;
            // if(j < list.size()) out.println(hidden(list.get(i), list.get(j)));
            while(j < list.size() && hidden(list.get(i), list.get(j))) {
                visible--;
                j++;
            }
            i = j;
        }
        // out.println(list);
        out.println(visible);
        out.close();
    }   
    
    private static boolean hidden(Mountain a, Mountain b) {
        return a.x + a.y - b.x >= b.y;
    }

    static class Mountain implements Comparable<Mountain> {
        int x;
        int y;

        public Mountain(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(Mountain m) {
            if(this.x - this.y == m.x - m.y)
                return this.y - m.y;
            return (this.x - this.y) - (m.x - m.y);
            
        }

        public String toString() {
            return x + " " + y;
        }
    }
}