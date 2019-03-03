import java.io.*;
import java.util.*;
import java.math.*;

public class prob17 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("data/prob17.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		String line = in.readLine();
		TreeMap<Character, Integer> occurrences1 = new TreeMap<>();
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (!occurrences1.containsKey(c)) {
				occurrences1.put(c, 0);
			}
			occurrences1.put(c, occurrences1.get(c) + 1);
		}
		TreeMap<Character, Integer> a = new TreeMap<>((q, w) -> w - q);
		TreeMap<Character, Integer> b = new TreeMap<>();
		for (char c : occurrences1.keySet()) {
			int oc = occurrences1.get(c);
			if (oc >= 10) {
				b.put(c, oc);
			} else
				a.put(c, oc);
		}
		String res1 = "";
		for (Map.Entry<Character, Integer> e : a.entrySet()) {
			if (e.getKey() == ' ')
				res1 += "_[" + e.getValue() + "]";
			else
				res1 += e.getKey() + "[" + e.getValue() + "]";
		}
		res1 += ";";
		for (Map.Entry<Character, Integer> e : b.entrySet()) {
			if (e.getKey() == ' ')
				res1 += "_[" + e.getValue() + "]";
			else
				res1 += e.getKey() + "[" + e.getValue() + "]";
		}
		out.println(res1);
		out.close();
	}
}