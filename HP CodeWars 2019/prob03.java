import java.io.*;
import java.math.*;
import java.util.*;

public class prob03 {

	public static void main(String[] args) throws Exception {
		Scanner sc, in;
		sc = in = new Scanner(new File("data/prob03.txt"));
		int r = in.nextInt();
		System.out.printf("%.2f", 3.14159 * r * r * 0.75);

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