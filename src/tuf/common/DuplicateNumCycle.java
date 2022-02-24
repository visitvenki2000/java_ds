package tuf.common;

public class DuplicateNumCycle {

	/*
	 * slow move 1 fast 2 steps
	 * after collision move fast to start....start moving both 1 step....to check cycle.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {2,5,9,6,9,3,8,9,7,1};
		System.out.println(findDuplicate(arr));
		

	}
	
	public static int findDuplicate(int [] arr){
		
		int  fast  =arr[0];
			int	slow =arr[0];

              do{
            	  slow = arr[slow];
            	  fast = arr[arr[fast]];
            	  
              }	 
				while(slow!=fast) ;
			
				fast=arr[0];
				while(slow!=fast)
				{
				   	  slow = arr[slow];
	            	  fast = arr[fast];
				}

			return	slow;

		
	}

}
