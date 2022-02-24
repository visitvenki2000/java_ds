package tuf.dpl2;

import java.util.*;
/* tested in coding ninjas*/
public class MaxSumRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> list = new ArrayList<Integer> ();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		maximumNonAdjacentSum(list);
		
	}
	
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
        int dp[] = new int[nums.size()];
        Arrays.fill(dp,-1);
       return maxRec(nums.size()-1,nums,dp);
        
	}
    public static int maxRec(int n, ArrayList<Integer> nums,int dp[]){
        
        if(n==0)
            return nums.get(0);
        if(n<0)
            return 0;
        if(dp[n]!=-1) return dp[n];
        int pick = nums.get(n)+maxRec(n-2,nums,dp);
        int notPick = 0 + maxRec(n-1,nums,dp);
        dp[n]=Math.max(pick,notPick);
        return dp[n];
        
        
    }
    
    public static int maximumNonAdjacentSumTab_space(ArrayList<Integer> nums) {
		// Write your code here.
        int prev = nums.get(0);
        int prev2 =0;
        int N = nums.size();
        for(int i=1;i<N;i++){
            int pick = nums.get(i);
            if(i>1)
                pick+=prev2;
            int notPick = prev;
            int curr = Math.max(pick,notPick);
           prev2 = prev;
            prev = curr;
        }
   return prev;     
	}

}
