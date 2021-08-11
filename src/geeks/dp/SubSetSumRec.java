package geeks.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetSumRec {

	public SubSetSumRec() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] data = {10,20,15};
		List<Integer> set = new ArrayList<Integer>();
	//	System.out.println("Count:"+findSubset2(data,25,3));
		
		//dp 
		
		System.out.println("Count:"+findSubsetDP(data,25,3));
		
	}
	
	public static int findSubset(int arr[], int sum, int n,List<Integer> set) {
		
		
		if(n==0) {
			int tempSum =0;
			for(int temp : set)
				tempSum =tempSum+temp;
			if(sum==tempSum) {
					
				System.out.println("Elements :"+set.toString());
						return 1;
			}
			else
				return 0;
		}
		List<Integer> newSet =  new ArrayList<Integer>();
		for(int temp : set)
			newSet.add(temp);
		
		newSet.add(arr[n-1]);
		return findSubset(arr,sum,n-1,set)+ 	findSubset(arr,sum,n-1,newSet);		
		
		
	}
	
	public static int findSubset2(int arr[], int sum, int n) {
		
		
		if(n==0) {
	
			if(sum==0) {					

						return 1;
			}
			else
				return 0;
		}
	
		return findSubset2(arr,sum,n-1)+ 	findSubset2(arr,sum-arr[n-1],n-1);		
		
		
	}
	public static int findSubsetDP(int arr[], int sum, int n) {
		
		int [] dp = new int[n+1];
		dp[0]=0;
	
	return 0;
		
		
	}


}
