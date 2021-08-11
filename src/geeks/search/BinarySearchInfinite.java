package geeks.search;

public class BinarySearchInfinite {

	/*
	 * Problem  : given Infinite sized sorted  array. Find occurrence of element x 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchInfinite bs = new BinarySearchInfinite();
		
		int [] data = {1,5,6,8,30,40,50,60,90,91,92,93,94,95,96,97,98,99,100,101};
		

         int i=1;
         int x= 50;
         int result =0;
         
         if(data[0]==x)
     		System.out.println("First  index is result: ");
		while(data[i]<x) {
			i=i*2;			
		}
		System.out.println(" index: "+i);
		if(data[i]==x)
			System.out.println("Found at index: "+i); 
		else {
			result=	bs.binSearch(data,i/2,i,x);
		
		System.out.println("Found  index with binary search : "+result);
		}
	}
	
	public int binSearch(int[] data,int low, int high, int x) {
		
	System.out.println("Row low "+low+" High "+high);
		
		if(low>high)
			return -1;
		
		
		int mid = (low+high)/2;
		System.out.println("Mid   "+mid);
		
		if(x==data[mid])
			return mid;
		
		if(data[mid]>x)
			return binSearch(data,low,mid-1,x);
		else
		return	binSearch(data,mid+1,high,x);
		
			
	}
	


}
