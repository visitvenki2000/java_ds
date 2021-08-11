package geeks.arrays;

public class TempArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr2 = {-5,1,-2,3,-1,2,-2};
		
		int [] arr1 = {10,12,14,7,8};
		
		maxEventOdd(arr1);
	}
	
	public static void maxSubArray(int [] arr) {
		
		int maxSub = -5;
		int n=arr.length;
		int result =-5;
		for(int i=1;i<n;i++) {
			
			 maxSub = Math.max(maxSub+arr[i],arr[i]);
			 result = Math.max(result, maxSub);
			
			System.out.println("loop "+result);
		}
		System.out.println("Max Sum sub array "+result);
		
	}
	public static void maxEventOdd(int[] arr) {
		
		
		int max =1;
		int count =1;
	
		for(int i =1; i<arr.length;i++) {
			
			System.out.println("Max Sum sub array 1 "+arr[i-1]%2);
			System.out.println("Max Sum sub array2  "+arr[i]%2);
			if((arr[i-1]%2==0 && arr[i]%2!=0) || (arr[i-1]%2!=0 && arr[i]%2==0)){
				
				count++;
				System.out.println("count if "+count);
				max = Math.max(count, max);
				
			}else {
				
			
				count=1;
				System.out.println("count else  "+count);
			}
		}
		
		System.out.println("maxEventOdd "+max);
		
	}

}
