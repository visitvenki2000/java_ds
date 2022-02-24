package geeks.arrays;

import java.util.Arrays;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int [] arr=   {10,-1,-2,-3,4,-1} ;// {1,2,4,-6,7};
		
 System.out.println( findMaxSubCirc(arr));
	}

	
	public static int findMaxSub(int arr[]){
		
		int sum = arr[0];
		int result = sum;
		
		int size =arr.length;

		for(int i=1;i<size;i++){
			
			if(sum<0) {
				sum=0;
			
			}
			sum = arr[i]+sum;
			result = Math.max(result,sum);
			Arrays.fill(arr, -1);
			
		}
		
		return result;
	}
	public static int findMaxSubCirc(int arr[]){
		

		int max_result =Integer.MIN_VALUE;
		
		int size =arr.length;
		
		int totalsum =0;
			for(int i=0;i<size;i++){
	
			totalsum = arr[i]+totalsum;
			arr[i] = -arr[i];
			}

			 System.out.println( " totalsum "+totalsum);
			 System.out.println( " Arrays  "+Arrays.toString(arr));
			 
				int sum = 0;
				int result = 0;
		for(int i=0;i<size;i++){
	
			if(sum<0) {
				sum=0;		
			}
			sum = arr[i]+sum;
			result = Math.max(result,sum);
			
		}
		 System.out.println( " max sub array "+result);
		 
		max_result = Math.max(max_result, totalsum+result);
		
		return max_result;
	}
	
}
