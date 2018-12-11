import java.io.*;
import java.util.*;

public class lostcow {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("lostcow.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("lostcow.out")));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int lastPos = Integer.parseInt(st.nextToken());
        int initialPos = lastPos;
        int cow = Integer.parseInt(st.nextToken());
        int totalDist = 0;
        int incr = 1;
        boolean reached = false;
        boolean forward = true;
        while(!reached) {
            int newPos = initialPos + incr;
            reached = forward && newPos >= cow && cow >= initialPos || !forward && newPos <= cow && cow <= initialPos;
            if(forward) forward = false;
            else forward = true;
            totalDist += Math.abs(newPos - lastPos);
            lastPos = newPos;
            incr *= -2;
            //out.println(lastPos + " " + totalDist);
        }
        if(!forward) {
            if(lastPos > cow) totalDist -= lastPos - cow;
        }
        else {
            if(lastPos < cow) totalDist -= cow - lastPos;
        }
        out.println(totalDist);
        out.close();
    }
}