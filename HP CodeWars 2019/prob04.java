import java.io.*;
import java.math.*;
import java.util.*;

public class prob04 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("data/prob04.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		int n = Integer.parseInt(in.readLine());
		for (int i = 0; i < n; i++) {
			double percent = Double.parseDouble(in.readLine()) / 100;
			double purchase = Double.parseDouble(in.readLine());
			double tax = purchase / (1 + percent);
			tax = tax * percent;
			out.println("On your $" + String.format("%.2f", purchase) + " purchase, the tax amount was $"
					+ String.format("%.2f", tax));
		}
		out.close();
	}
}