package geeks.arrays;

import java.util.Arrays;

public class TempWaterTrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []  arr = {3,0,1,2,5};
		
		trap(arr,arr.length);
		
		
	}
	
	public static void trap(int [] arr, int n) {
		
		// cal left max arra
		int [] lmax = new int[n];
		int[] rmax =new int[n];
		int max = 0;
	
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				lmax[i] =arr[i];
				max = arr[i];  }
			else 
				lmax[i]=max;
		}
		// right max
		max=0;
		for(int i=n-1;i>=0;i--) {
			if(arr[i]>max) {
				rmax[i] =arr[i];
				max = arr[i];  }
			else 
				rmax[i]=max;
			
		}
		System.out.print(Arrays.toString(lmax));
		System.out.print(Arrays.toString(rmax));	
		
		
		int sum =0;
		// loop from i to n-1 ( leave first and last )
		
		for(int i=0;i<n-1;i++) {
			
			sum = sum+Math.min(lmax[i], rmax[i])-arr[i];
		}
		
		System.out.print("Final Sum:"+sum);
	}

}
