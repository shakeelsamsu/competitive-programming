import java.io.*;
import java.util.*;
import java.math.*;

public class prob06 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("data/prob06.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		int n = Integer.parseInt(in.readLine());
		long sum = 0;
		for (int i = n - 1; i > 0; i--)
			sum += i * 4;
		out.println(sum);
		out.close();
	}
}