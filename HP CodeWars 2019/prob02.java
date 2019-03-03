import java.io.*;
import java.math.*;
import java.util.*;

public class prob02 {

	public static void main(String[] args) throws Exception {
		Scanner sc, in;
		sc = in = new Scanner(new File("data/prob02.txt"));
		int h = in.nextInt();
		int m = in.nextInt();
		int s = in.nextInt();

		if (h * s >= m)
			System.out.println(h + " " + m + " " + s + ". I will make it!");
		else
			System.out.println(h + " " + m + " " + s + ". I will be late!");

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