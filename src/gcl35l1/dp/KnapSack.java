package gcl35l1.dp;

import java.util.ArrayList;
import java.util.Arrays;

public class KnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] wt = {10,5,2,4};
		int [] val = {30,10,20,30};

		
		int knapsack = 12;
		int [] [] dp = new int[wt.length][knapsack];
		
        for(int i=0;i<wt.length;i++) 
	        Arrays.fill(dp[i],-1);

		int result = knapsackdp(wt,val,12,0,0,dp);
		System.out.println("------ result "+result);
		
		
	}
	
	
public static int knapsack(int[] weight,int[] value,int total,int index,int sum){
		
		
	if(index==weight.length){
		return 0;	
	}


  int exclude = knapsack(weight,value,total,index+1,sum);

  int include =0;
  if(sum+weight[index]<total) {
  
   include = knapsack(weight,value,total,index+1,sum+weight[index])+value[index];
  }
  

return Math.max(include, exclude);

}

public static int knapsackdp(int[] weight,int[] value,int total,int index,int wt,	int [] [] dp){
	
	
	if(index==weight.length){
		return 0;	
	}

	if(dp[index][wt]!=-1) 
		return dp[index][wt];

  int exclude = knapsackdp(weight,value,total,index+1,wt,dp);

  int include =0;
  if(wt+weight[index]<total) {
  
   include = knapsackdp(weight,value,total,index+1,wt+weight[index],dp)+value[index];
   
  
  }
  dp[index][wt]=Math.max(include, exclude);

return dp[index][wt];

}

}
