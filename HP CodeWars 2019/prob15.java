import java.io.*;
import java.math.*;
import java.util.*;

public class prob15 {

	public static long fact(int n) {
		long ret = 1;
		for (int i = 1; i <= n; i++) {
			ret *= i;
		}
		return ret;
	}

	public static long comb(int n, int r) {
		return fact(n) / (fact(r) * fact(n - r));
	}

	public static void main(String[] args) throws Exception {
		Scanner sc, in;
		sc = in = new Scanner(new File("data/prob15.txt"));
		int b = in.nextInt();
		int c = in.nextInt();
		long sum = b * c + comb(b, 2) * c + b * comb(c, 2) + comb(b, 3) * c + comb(b, 2) * comb(c, 2) + b * comb(c, 3);
		System.out.println(sum);

	}

	private static void print(Object x) {
		System.out.print(x);
	}

	private static void println(Object x) {
		print(x + "\n");
	}

	private static void println() {
		print("\n");
	}

	private static void printf(String format, Object... args) {
		print(String.format(format, args));
	}
}