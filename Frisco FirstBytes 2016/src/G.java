import java.util.*;
import java.io.*;

public class G {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
			Scanner in = new Scanner(new File("G.in"));
			while(in.hasNext()) {
				int points = 0;
				int count = 0;
				int n = in.nextInt();
				for(int i = 0; i < n; i++) {
					String score = in.next();
					if(score.equals("touchdown")) {
						count += 7;
						points += count;
					}
					if(score.equals("field")) {
						count += 3;
						points += count;
						in.nextLine();
					}
					if(score.equals("safety")) {
						count += 2;	
						points += count;
					}
				}
				if(n > 0) System.out.println("Ensign Redshirt does " + points + " pushups!");
			}
	}
	
}
