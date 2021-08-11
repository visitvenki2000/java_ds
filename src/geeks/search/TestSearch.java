package geeks.search;

public class TestSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] data = {10,20,30,40,50,70,80,90,100};
		
		System.out.println("30 :"+search1(data,data.length,30));
		
		System.out.println("50: "+search1(data,data.length,50));
		System.out.println("80 : "+search1(data,data.length,80));
		System.out.println("100 : "+search1(data,data.length,100));
		
		System.out.println("10 : "+search1(data,data.length,10));
		
		System.out.println("20 : "+search1(data,data.length,20));
		
		
		System.out.println("----------");
		System.out.println("30 :"+search(data,0,data.length-1,30));
		
		System.out.println("50: "+search(data,0,data.length-1,50));
		System.out.println("80 : "+search(data,0,data.length-1,80));
		
		System.out.println("100 :"+search(data,0,data.length-1,100));
		
		System.out.println("10 :"+search(data,0,data.length-1,10));
		System.out.println("20 :"+search(data,0,data.length-1,20));
		
		
	}
	
	// binary search 
	public static int search(int[] arr, int low, int high, int input) {
		// base condition 
		if(low>high)
			return -1;
		int mid = (high+low)/2;
		
	/*	if(arr[low]==input)
			return low;
		if(arr[high]==input)
			return high; */ 
		//  if above checks added if last 
		//or first element  no of comparisons reduces ??
		
		
		if(input == arr[mid]) 
			return mid;
		
		if(input>arr[mid])
		return search(arr, mid+1, high, input);
		else 
			return search(arr, low, mid-1, input);
					
		
	}
	
// binary search iterative ...
	public static int search1(int [] arr,int n, int input) {
		int low =0;
		int high = n-1;
	
		while(low<high) {
			int mid = (high+low)/2;
			
			if(arr[low]==input)
				return low;
			if(arr[high]==input)
				return high;
			
			
			if(arr[mid]==input)
				return mid;
			else if(input>arr[mid]) {
				low = mid+1;
			}else 
				high = mid-1;
			
		}

	return -1;	
		
		
	}
	
}
