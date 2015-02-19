import java.util.*;
import java.io.*;
class ABCPATH{
	static char [][] matrix;
	static int [][] distance;
	static int [] dx = {0, 0, 1, -1, 1, -1, -1, 1};
	static int [] dy = {1, -1, 0, 0, 1, 1, -1, -1};
	
	public static void main (String [] args) throws IOException{
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter (new BufferedWriter (new OutputStreamWriter (System.out)));
		
		StringTokenizer st = new StringTokenizer (in.readLine());
		int rows = Integer.parseInt(st.nextToken());
		int cols = Integer.parseInt(st.nextToken());
		int test = 1;
		while (rows != 0 && cols != 0){
			
			matrix = new char [rows][cols];
			for (int r = 0; r < rows; r++){
				String s = in.readLine();
				for (int c = 0; c < cols; c++){
					char ch = s.charAt(c);
					matrix[r][c] =  ch;
				}
			}
			
			distance = new int [rows][cols];
			for (int r = 0; r < rows; r++){
				for (int c = 0; c < cols; c++){
					distance[r][c] = -1;
				}
			}
			
			// now go through the matrix and do the search
			int maxCount = -1;
			for (int r = 0; r < rows; r++){
				for (int c = 0; c < cols; c++){
					if (matrix[r][c] == 'A' && distance[r][c] == -1){
						maxCount = Math.max(maxCount, dfs(r, c));
					}
				}
			}
			
			/**
			for(int r = 0; r < rows; r++){
				for (int c = 0; c < cols; c++){
					out.printf("%d, ", distance[r][c]);
				}
				out.printf("\n");
			} **/
			
			out.printf("Case %d: %d%n",test, maxCount + 1);
			test++;
			
			st = new StringTokenizer(in.readLine());
			rows = Integer.parseInt(st.nextToken());
			cols = Integer.parseInt(st.nextToken());
		}
		
		out.close();
	}
	
	public static int dfs(int x, int y){
		if (distance[x][y] != -1){
			return distance[x][y];
		}
		distance[x][y] = 0;
		
		for (int i = 0; i < 8; i++){
			int newX = x + dx[i];
			int newY = y + dy[i];
			
			if (newX >= 0 && newX < matrix.length && newY >= 0 && 
			newY < matrix[0].length && matrix[newX][newY] == matrix[x][y] + 1){
				distance[x][y] = Math.max(distance[x][y], 1 + dfs(newX, newY));
			}
		}
		return distance[x][y];
	}
}
