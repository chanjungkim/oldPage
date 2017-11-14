import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	static int[][] map;
	static boolean[][] isVisited;
	static int countGraph = 0;
	static int isConnected;
	static int numOfVertices;
	static Pair start;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] in = null;
		try {
			in = br.readLine().split(" ");
		} catch (IOException e) {
			System.out.println("INPUT ERROR");
			e.printStackTrace();
		}

		numOfVertices = Integer.parseInt(in[0]);
		map = new int[numOfVertices][numOfVertices];
		
		int n = Integer.parseInt(in[1]);

		for (int i = 0; i < n; i++) {
			String[] line = null;

			try {
				line = br.readLine().split(" ");
			} catch (IOException e) {
				System.out.println("LINE INPUT ERROR");
				e.printStackTrace();
			}
			int y = Integer.parseInt(line[0]);
			int x = Integer.parseInt(line[1]);
			map[y-1][x-1] = 1;
			map[x-1][y-1] = 1;
		}
		
		int once = 0;
		for(int i = 0 ; i < numOfVertices ; i++) {
			for(int j = 0 ; j < numOfVertices ; j++) {
				System.out.print(map[i][j]+" ");
				if(once < 1 && map[i][j] == 1) {
					once++;
					start = new Pair(i, j);
				}
			}
			System.out.println();
		}
		System.out.println(start.y+", "+start.x+"¿¡¼­ start");
		
		bfs(start.x, start.y);
		
		System.out.println(countGraph);
	}
	public static void bfs(int y, int x) {
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = y ; i < numOfVertices ; i++) {
			for(int j = 0 ; j < numOfVertices ; j++) {
				while(!queue.isEmpty()) {
					if(map[i][j] == 1) {
						bfs(i, j);
						map[i][j] = 0;
					}
				}
			}
		}
	}
}
class Pair{
	public int y;
	public int x;
	
	public Pair(int y, int x) {
		this.y = y;
		this.x = x;
	}
}