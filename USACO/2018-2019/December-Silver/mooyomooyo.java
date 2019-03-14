import java.io.*;
import java.util.*;

public class mooyomooyo {
    
    private static boolean[][] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("mooyomooyo.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("mooyomooyo.out")));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] grid = new int[n][10];
        for(int i = 0; i < n; i++) {
            String line = in.readLine();
            for(int j = 0; j < 10; j++) {
                int x = Integer.parseInt(line.substring(j, j + 1));
                grid[i][j] = x;
            }
        }
        boolean exists = true;
        while(exists) {
            exists = false;
            for(int i = 0; i < n; i++) {
                int area = 0;
                for(int j = 0; j < 10; j++) {
                    visited = new boolean[n][10];
                    if(grid[i][j] != 0)
                        area = floodfill(grid, i, j, grid[i][j], false);
                    visited = new boolean[n][10];
                    if(area >= k) {
                        floodfill(grid, i, j, grid[i][j], true);
                        exists = true;
                    }
                }
            }
            // for(int[] i : grid) out.println(Arrays.toString(i));
            // out.println();
            gravity(grid);
            gravity(grid);
            gravity(grid);
            gravity(grid);
            gravity(grid);
            gravity(grid);
            gravity(grid);
            gravity(grid);
            gravity(grid);
            gravity(grid);
            gravity(grid);
            gravity(grid);
            gravity(grid);
            gravity(grid);
            gravity(grid);
            // for(int[] i : grid) out.println(Arrays.toString(i));
            // out.println();
        }
        // out.println();
        for(int[] i : grid) { 
            for(int j : i) 
                out.print(j);
            out.println();
        }
        out.close();
    }

    private static int floodfill(int[][] grid, int r, int c, int x, boolean clear) {
        if(r < 0 || c < 0 || r >= grid.length || c>= grid[0].length) 
            return 0;
        visited[r][c] = true;
        if(grid[r][c] != x)
            return 0;
        if(clear) grid[r][c] = 0;
        int area = 1;
        if(inRange(grid, r + 1, c) && !visited[r + 1][c]) area += floodfill(grid, r + 1, c, x, clear);
        if(inRange(grid, r - 1, c) && !visited[r - 1][c]) area += floodfill(grid, r - 1, c, x, clear);
        if(inRange(grid, r, c + 1) && !visited[r][c + 1]) area += floodfill(grid, r, c + 1, x, clear);
        if(inRange(grid, r, c - 1) && !visited[r][c - 1]) area += floodfill(grid, r, c - 1, x, clear);
        return area;
    }

    private static boolean inRange(int[][] grid, int r, int c) {
        return r >= 0 && c >= 0 && r < grid.length && c < grid[0].length;
    }

    private static void gravity(int[][] grid) {
        if(grid.length == 1) return;
        for(int i = grid.length - 1; i >= 1; i--) {
            for(int j = 0; j < 10; j++) {
                if(grid[i][j] == 0) {
                    for(int k = i; k >= 1; k--) {
                        grid[k][j] = grid[k - 1][j];
                    }
                    grid[0][j] = 0;
                }
            }
        }
    }
}