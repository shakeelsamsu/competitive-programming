import java.io.*;
import java.math.*;
import java.util.*;

public class H {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("H.txt"));
		ArrayList<String> replaceWords = new ArrayList<String>();
		replaceWords.add("sc");
		replaceWords.add("ng");
		replaceWords.add("ck");
		replaceWords.add("ph");
		replaceWords.add("sh");
		replaceWords.add("th");
		replaceWords.add("wh");
		replaceWords.add("qu");
		replaceWords.add("Sc");
		replaceWords.add("Ng");
		replaceWords.add("Ck");
		replaceWords.add("Ph");
		replaceWords.add("Sh");
		replaceWords.add("Th");
		replaceWords.add("Wh");
		replaceWords.add("Qu");
		replaceWords.add("SC");
		replaceWords.add("NG");
		replaceWords.add("CK");
		replaceWords.add("PH");
		replaceWords.add("SH");
		replaceWords.add("TH");
		replaceWords.add("WH");
		replaceWords.add("QU");
		replaceWords.add("sC");
		replaceWords.add("nG");
		replaceWords.add("cK");
		replaceWords.add("pH");
		replaceWords.add("sH");
		replaceWords.add("tH");
		replaceWords.add("wH");
		replaceWords.add("qU");
		int n = in.nextInt();
		in.nextLine();
		for(int i = 0; i < n; i++) {
			String line = in.nextLine();
			for(int j = 0; j < replaceWords.size(); j++) {
				line = line.replace(replaceWords.get(j), "__");
			}
			println(line);
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