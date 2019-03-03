import java.io.*;
import java.math.*;
import java.util.*;

public class prob16 {

	public static void main(String[] args) throws Exception {
		Scanner sc, in;
		sc = in = new Scanner(new File("data/prob16.txt"));

		Stack<String> stack = new Stack<>();
		int is = 0;
		int had = 0;
		while (sc.hasNext()) {
			String a = sc.next();
			String up = a.toUpperCase();
			if (!up.equals("IS"))
				is = 0;
			if (!up.equals("HAD"))
				had = 0;
			if (stack.size() > 0)
				if (stack.peek().equals(up)) {
					if (up.equals("IS")) {
						if (is > 1)
							continue;
					} else if (up.equals("HAD")) {
						if (had > 1)
							continue;
					} else {
						continue;
					}

					// && (stack.peek().equals(up) || up.equals("IS") && is > 1 || up.equals("HAD")
					// && had > 1)) {
					// continue;
				}
			if (up.equals("IS"))
				is++;
			if (up.equals("HAD"))
				had++;
			print(a + " ");
			stack.push(up);
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