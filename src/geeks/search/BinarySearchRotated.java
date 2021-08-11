package geeks.search;

public class BinarySearchRotated {

	/*
	 * Problem  : given Infinite sized sorted  array. Find occurrence of element x 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchRotated bs = new BinarySearchRotated();
		
		int [] data = {10,20,40,60,70,80,6,7,8};
		//int [] data = {10,20,40,60,70,80,6,7,8};
		//int [] data = {10,20,40,60,70,80,6,7,8};
		
		// Step 1 : Get Pivot element 
		int pivot = bs.getPivot(data, 0, data.length-1);
		System.out.println("Pivot -"+pivot);
		
		//Step 2 // check in left sub array or right sub array with binary search 
		// 0- pivot-1 , pivot+1 < length -1

	}
	
	
	
	public int getPivot(int[] data,int low, int high) {
		
	System.out.println("Row low "+low+" High "+high);
		
		if(low>high)
			return -1;
		
		
		int mid = (low+high)/2;
		System.out.println("Mid   "+mid);
		
		if(data[mid]>data[mid-1] && data[mid]>data[mid+1])
			return mid; // found pivot /// add check for o and n-1 array index problem 
		
		if(data[mid]<data[0]) // compare with left most  element 
			return getPivot(data,low,mid-1); // search left side 
		else
		return	getPivot(data,mid+1,high); //// search right side 
		
			
	}
	


}
