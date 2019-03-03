import java.io.*;
import java.math.*;
import java.util.*;

public class prob13 {

	public static void main(String[] args) throws Exception {
		Scanner sc, in;
		sc = in = new Scanner(new File("data/prob13.txt"));
		String[] arr = new String[4];
		int pos = 0;
		for (int x = 0; x < 4; x++) {
			arr[x] = sc.next();
			if (arr[x].equals("X")) {
				pos = x;
			}
		}
		switch (pos) {
		case 0:
			printf("%f", p(arr[1]) * p(arr[2]) / p(arr[3]));
			break;
		case 1:
			printf("%f", p(arr[3]) * p(arr[0]) / p(arr[2]));
			break;
		case 2:
			printf("%f", p(arr[3]) * p(arr[0]) / p(arr[1]));
			break;
		default:
			printf("%f", p(arr[1]) * p(arr[2]) / p(arr[0]));
			break;
		}
	}

	private static double p(String a) {
		return Double.parseDouble(a);
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