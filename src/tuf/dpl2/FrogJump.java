package tuf.dpl2;

import java.util.*;

public class FrogJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] ={10,20,30,10};
		System.out.println(frogJump(arr.length,arr)+"--");
		System.out.println(frogJumpTab(arr.length,arr)+"--");
		
		// temp 
		ArrayList t = null;
		//t.s
		//t.ge
				
	}
	
	
	 public static int frogJumpTab(int n, int heights[]) {

	        // Write your code here..
	        
	        int dp[] = new int[heights.length+1];
	        dp[0]=0;
	        
	        for(int i=1;i<n;i++){
	        	
	        	int first = dp[i-1]+Math.abs(heights[i]-heights[i-1]);
	        	int sec = Integer.MAX_VALUE;
	        	if(i>1)
	        		sec= dp[i-2]+Math.abs(heights[i]-heights[i-2]);
	        	dp[i]=Math.min(first, sec);
	        	
	        }
	        
	        
	       return dp[n-1];
	    }
	 public static int frogJump(int n, int heights[]) {

	        // Write your code here..
	        
	        int dp[] = new int[heights.length+1];
	        Arrays.fill(dp,-1);
	       return jumpRec(n-1,heights,dp);
	    }
	    public static int jumpRec(int n,int heights[],int dp[]){
	       if(dp[n]!=-1)
	            return dp[n];
	        if(n==0){
	            dp[0]=0;
	            return 0;
	        }
	        int right =Integer.MAX_VALUE;;
	        int left = Math.abs(heights[n]-heights[n-1])+jumpRec(n-1,heights,dp);
	        if(n>1)
	         right =Math.abs(heights[n]-heights[n-2])+jumpRec(n-2,heights,dp);
	        dp[n] = Math.min(right,left);
	        return dp[n];
	        
	    }
	    
	    public static int frogJumpK(int n, int heights[],int k) {

	        // Write your code here..
	        
	        int dp[] = new int[heights.length+1];
	        Arrays.fill(dp,-1);
	       return jumpRecK(n-1,heights,dp, k);
	    }
	    public static int jumpRecK(int n,int heights[],int dp[],int k){
	       if(dp[n]!=-1)
	            return dp[n];
	        if(n==0){
	            dp[0]=0;
	            return 0;
	        }
	        int right =Integer.MAX_VALUE;;
	        int left = Math.abs(heights[n]-heights[n-1])+jumpRecK(n-1,heights,dp,k);
	        for(int i=2;i>=k;i++) {
	        	if(n-i>=0)
	         right =Math.abs(heights[n]-heights[n-i])+jumpRecK(n-i,heights,dp,k);
	         left =  Math.min(right,left);
	        }
	        dp[n] = left;
	        return dp[n];
	        
	    }



}
