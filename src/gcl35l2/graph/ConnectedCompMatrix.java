package gcl35l2.graph;

public class ConnectedCompMatrix {

	public ConnectedCompMatrix() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {
				{1,0,1},
				{0,1,0},
				{1,0,0}
				};
	
		
		int M=  matrix.length;
		int N = matrix[0].length;
		
		boolean[][] visited = new boolean [M][N];
		int count =0;
		
		for(int i=0;i<M;i++)
			for(int j=0;j<N;j++)
			if(matrix[i][j]==1 && visited[i][j]==false) {
				count++;
				dfs(i,j,M,N,matrix,visited);
			}
		
System.out.println("count "+count);
	}
   public static int [] x = {0,1,0,-1};
  public static int [] y = {1,0,-1,0};
	public static void dfs(int i, int j, int m, int n, int[][] matrix, boolean[][] visited) {

		if (visited[i][j] == false) {
			visited[i][j] = true;

			for (int temp = 0; temp < 4; temp++) {

				int X = x[temp] + i;
				int Y = y[temp] + j;

				if (X >= 0 && Y >= 0 && X < n && Y < m) {
					if (visited[X][Y] == false && matrix[X][Y] == 1)
						dfs(X, Y, m, n, matrix, visited);
				}

			}

		}
		
		
	}
	
	

}
