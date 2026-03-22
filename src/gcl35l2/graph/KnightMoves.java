package gcl35l2.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KnightMoves {

	public KnightMoves() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		bfsKnight(3,4,7,8);
	}
	

	
	static int [] x = {-2,-2,2,2,-1,1,1,-1};
	static int [] y = {-1,1,-1,1,2,2,-2,-2} ;

	public static void bfsKnight(int srcX, int srcY, int destX, int destY) {

		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(srcX, srcY)); // add source
		int N = 8;
		boolean[][] visited = new boolean[N+1][N+1];
		visited[srcX][srcY] = true; // mark source as visited
		int dist = 0;
		int ans = 0;
		while (!q.isEmpty()) {
			int size = q.size();
			while (size > 0) {
				size--;
				Pair u = q.poll();
			
					for (int temp = 0; temp < 8; temp++) {

						int X = x[temp] + u.x;
						int Y = y[temp] + u.y;
						
						if (destX == X && destY == Y) {
							ans = dist;
							break;
						}

						if (X >= 0 && Y >= 0 && X < N && Y < N) {
							if (visited[X][Y] == false ) {
								q.add(new Pair(X, Y));
							visited[X][Y] = true; 
							}
						}
					}
				}
			dist++;
			System.out.println("Distance " + dist);
		}
		System.out.println("FInal Moves " + ans);

	}
}

class Pair {
	
	int x;
	int y;
	public Pair(int x,int y){
		this.x= x;this.y=y;
	}
}
