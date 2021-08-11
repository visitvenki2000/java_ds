package geeks.arrays;

import geeks.Util;

public class PreFix {

	public PreFix() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PreFix max = new PreFix();
		int [] data = {2,8,3,9,6,5,4};
		int [] prefix_sum = max.getPrefixSum(data);
	
		
		System.out.println("--Prefix sum "+max.getQuery(0, 2, prefix_sum));
		
		System.out.println("--Prefix sum "+max.getQuery(1, 3, prefix_sum));
		System.out.println("--Prefix sum "+max.getQuery(2, 6, prefix_sum));
		
		int [] data2  = {4,2,-2};
		
		
		
	}
	
	public int [] getPrefixSum(int [] data) {
		
		int [] sum = new int [data.length];
		 sum[0] = data[0];
	
		for(int i=1;i<data.length;i++)
		{
			
		sum[i] =sum[i-1]+data[i];

				
		}
	
		Util.print(sum);
		return sum;
	}
	public int getQuery(int start ,int end  , int [] prefix) {
		
		
		if(start>0)
		return prefix[end]-prefix[start-1];
		else 
			return prefix[end];
		
		
		
	}
/*
 * o/p 
 *-2-10-13-22-28-33-37
--Prefix sum 13
--Prefix sum 20
--Prefix sum 27
 *
 *
 */

}
