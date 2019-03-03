import java.io.*;
import java.math.*;
import java.util.*;

public class prob07 {

	static boolean[] primes = new boolean[2000001];
	static boolean[] sq = new boolean[1000001];
	static boolean[] cub = new boolean[1000001];

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("data/prob07.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		findPrimes(2000000);
		fillArr();
		while (true) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			if (n == 0 && m == 0)
				break;
			boolean status = false;
			while (!status) {
				if (m == 0) {
					n = n % 2 == 0 ? n + 2 : n + 1;
					status = true;
				} else if (m == 1) {
					n++;
					status = !primes[n];
				} else if (m == 2) {
					n++;
					status = sq[n];
				} else {
					n++;
					status = cub[n];
				}
			}
			out.println(n);
		}
		out.close();
	}

	// private static boolean isPrime(int n) {
	// for(int i = 2; i < Math.sqrt(n); i++)
	// if(n % i == 0) return false;
	// return true;
	// }

	private static void findPrimes(int n) {
		for (int i = 2; i <= n; i++)
			if (!primes[i])
				for (int j = i + i; j < primes.length; j += i)
					primes[j] = true;
	}

	private static void fillArr() {
		for (int i = 1; i <= 1000; i++) {
			sq[i * i] = true;
			if (i <= 100)
				cub[i * i * i] = true;
		}
	}
}