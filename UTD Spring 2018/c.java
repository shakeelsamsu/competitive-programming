import java.util.*;
import java.io.*;
import java.math.*;

public class C {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("c.txt"));
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.print(in.nextInt() + " ");
            int base = in.nextInt();
            int val = in.nextInt();
            System.out.println(sumsqdig(val, base));
        }
    }
    public static int sumsqdig(int val, int base) {
        int digit;
        int result = 0;
        while(val > 0) {
            digit = val % base; 
            result += digit * digit;
            val = (val - digit) / base;
        }
        return result;
    }
}