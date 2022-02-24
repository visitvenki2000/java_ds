package tuf.common;

public class GridPath {

	static int [][] dp = new int [2][3];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<2;i++)
			for(int j=0;j<3;j++)
				dp[i][j]=-1;
			
		
		System.out.println("count "+countPath(0,0,2,3));
		
	}

	
	static int countPath(int i,int j,int n,int m){

		if(i>=n || j>=m)
			return 0;
		if(i==n-1 && j==m-1)
			return 1;
		
		if(dp[i][j]!=-1)
			return dp[i][j];
		else return  dp[i][j] = countPath(i+1,j,n,m)+countPath(i,j+1,n,m);
		
	
		
	}
	
}
