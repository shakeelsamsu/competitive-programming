import java.io.*;
import java.math.*;
import java.util.*;

public class prob00 {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello, Teachers!");
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