package geeks;

import java.util.Arrays;

public class BinarySearch {

	
	/*
	 * 
	 * 1. break condition 
	 * 2. Calling iteratively 
	 */
	
	 public static  int recursiveSearch(int[] arr, int low, int high, int x) {
		
		int mid = (low+high)/2;
		
		if(low>high)
			return -1;
		
		if(arr[mid]==x)
			return x;
		 if(arr[mid]>x) {
			 // go to left ...mid element is greater than x
			return recursiveSearch(arr,low,mid-1,x);
			 
		 }else {
			 // go right mid element is less than x
			 
			return recursiveSearch(arr,mid+1,high,x);
			 
		 }
		
	//	return -1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {3,5,8,10,14,16,18};
		
		int result = BinarySearch.recursiveSearch(arr,0,arr.length-1, 19);
		if(result>0)
		System.out.println("Value of search is "+result);
		else 
			System.out.println("Value not found "+result);
		

	}

}
