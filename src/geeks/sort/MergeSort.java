package geeks.sort;

import java.util.Arrays;

/*
 * Selection of left , mid, right -- right is size-1 not size  
 */
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,15,20,40};
		int b[] = {10,5,30,15,7};
		
		MergeSort msort = new MergeSort();
		//msort.merge(a, b, a.length, b.length);
		
		//System.out.print(Arrays.toString(b)+" --start ");
		//msort.mergeSort(b,  0, b.length-1);
		
		//System.out.print(Arrays.toString(b)+" --Merged ");
		
		int lum[] = {10,80,30,90,40,50,70};
		//lomParti(lum,0,6);
		int hor[] = {5,3,8,4,2,7,1,10};
		
		houreParti(hor,0,7);
	}
	
	
	public static int houreParti(int[] arr, int low, int high) {
		
		int pivot = arr[low];
		int i =low-1; int j =high+1; 
		while (true) {
			do {
				i++;
				
			}while (arr[i]<pivot);	
			do {
				j--;
				
			}while (arr[j]>pivot);
			
			if(i>=j) return j;
			System.out.print(" --i  "+i+"-j-"+j);
			swap(arr,i,j);
			
			System.out.println(" --after swap  "+Arrays.toString(arr));
		}
		
	}
	
	public static int lomParti(int[] arr, int l, int h) {
		
		int i = l-1;
		int pivot = arr[h];
		
		for(int j=l;j<=h-1;j++) {
			
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		
		swap(arr,i+1,h); //swap last element to correct posi;
		System.out.print(" --Lumoto  "+Arrays.toString(arr));
		return i+1;
	}

	
	public void merge2(int arr1[],int low ,int mid,int high) {
		
		System.out.print(" --low,mid,high "+low+","+mid+","+high);
		int m = mid-low+1;		int n = high-mid;
		int [] lowArr = new int[m];
		int [] highArr =  new int[n];
		
		for(int i=0;i<m;i++)
			lowArr[i]=arr1[low+i];		
		for(int i=0;i<n;i++)
			highArr[i]=arr1[mid+i+1];		
		
		System.out.print(" --lowArr "+Arrays.toString(lowArr));
		
		System.out.print(" --highArr "+Arrays.toString(highArr));
		int i=0,j=0, k=low;
		while(i<m && j<n) {			
			if(lowArr[i]<highArr[j]) {
				System.out.print(lowArr[i]+" ");
				arr1[k++]=lowArr[i++];		
			}else {
				
				System.out.print(arr1[j]+" ");
				arr1[k++]=highArr[j++];				
			}		
		}
			while(i<m) {
				System.out.println("i is "+i);
				arr1[k++]=lowArr[i++];
				
			}
			while (j<n) {
				System.out.println(" j is "+j);
				System.out.print(highArr[j]+" ");
				arr1[k++]=highArr[j++];
							}
		
	}

	public void mergeSort(int[] arr,int low,int high) {
		if(low<high) {
			int mid = (low+high)/2;  // forinteger overflow low+(high-low)/2
			
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			
			System.out.println("--- low--  "+low);
			System.out.println("--- high--  "+high);
			
			merge2(arr,low,mid,high);
			
			
			
			
			
		}
		
		
		
		
	}
	
	public void merge(int arr1[],int arr2[],int m,int n) {
		
		int i=0,j=0;
		while(i<m && j<n) {
			
			if(arr1[i]<arr2[j]) {
				System.out.print(arr1[i]+" ");
			i++;
			}else {
				
				System.out.print(arr2[j]+" ");
				j++;
			}
		
		}
			while(i<m) {
				System.out.print(arr1[i]+" ");
				i++;
				
			}
			while (j<n) {
				System.out.print(arr2[j]+" ");
				j++;
				
			}
			
		
	}
	public static void swap(int [] arr , int from ,int to) {
		
		int temp = arr [from];
		arr[from]= arr[to];
		arr[to] = temp;
	}

	
}
