import java.io.*;
import java.math.*;
import java.util.*;

public class prob11 {

	public static void main(String[] args) throws Exception {
		Scanner sc, in;
		sc = in = new Scanner(new File("data/prob11.txt"));
		int w = in.nextInt();
		int h = in.nextInt();
		char[][] pic = new char[h][w];
		for (int i = 0; i < pic.length; i++) {
			for (int j = 0; j < pic[i].length; j++) {
				pic[i][j] = ' ';
			}
		}
		for (int i = 0; i < h; i++) {
			int index = in.nextInt();
			// in.nextLine();
			pic[index] = in.nextLine().toCharArray();
		}
		for (int i = pic.length - 1; i >= 0; i--) {
			System.out.print(i);
			for (int j = 0; j < pic[i].length; j++) {
				System.out.print(pic[i][j]);
			}
			System.out.println();
		}
		int p = 0;
		for (int i = 0; i <= w; i++) {
			System.out.print(i % 10);
		}
		System.out.println();

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