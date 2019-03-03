import java.io.*;
import java.math.*;
import java.util.*;

public class prob01 {

	public static void main(String[] args) throws Exception {
		Scanner sc, in;
		sc = in = new Scanner(new File("data/prob01.txt"));
		String line = in.nextLine();
		System.out.println("While we seem to disagree on this issue, " + line
				+ ", I respect your opinion and look forward to further discussion!");
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