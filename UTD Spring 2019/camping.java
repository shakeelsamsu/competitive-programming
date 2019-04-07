import java.io.*;
import java.util.*;

//Solved by Shakeel
//Solved During Contest
public class camping {
    
    private static char[][] grid;
    private static boolean[][] visited;
    private static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    private static boolean status;
    
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = Integer.parseInt(in.readLine());
        while(n-- > 0) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            grid = new char[r][c];
            visited = new boolean[r][c];
            for(int i = 0; i < r; i++) {
                String line = in.readLine();
                for(int j = 0; j < c; j++) {
                    grid[i][j] = line.charAt(j);
                }
            }
            status = true;
            floodfill(0, 0);
            out.println(status ? "Valid" : "Invalid");
        }
        out.close();
    }
    
    private static void floodfill(int r, int c) {
        if(r < 0 || r > grid.length || c < 0 || c > grid[0].length)
            return;
        
        if(visited[r][c]) 
            return;
        visited[r][c] = true;
        
        for(int i = 0; i < 8; i++) {
            if(inRange(r + dx[i], c + dy[i])) {
                if(grid[r + dx[i]][c + dy[i]] == 't' && grid[r][c] == 't') {
                    status = false;
                }
                floodfill(r + dx[i], c + dy[i]);
            }
        }
    }
    
    private static boolean inRange(int r, int c) {
        return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
    }
}