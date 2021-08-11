package geeks.search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearch bs = new BinarySearch();
		
		//int [] data = {1,5,6,8,30,40,50,60,90};
		
		int [] data = {1,5,30,30,30,30,50,60,90};
	//	System.out.println(bs.binSearch(data, 0, data.length-1, 30));
		int first = bs.binSearchFirst(data, 0, data.length-1, 30);
   int last =bs.binSearchLast(data, 0, data.length-1, 30);
   int count = last-first;
   System.out.println("First-"+first+" Last -"+last+"-Count:"+(last-first+1));
		
		
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
	
	public int binSearchFirst(int[] data,int low, int high, int x) {
		
		System.out.println("Row low "+low+" High "+high);
		
		if(low>high)
			return -1;
		
		
		int mid = (low+high)/2;
		System.out.println("Mid   "+mid);
		
		if(x==data[mid] &&(mid==0 || x!=data[mid-1]))
			/// check for first index to avoid array index of error
			return mid;
		
		if(data[mid]>=x)
			return binSearch(data,low,mid-1,x);
		else
		return	binSearch(data,mid+1,high,x);
		
	}
	
	
public int binSearchLast(int[] data,int low, int high, int x) {
		
		System.out.println("Row low "+low+" High "+high);
		
		if(low>high)
			return -1;
		
		
		int mid = (low+high)/2;
		System.out.println("Mid   "+mid);
		
		if(x==data[mid] &&(mid==(data.length-1) || x!=data[mid+1])) 
			/// check for last index to avoid array index of error
			return mid;
		
		if(data[mid]>x)
			return binSearch(data,low,mid-1,x);
		else
		return	binSearch(data,mid+1,high,x);
		
		
		
		
	}

}
