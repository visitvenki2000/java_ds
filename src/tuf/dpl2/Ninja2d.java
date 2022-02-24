package tuf.dpl2;

import java.util.Arrays;

public class Ninja2d {

	

	public static void main(String[] args) {
		
		  int [][] dp = new int[5][3];
		  for(int i=0;i<5;i++) {
	        Arrays.fill(dp[i],-1);
	        
	        
	       // System.out.println("--"+Arrays.toString(dp[i]));
	       
		  }
	       // for (int[] row: dp)
	         //   Arrays.fill(row, -1);
		  
		  int [][] points ={{1,2,5}, {3 ,1 ,1} ,{3,3,3} };
		  
		  System.out.println("--"+ninjaTraining(3,points));
	}
	
	
	
	 public static int ninjaTraining(int n, int points[][]) {

	        // Write your code here..
	        int [][] dp = new int[n][4];
	        
	         for(int i=0;i<n;i++) 
		        Arrays.fill(dp[i],-1);
	        
	      return  recur(n-1,points,dp,3);
	     
	    }
	    
	  public static int recur(int n,int points[][], int [][]dp, int prev){
	        
	        if(n==0){
	           // if(dp[0][prev]!=-1) return dp[0][prev];                
	            int max =0;
	            for(int i=0;i<3;i++){
	                if(i!=prev)
	                max = Math.max(max,points[0][i]);
	            }
	          //  dp[0][prev]=max;
	            return max;            
	        }
	        
	        int max =0;
	         if(dp[n][prev]!=-1) return dp[n][prev];
	        
	           for(int i=0;i<3;i++){
	               int score =0;
	                if(i!=prev) {
	                score = points[n][i]+recur(n-1,points,dp,i);
	                    max = Math.max(max,score);
	                }
	            }
	            dp[n][prev]=max;
	            return max;
	        
	    }

}
