import java.io.*;
import java.math.*;
import java.util.*;

public class prob19 {

	public static void main(String[] args) throws Exception {
		Scanner sc, in;
		sc = in = new Scanner(new File("data/prob19.txt"));
		String key = sc.nextLine();
		int k = 0;
		for (int x = 0; x < key.length(); x++) {
			char c = key.charAt(x);
			if (x % 2 == 0)
				k = k + c;
			else
				k = k - c;
		}
		if (k < 32)
			k += Math.ceil((32 - k) / 32d) * 32;
		else if (k > 126)
			k -= Math.ceil((126 - k) / 16d) * 16;
		println("Key = " + k);
		while (sc.hasNextLine()) {
			String a = sc.nextLine();
			String s = "";
			for (int x = 0; x < a.length(); x++) {
				int num = a.charAt(x) + 0;
				s += Integer.toString(num * k, 16) + ",";
			}
			println(s.substring(0, s.length() - 1));
		}
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