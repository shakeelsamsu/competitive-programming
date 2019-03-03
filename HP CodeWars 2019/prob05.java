import java.io.*;
import java.util.*;
import java.math.*;

public class prob05 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("data/prob05.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		int n = Integer.parseInt(in.readLine());
		long sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i * i;
		out.println(sum);
		out.close();
	}
}