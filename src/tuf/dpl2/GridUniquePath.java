package tuf.dpl2;


import java.util.*;
public class GridUniquePath {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int uniquePaths(int m, int n) {
		// Write your code here.
        int[][] dp = new int[m][n]; 
        for(int i=0;i<m;i++)
            Arrays.fill(dp[i],-1);
            
      return  pathRecursion(m,n,0,0,dp);
	}
    public static int pathRecursion(int m, int n,int i, int j,int[][] dp){
        
        if(i==m-1 && j==n-1)
            return 1;
        if(i>=m || j>=n)
            return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        else
        return pathRecursion(m,n,i+1,j,dp)+pathRecursion(m,n,i,j+1,dp);
        
    }
    public static int uniquePaths2(int m, int n) {
		// Write your code here.
        int[][] dp = new int[m][n]; 
        for(int i=0;i<m;i++)
            Arrays.fill(dp[i],-1);
            
      return  pathRecursion(m,n,0,0,dp);
	}

	public static int uniquePathsTab(int m, int n, int[][] dp) {
		for (int i = m - 1; i >= 0; i--)
			for (int j = n - 1; j >= 0; j--) {
				if (i == m - 1 && j == n - 1)
					dp[i][j] = 1;
				else {
					int left = 0;
					int top = 0;
					if (i < m - 1)
						left = dp[i + 1][j];
					if (j < n - 1)
						top = dp[i][j + 1];
					dp[i][j] = left + top;
				}
			}
		
		return dp[0][0];

	}
	
	public static int uniquePathsTabOptimised(int m, int n) {
	     int [] prev =new int[m];
            Arrays.fill(prev,0);
           
           for( int i=m-1;i>=0;i--) {
              int []  temp  =new int[n];               
               for(int j=n-1;j>=0;j--){  
                   if(i==m-1 && j==n-1)
                       temp[j]=1;
                   else {
                       int left=0; int top=0;
                        if(i<m-1) left = prev[j];
                      if(j<n-1)top =temp[j+1];
                  temp[j]=left+top;
                   }
                             
                   }  
           prev =temp;
               }                    
           return prev[0];      
	}

}