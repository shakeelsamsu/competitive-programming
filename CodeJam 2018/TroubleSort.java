import java.util.*;
import java.io.*;
public class TroubleSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); 
		for (int i = 1; i <= n; i++) {
			int size = in.nextInt();
			int v = 0;
			int index = 0;
			boolean error = false;
			int[] list = new int[size];
			for(int b = 0; b < size; b++) {
				list[b] = in.nextInt();
			}
			while(!check(list, v)) {
				for(int z = 0; z < size - 2; z++) {
					swap(list, z);
				}
				v++;
			}
			for(int h = 0; h < size - 1; h++) {
				if(list[h] > list[h + 1]) {
					error = true;
					index = h;
					break;
				}
			}
			if(error == true) {
				System.out.println("Case #" + i + ": " + index);
			}
			else {
				System.out.println("Case #" + i + ": OK");
			}
		}
	}
	private static int[] swap(int[] list, int t) {
		int change = list[t];
		if(list[t] > list[t + 2]) {
			list[t] = list[t + 2];
			list[t + 2] = change;
		}
		return list;
	}
	private static boolean check(int[] list, int f) {
		boolean satisfied = true;
		for(int i = 0; i < list.length - 2; i++) {
			if(list[i] > list[i + 2]) {
				satisfied = false;
				break;
			}
		}
		return satisfied;
	}
	
}
