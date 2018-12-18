import java.io.*;
import java.util.*;

public class mixmilk {
    public static void main(String[] args) throws Exception {
            
        BufferedReader in = new BufferedReader(new FileReader("mixmilk.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int c1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(in.readLine());
        int c2 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(in.readLine());
        int c3 = Integer.parseInt(st.nextToken());
        int m3 = Integer.parseInt(st.nextToken());

        int turn = 1;
        for(int i = 0; i < 100; i++) {
            if(turn == 1) {
                if((m1 + m2) <= c2) {
                    m2 = m1 + m2;
                    m1 = 0;
                }
                else {
                    int diff = c2 - m2; 
                    if(m1 >= diff) {
                        m1 -= diff;
                        m2 = c2;
                    }
                    else {
                        m2 += m1;
                        m1 = 0;
                    } 
                }
                turn = 2;
            }
            else if(turn == 2) {
                if((m2 + m3) <= c3) {
                    m3 = m2 + m3;
                    m2 = 0;
                }
                else {
                    int diff = c3 - m3; 
                    if(m2 >= diff) {
                        m2 -= diff;
                        m3 = c3;
                    }
                    else {
                        m3 += m2;
                        m2 = 0;
                    } 
                }
                turn = 3;
            }
            else {
                if((m3 + m1) <= c1) {
                    m1 = m3 + m1;
                    m3 = 0;
                }
                else {
                    int diff = c1 - m1; 
                    if(m3 >= diff) {
                        m3 -= diff;
                        m1 = c1;
                    }
                    else {
                        m1 += m3;
                        m3 = 0;
                    } 
                }
                turn = 1;
            }
        }
        out.println(m1);
        out.println(m2);
        out.println(m3);
        out.close();
    }
}