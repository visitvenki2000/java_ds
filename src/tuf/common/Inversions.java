package tuf.common;

import java.util.Arrays;

public class Inversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] arr =  {5,3,2,4,1};
		
     int count =  mergeSort(arr,0,4);
		System.out.println("--Merged-- "+Arrays.toString(arr));
		
		System.out.println("--Inv Count-- "+count);
	}
	
	
	static int merge(int[] arr, int low, int  mid,int high){
		int inv_count=0;
		int m =mid-low+1;
		int n =high-mid;
		int left[] = new int[m];
		int right[] = new int[n];
		
		for(int i=0; i<m;i++)
			left[i]=arr[low+i];
		
		for(int i=0; i<n;i++)
			right[i]=arr[mid+i+1];
		
		int i=0; int j=0; int k=low;
		
		while(i<m && j<n){
			
			if(left[i]<right[j])
				arr[k++]= left[i++];
			else  {
				arr[k++]= right[j++];
				//  Increment count when right side is picked ...count of right of left i ...will form pairs
				inv_count = inv_count+ (m-i);
				
				
			}
			
		
		}
		
		while(i<m){
			
			arr[k]= left[i];
			i++;k++;
		}
		
		while(j<n){
			
			arr[k]= right[j];
			j++;k++;
		}
		
		System.out.println("--Merged-- "+low+" -high- "+high+"-"+Arrays.toString(arr));
		
		return inv_count;
	}
	static int mergeSort(int [] arr , int low, int high){
		
		int inv_count =0;
		if(low<high){
			
			int mid = (low+high)/2;
			inv_count+=mergeSort(arr,low,mid);
			inv_count+=mergeSort(arr,mid+1,high);
			inv_count+=merge(arr,low,mid,high);
			
		}
		return inv_count;
		
	}

}
