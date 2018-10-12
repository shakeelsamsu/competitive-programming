import java.util.*;
import java.io.*;

public class miles {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("miles.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("combos.txt")));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            double hr = Double.parseDouble(st.nextToken());
            double min = Double.parseDouble(st.nextToken());
            double sec = Double.parseDouble(st.nextToken());    
            int mph = (int) Math.round(17.74 / calcTimeDifference(hr, min, sec));
            int kmph = (int) Math.round(17.74 / calcTimeDifference(hr, min, sec) * 1.60934);
            System.out.println("If you leave at " + (int) hr + " " + (int) min + " " + (int) sec + " pm, you will need to go " + mph + " mph or " + kmph + " km/h");
        }
    }

    public static double calcTimeDifference(double hour, double minutes, double seconds) {
        double diff = 0;
        if(minutes == 0) diff = 12 - hour;
        else {
            diff = (60 - minutes) / 60;
            if(seconds != 0) diff += (60 - seconds) / 60 / 60;
            if(hour != 11) diff += 11 - hour;    
        }
        return diff;
    }
}