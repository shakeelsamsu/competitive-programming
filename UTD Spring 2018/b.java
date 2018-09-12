import java.util.*;
import java.io.*;
import java.math.*;

public class b {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("b.txt"));
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.print(in.nextInt() + " ");
            System.out.println(chanukah(in.nextInt()));
        }
    }
    public static int chanukah(int days) {
        int candles = days;
        for(int i = 0; i < days; i++) candles += i + 1;
        return candles;
    }
}