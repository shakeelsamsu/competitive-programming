import java.util.*;
import java.io.*;

public class wander {
    private static int[][] directions = new int[][]{{-1,-1}, {-1,0}, {-1,1},  {0,1}, {1,1},  {1,0},  {1,-1},  {0, -1}};
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("wander.txt"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            int rows = Integer.parseInt(st.nextToken());
            int cols = Integer.parseInt(st.nextToken());
            int[][] grid = new int[rows][cols];
            boolean bonus = true;
            for(int r = 0; r < rows; r++) {
                st = new StringTokenizer(in.readLine());
                for(int c = 0; c < cols; c++) {
                    grid[r][c] = Integer.parseInt(st.nextToken());
                }
            }
            for(int z = 0; z < rows; z++) {
                for(int v = 0; v < cols; v++) {
                    List<Integer> surroundings = new ArrayList<Integer>(getSurroundings(grid, v, z));
                    //System.out.println("surroundings: " + surroundings);
                    if(!surroundings.contains(grid[z][v] + 1) && grid[z][v] != rows * cols) {
                        //out.println("x: " + z + " y: " + v + " gridVal: " + grid[z][v] + " surroundings: " + surroundings);
                        v = cols;
                        z = rows;
                        out.println("No Bonus");
                        bonus = false;
                        break;
                    }    
                }
            }
            if(bonus) out.println("Bonus");
        }
        out.close();
    }

    public static List<Integer> getSurroundings(int[][] matrix, int x, int y){
        List<Integer> res = new ArrayList<Integer>();
        for (int[] direction : directions) {
            int cx = x + direction[0];
            int cy = y + direction[1];
            if(cy >=0 && cy < matrix.length)
                if(cx >= 0 && cx < matrix[cy].length)
                    res.add(matrix[cy][cx]);
        }
        return res;
    }

}