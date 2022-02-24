package tuf.common;

public class MaxSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int [] arr = {-1,-3,4,-1,-2,1,5,-3};
  System.out.println(maxSum(arr));
		
	}
	
	public static int maxSum(int arr[]){
		
		int sum =0;
		int max = arr[0];
		
		for(int i=0;i<arr.length-1;i++){
			
			sum +=arr[i];
			max = Math.max(sum,max);
			if(sum<0)
				sum=0;
		}
		return max;
	}

}
