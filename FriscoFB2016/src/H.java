import java.util.*;
import java.io.*;

public class H {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("H.in"));
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int r1 = in.nextInt();
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			int r2 = in.nextInt();
			int overlap = intersect(x1, y1, r1, x2, y2, r2);
			if(overlap == 1) System.out.println("The orbits are tangetial.");
			if(overlap == -1) System.out.println("The orbits don't overlap.");
			if(overlap == 0) System.out.println("The orbits overlap.");
		}
	}
	//Two circles overlap based on the sum of the raddi squared and the sum of the distances squared
	public static int intersect(int x1, int y1, int r1, int x2, int y2, int r2) {
		int distSq = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
		int radSq = (r1 + r2) * (r1 + r2); 
		if(distSq == radSq) return 1;
		if(distSq > radSq) return -1;
		return 0;
	}

}
