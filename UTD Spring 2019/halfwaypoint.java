import java.io.*;
import java.util.*;
import java.math.*;

public class halfwaypoint {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = Integer.parseInt(in.readLine());
        Point[] points = new Point[n];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            points[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        double totalDist = 0;
        double[] dists = new double[n - 1];
        for(int i = 0; i < n - 1; i++) {
            totalDist += calcDistance(points[i], points[i + 1]);
            dists[i] = totalDist;
        }
        int i = 0;
        double halfDist = totalDist / 2;
        for(i = 0; i < n; i++) {
            if(dists[i] > halfDist)
                break;
        }
        if(dists.length > 1) {
            Point p = points[i];
            Point q = points[i + 1];
            double a = p.x;
            double b = p.y;
            double x = q.x;
            double y = q.y;
            double l = halfDist - dists[i - 1];
            double theta = 0;
            double halfX = a;
            double halfY = b;
            if(a == x) {
                if(b > y)
                    halfY -= l;
                else
                    halfY += l;
            }
            else if(b == y) {
                if(a < x)
                    halfX += l;
                else
                    halfX -= l;
            }
            else if(b < y) {
                theta = Math.atan(Math.abs(b - y)/ Math.abs(a - x));
                halfY += l * Math.sin(theta);
                if(a < x)
                    halfX += l * Math.cos(theta);
                else
                    halfX -= l * Math.cos(theta);
            }
            else if(b > y) {
                theta = Math.atan(Math.abs(a - x)/ Math.abs(b - y));
                halfY -= l * Math.cos(theta);
                if(a < x)
                    halfX += l * Math.sin(theta);
                else
                    halfX -= l * Math.sin(theta);

            }
            out.println(halfX + " " + halfY);
            // out.println(halfDist);
            // out.println(a + " " + b);
            out.close();
        }
        else {
            double halfX = (points[0].x + points[1].x) / 2;
            double halfY = (points[0].y + points[1].y) / 2;
            out.println(halfX + " " + halfY);
            out.close();
        }
    }
    
    private static double calcDistance(Point a, Point b) {
        return Math.hypot(Math.abs(a.x - b.x), Math.abs(a.y - b.y));
    }
}

class Point {
    double x;
    double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    } 
}