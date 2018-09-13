import java.util.*;
import java.io.*;
public class SaveUniverse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); 
		for (int i = 1; i <= n; i++) {
			int d = in.nextInt();
			String p = in.next();
			char[] instructions = p.toCharArray();
			int count = 0;
			for (int y = instructions.length-1 ; y >= 1; y-- ) {
				if (calculateDamage(instructions) <= d) {
					break; 
				}
				if (instructions[y] == 'S' && instructions[y-1] == 'C') {  // check
					instructions = swap(instructions, y);
					count++;
					int z = y;
					boolean flag = false;
					while (z < instructions.length-1 && instructions[z + 1] == 'S') {
						if (calculateDamage(instructions) <= d) {
							flag = true;
							break; 
						}
						instructions = swap(instructions, z + 1);
						count++;
						z++;
					}
					if(flag) {
						break;
					}
				}
			}
			if (calculateDamage(instructions) > d) {
				System.out.println("Case #" + i + ": IMPOSSIBLE");  
			} 
			else {
				System.out.println("Case #" + i + ": " +  count);  
			}
		}
	}
	
	private static int calculateDamage(char[] instructions) {
		int power = 1;
		int totalDamage = 0;
		for (int c = 0; c < instructions.length; c++) {
			if (instructions[c] == 'C') {
				power = power * 2;
			}
			else {
				totalDamage = totalDamage + power;
			}
		}
		return totalDamage;
	}
	
	private static char[] swap(char[] instructions, int t) {
		char change = instructions[t];
		instructions[t] = instructions[t-1];
		instructions[t-1] = change;
		return instructions;
	}
}
