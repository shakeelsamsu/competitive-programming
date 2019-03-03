import java.io.*;
import java.math.*;
import java.util.*;

public class prob14 {

	public static void main(String[] args) throws Exception {
		Scanner sc, in;
		sc = in = new Scanner(new File("data/prob14.txt"));
		int f0 = in.nextInt();
		int f1 = in.nextInt();
		int next = f0 + f1;
		int itr = in.nextInt();
		String ret = f0 + "," + f1 + ",";
		for (int i = 2; i < itr; i++) {
			ret += next + ",";
			f0 = f1;
			f1 = next;
			next = f0 + f1;
		}
		System.out.println(ret.substring(0, ret.length() - 1));

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