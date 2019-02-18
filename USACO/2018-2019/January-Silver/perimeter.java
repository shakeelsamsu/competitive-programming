import java.io.*;
import java.util.*;

public class perimeter {
    
    private static int perimeter;
    private static int area;
    private static boolean[][] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("perimeter.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("perimeter.out")));

        int n = Integer.parseInt(in.readLine());
        char[][] grid = new char[n][n];
        visited = new boolean[n][n];
        for(int i = 0; i < n; i++) {
            String line = in.readLine();
            for(int j = 0; j < n; j++) {
                grid[i][j] = line.charAt(j);
            }
        }
        int maxArea = 0;
        int maxPerimeter = 0;
        ArrayList<Integer> areas = new ArrayList<Integer>();
        ArrayList<Integer> perimeters = new ArrayList<Integer>();
        int minPerimeter = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                area = floodfill(grid, i, j);
                if(area >= maxArea) {
                    if(area == maxArea) {
                        if(perimeter < minPerimeter) minPerimeter = perimeter;
                    }
                    else minPerimeter = perimeter;
                    maxArea = area;
                }
                perimeter = 0;
            }
        }
        out.print(maxArea + " " + minPerimeter);
        out.close();
    }

    private static int floodfill(char[][] grid, int r, int c) {
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length) 
            return 0;
        visited[r][c] = true;
        if(grid[r][c] == '.')
            return 0;
        area = 1;
        if(inRange(grid, r + 1, c) && grid[r + 1][c] == '.') perimeter++;
        else if(!inRange(grid, r + 1, c)) perimeter++;
        if(inRange(grid, r - 1, c) && grid[r - 1][c] == '.') perimeter++;
        else if(!inRange(grid, r - 1, c)) perimeter++;
        if(inRange(grid, r, c + 1) && grid[r][c + 1] == '.') perimeter++;
        else if(!inRange(grid, r, c + 1)) perimeter++;
        if(inRange(grid, r, c - 1) && grid[r][c - 1] == '.') perimeter++;
        else if(!inRange(grid, r, c - 1)) perimeter++;
        if(inRange(grid, r + 1, c) && !visited[r + 1][c]) area += floodfill(grid, r + 1, c);
        if(inRange(grid, r - 1, c) && !visited[r - 1][c]) area += floodfill(grid, r - 1, c);
        if(inRange(grid, r, c + 1) && !visited[r][c + 1]) area += floodfill(grid, r, c + 1);
        if(inRange(grid, r, c - 1) && !visited[r][c - 1]) area += floodfill(grid, r, c - 1);
        return area;
    }

    private static boolean inRange(char[][] grid, int r, int c) {
        return r >= 0 && c >= 0 && r < grid.length && c < grid[0].length;   
    }

    private static void remove(ArrayList<Integer> areas, ArrayList<Integer> perimeters) {
        int max = Collections.max(areas);
        for(int i = 0; i < areas.size(); i++) {
            if(areas.get(i) != max) {
                areas.remove(i);
                perimeters.remove(i);
            }
        }
    }
}