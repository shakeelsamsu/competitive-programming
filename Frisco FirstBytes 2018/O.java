import java.io.*;
import java.math.*;
import java.util.*;

public class O {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("O.txt"));
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			int shift = in.nextInt();
			String line = in.nextLine().trim();
			char[] chars = line.toCharArray();
			for(int j = 0; j < chars.length; j++) {
				int change = chars[j] + shift;
				if(chars[j] == ' ') continue;
				else if(change > 90) {
					change -= 90;
					chars[j] = (char) (64 + change);
				}
				else if(change < 65) {
					change -= 65;
					chars[j] = (char) (91 - Math.abs(change));
				}
				else {
					chars[j] = (char) change;
				}
				
			}
			String out = new String(chars);
			println(out);
		}
		
		
		in.close();
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