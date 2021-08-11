package geeks.arrays;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = {8,5,0,10,0,20};
		//leftRotateByD3(arr,3);
		// [10, 0, 20, 8, 5, 0]  left rotate by 3
		
		int [] arr2 = {7,10,4,3,6,5,2};
		
		printLeaders(arr2);
	}
	
	public static void printLeaders(int arr[]) {
		
		int n =arr.length;
		int max=arr[n-1];
		System.out.println(" "+max+" ");
		for(int i=n-2;i>=0;i--) {
			if(arr[i]>max) {
				System.out.print(" "+arr[i]);
				max =arr[i];
			}
			
		}
		
	}
	
	// if 0 found increase count of 0 and relate with next element.... if next element 0 increment zero count 
	public static void moveZeros(int [] arr) {
		
		int n = arr.length;
		int nonZeroCount = 0;
		
		for(int i=0;i<n;i++) { // if last element zero no issue if not zero if we hae zero before will be replaced ...
			
			
			if(arr[i]!=0) {
				int temp = arr[i] ;
				arr[i] =arr[nonZeroCount];
				arr[nonZeroCount] =temp; 
				
				nonZeroCount++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
public static void leftRotate(int [] arr) {
		
		int n = arr.length;
		int first = arr[0];
		
		for(int i=0;i<n-1;i++) { // 
		
				arr[i] =arr[i+1];
			
		}
		arr[n-1] =first;
		
		System.out.println(Arrays.toString(arr));
		
	}
	


//* stilll= need to refine .....other idea ..
public static void leftRotateByD(int [] arr,int D) {
	
	int n = arr.length;
	int first = arr[0];
	
	for(int i=0;i<n-D;) { // 
		
		System.out.println("--iteration i "+i);
		for(int j=0;j<D;j++) { 
	
		 int temp = arr[i+j];
			arr[i+j] =arr[(i+j+D)%n];
			arr[(i+j+D)%n] = arr[n-D];
			arr[n-D] = temp; 
		}
		System.out.println("--iteration after "+i);
		i=i+D;
		
	}

	
	System.out.println(Arrays.toString(arr));
	
}

public static void leftRotateByD3(int [] arr,int D) {
	
	int n = arr.length;
	int first = arr[0];
	reverse(arr,0,D-1);
	reverse(arr,D,n-1);
	reverse(arr,0,n-1);
	
	
	
	
	System.out.println(Arrays.toString(arr));
	
}

public static void reverse(int [] arr, int low, int high) {
	
	
	while (low<high) {
		
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] =temp;
		low ++;
		high--;
	}
	
}


}
