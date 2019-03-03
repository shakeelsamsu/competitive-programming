import java.io.*;
import java.util.*;
import java.math.*;

public class prob21 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("data/prob21.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		String line = in.readLine();
		
		int year = Integer.parseInt(line.substring(0, line.indexOf("-")));
		int month = Integer.parseInt(line.substring(line.indexOf("-") + 1, line.lastIndexOf("-")));
		int day = Integer.parseInt(line.substring(line.lastIndexOf("-") + 1));
		String sign = "";
		if(month == 3 && day >= 21 || month == 4 && day <= 19)
			sign = "Aires";
		else if(month == 4 && day >= 20 || month == 5 && day <= 20)
			sign = "Taurus";
		else if(month == 5 && day >= 21 || month == 6 && day <= 20)
			sign = "Gemini";
		else if(month == 6 && day >= 21 || month == 7 && day <= 22)
			sign = "Cancer";
		else if(month == 7 && day >= 23 || month == 8 && day <= 22)
			sign = "Leo";
		else if(month == 8 && day >= 23 || month == 9 && day <= 22)
			sign = "Virgo";
		else if(month == 9 && day >= 23 || month == 10 && day <= 22)
			sign = "Libra";
		else if(month == 10 && day >= 23 || month == 11 && day <= 21)
			sign = "Scorpio";
		else if(month == 11 && day >= 22 || month == 12 && day <= 21)
			sign = "Sagittarius";
		else if(month == 12 && day >= 22 || month == 1 && day <= 19)
			sign = "Capricorn";
		else if(month == 1 && day >= 20 || month == 2 && day <= 18)
			sign = "Aquarius";
		else if(month == 2 && day >= 19 || month == 3 && day <= 20)
			sign = "Pisces";
		
		String z;
		String[] zodiacs = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep", "Monkey", "Rooster", "Dog", "Pig"};
		String[] zodiacs2 = {"Rat", "Pig", "Dog", "Rooster", "Monkey", "Sheep", "Horse", "Snake", "Dragon", "Rabbit", "Tiger", "Ox"};
		if(year >= 1900) 
			z = zodiacs[(year - 1900) % 12];
		else 
			z = zodiacs2[((1900 - year) % 12)];
			
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		out.println("If you were born on " + months[month - 1] + " " + day + ", your sign is " + sign + ".");
		out.println(year + " is the year of the " + z + ".");
		out.close();	
	}
}