import java.io.*;
import java.math.*;
import java.util.*;

public class K {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("K.txt"));
		int n = Integer.parseInt(in.readLine());
		for(int i = 0;  i < n; i++) {
			String name = in.readLine();
			String[] input = in.readLine().split(" ");
			int count1 = 0;
			int count9 = 0;
			int countTotal = input.length;
			for(int j = 0; j < input.length; j++) {
				if(input[j].charAt(0) == '1') {
					count1++;
				}
				if(input[j].charAt(0) == '9') {
					count9++;
				}
			}
			double percent1 = (double) count1 / countTotal;
			double percent9 = (double) count9 / countTotal;
			if(percent1 < 0.25 || percent9 > 0.1) println(name + " MUST BE INVESTIGATED FURTHER.");
			else println(name + " MEETS BENFORD'S LAW.");
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