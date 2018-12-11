
import java.io.*;
import java.util.*;

public class tttt {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("tttt.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("tttt.out")));

        String[] row1 = new String[3];
        String[] row2 = new String[3];
        String[] row3 = new String[3];
        for(int i = 0; i < 3; i++) {
            String line = in.readLine();
            if(i == 0) for(int j = 0; j < 3; j++) row1[j] = line.substring(j, j + 1);
            else if(i == 1) for(int j = 0; j < 3; j++) row2[j] = line.substring(j, j + 1);
            else for(int j = 0; j < 3; j++) row3[j] = line.substring(j, j + 1);
        }
        String[] col1 = {row1[0], row2[0], row3[0]};
        String[] col2 = {row1[1], row2[1], row3[1]};
        String[] col3 = {row1[2], row2[2], row3[2]};
        String[] diag1 = {row1[0], row2[1], row3[2]};
        String[] diag2 = {row1[2], row2[1], row3[0]}; 
        HashSet<String> individuals = new HashSet<String>();
        int onesCount = 0;
        if(containsOne(row1)) {
            if(!individuals.contains(row1[0])) {
                onesCount++;
                individuals.add(row1[0]);
            }
        }
        if(containsOne(row2)) {
            if(!individuals.contains(row2[0])) {
                onesCount++;
                individuals.add(row2[0]);
            }        
        }
        if(containsOne(row3)) {
            if(!individuals.contains(row3[0])) {
                onesCount++;
                individuals.add(row3[0]);
            }        
        }
        if(containsOne(col1)) {
            if(!individuals.contains(col1[0])) {
                onesCount++;
                individuals.add(col1[0]);
            }        
        }
        if(containsOne(col2)) {
            if(!individuals.contains(col2[0])) {
                onesCount++;
                individuals.add(col2[0]);
            }        
        }
        if(containsOne(col3)) {
            if(!individuals.contains(col3[0])) {
                onesCount++;
                individuals.add(col3[0]);
            }        
        }
        if(containsOne(diag1)) {
            if(!individuals.contains(diag1[0])) {
                onesCount++;
                individuals.add(diag1[0]);
            }        
        }
        if(containsOne(diag2)) {
            if(!individuals.contains(diag2[0])) {
                onesCount++;
                individuals.add(diag2[0]);
            }        
        }
        int twosCount = 0;
        HashSet<HashSet<String>> teams = new HashSet<HashSet<String>>();
        if(containsTwo(row1)) {
            if(!teams.contains(removeDuplicates(row1))) {
                twosCount++;
                HashSet<String> temp = removeDuplicates(row1);
                teams.add(temp);
            }
        }
        if(containsTwo(row2)) {
            if(!teams.contains(removeDuplicates(row2))) {
                twosCount++;
                HashSet<String> temp = removeDuplicates(row2);
                teams.add(temp);
            }
        }
        if(containsTwo(row3)) {
            if(!teams.contains(removeDuplicates(row3))) {
                twosCount++;
                HashSet<String> temp = removeDuplicates(row3);
                teams.add(temp);
            }
        }
        if(containsTwo(col1)) {
            if(!teams.contains(removeDuplicates(col1))) {
                twosCount++;
                HashSet<String> temp = removeDuplicates(col1);
                teams.add(temp);
            }
        }
        if(containsTwo(col2)) {
            if(!teams.contains(removeDuplicates(col2))) {
                twosCount++;
                HashSet<String> temp = removeDuplicates(col2);
                teams.add(temp);
            }
        }
        if(containsTwo(col3)) {
            if(!teams.contains(removeDuplicates(col3))) {
                twosCount++;
                HashSet<String> temp = removeDuplicates(col3);
                teams.add(temp);
            }
        }
        if(containsTwo(diag1)) {
            if(!teams.contains(removeDuplicates(diag1))) {
                twosCount++;
                HashSet<String> temp = removeDuplicates(diag1);
                teams.add(temp);
            }
            //out.println(Arrays.toString(removeDuplicates(diag1)));
        }
        if(containsTwo(diag2)) {
            if(!teams.contains(removeDuplicates(diag2))) {
                twosCount++;
                HashSet<String> temp = removeDuplicates(diag2);
                teams.add(temp);
            }
        }
        // for(HashSet<String> s : teams) out.println(s);
        // out.println(Arrays.toString(row1));
        // out.println(Arrays.toString(row2));
        // out.println(Arrays.toString(row3));
        // out.println(Arrays.toString(col1));
        // out.println(Arrays.toString(col2));
        // out.println(Arrays.toString(col3));
        // out.println(Arrays.toString(diag1));
        // out.println(Arrays.toString(diag2));
        out.println(onesCount);
        out.println(twosCount);
        out.close();
    }

    public static boolean containsOne(String[] arr) {
        String s = arr[0];
        return arr[1].equals(s) && arr[2].equals(s);
    }

    public static boolean containsTwo(String[] arr) {
        HashSet<String> items = new HashSet<String>();
        for(String s : arr) {
            items.add(s);
        }
        return items.size() == 2;
    }

    public static HashSet<String> removeDuplicates(String[] arr) {
        HashSet<String> items = new HashSet<String>();
        for(String s : arr) {
            items.add(s);
        }
        return items;
    }
}
