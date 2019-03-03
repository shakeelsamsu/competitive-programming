import java.io.*;
import java.math.*;
import java.util.*;

public class prob08 {

	public static void main(String[] args) throws Exception {
		Scanner sc, in;
		sc = in = new Scanner(new File("data/prob08.txt"));

		String[] map = { "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN",
				"ELEVEN", "TWELVE" };
		String s = "";
		TreeMap<Character, Integer> A = new TreeMap<>();
		int x;
		while ((x = sc.nextInt()) != 999) {
			s += x + " ";
			TreeMap<Character, Integer> count = new TreeMap<>();
			for (int q = 0; q < map[x].length(); q++) {
				char c = map[x].charAt(q);
				if (!count.containsKey(c))
					count.put(c, 0);
				count.put(c, count.get(c) + 1);
			}
			for (char c : count.keySet()) {
				if (!A.containsKey(c))
					A.put(c, count.get(c));
				else
					A.put(c, Math.max(count.get(c), A.get(c)));
			}
		}
		print(s.substring(0, s.length() - 1) + ". ");
		for (char c : A.keySet()) {
			int rep = A.get(c);
			for (int a = 0; a < rep; a++)
				print(c + " ");
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