package geeks.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer [] arr = { 5,20,10,3,2};
		
		int [] arr2 = { 5,20,10,3,2,6,7,8,9};
		//sortEven(arr);
		//System.out.println(Arrays.toString(arr));
		
		///sortBubble(arr2);
		//sortInsertion(arr2);
		int [] a = { 10,15,20};
		int [] b = { 5,6,6,15};
		//merge(a,b);
		//int [] c = {  10,15,20,40,8,11,15};
		
		int [] c = {  10,5,30,15,7};
		
		//mergeSort(c,0,4);
	//	merge (c,0,3,6);
		
		
		System.out.println("FInal merged  "+Arrays.toString(c));
		
		int [] a1 = { 2,20,20,40,60};
		int [] b1 = { 10,20,20,20};
		
		union(a1,b1);
	}
	
	
public static void union(int[ ]a,int [] b ) {
		
		
		int n1 = a.length; 	int n2 = b.length;
		int left = 0; int right =0;
		
	while (left<n1 && right <n2) {
			
			
			if(a[left]<b[right]) {
				
				if(left>0 && a[left]==a[left-1]) 
				{
					left++ ;
				continue ;
				}
				  System.out.print("  "+a[left]+" --> ");
				left++;
				
			}else if(a[left]>b[right]){
				if(right>0 && b[right]==b[right-1]) 
				{
					right++ ;
				continue ;
				}
			
				System.out.print("  "+b[right]+" --> ");
				right ++;
				
			}else if (a[left]==b[right]) {
		
				if(right>0 && b[right]==b[right-1]) 
				{
					right++ ;
					left ++;
				continue ;
				}
				
				  System.out.print(" "+a[left] +" --> ");
				  left++;
				  right ++;
				
			}
			
		}
	
	
	while (left<n1) {
		if(left>0 && a[left]==a[left-1]) 
		{
			left++ ;
		continue ;
		}
		  System.out.print("  "+a[left]+" --> ");
		left++;
		
	}
		
	
	while (right<n2) {
		if(right>0 && b[right]==b[right-1]) 
		{
			right++ ;
		continue ;
		}
	
		System.out.print("  "+b[right]+" --> ");
		right ++;
		
	}
		
	}
	
	

	public static void intersection(int[ ]a,int [] b ) {
		
		
		int n1 = a.length; 	int n2 = b.length;
		int left = 0; int right =0;
		
	while (left<n1 && right <n2) {
			
			
			if(a[left]<b[right]) {
				
				if(left>0 && a[left]==a[left-1]) 
				{
					left++ ;
				continue ;}
				left++;
				
			}else if(a[left]>b[right]){
	
				right ++;
				
			}else if (a[left]==b[right]) {
		
				
				  System.out.println(" Match found "+a[left]);
				  left++;
				  right ++;
				
			}
			
		}
		
		
	}
	
	
	public static void mergeSort(int []arr, int l,int r) {
		
		if(r>l) {
			
			int mid = l+(r-l)/2;
			
			  System.out.println(" indexes  in merge "+l+" - mid "+mid+"- high "+r);
			
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			merge(arr,l,mid,r);
			
		}
		
		
	}
public static void merge(int [] c,int low, int mid, int high) {
	
	  System.out.println(" indexes  A "+low+" - mide "+mid+"- high "+high);
	int n1 =mid-low+1; int n2 =high-mid;
	     int [] a = new int [n1];
	     int [] b = new int [n2];
	     for(int i=0;i<n1;i++)
	    	 a[i]= c[low+i];
	     for(int i=0;i<n2;i++)
	    	 b[i]= c[mid+1+i];
	     
	     System.out.println(" part A "+Arrays.toString(a));
	     System.out.println(" part B "+Arrays.toString(b));
		
	
		 int indA =0;
		 int indB =0;
		 int i=low;
		while (indA<a.length && indB<b.length ) {
			
			if(a[indA]<b[indB]) {
				c[i]= a[indA];  indA++;}
			else  {
				c[i]= b[indB]; indB++;}
			i++;
			
		}
		
		while (indA<a.length ) {
			c[i]= a[indA];
			indA++;
			i++;
		}
		while (indB<b.length ) {
			c[i]= b[indB];
			indB++;
			i++;
		}
				
		System.out.println("Merged  "+Arrays.toString(c));
	}
	
	public static void merge(int [] a, int [] b) {
		
		int [] c = new int[a.length+b.length];
		 int indA =0;
		 int indB =0;
		 int i=0;
		while (indA<a.length && indB<b.length ) {
			
			if(a[indA]<b[indB]) {
				c[i]= a[indA];  indA++;}
			else  {
				c[i]= b[indB]; indB++;}
			i++;
			
		}
		System.out.println("Merged part 1 "+Arrays.toString(c));
		while (indA<a.length ) {
			c[i]= a[indA];
			indA++;
			i++;
		}
		while (indB<b.length ) {
			c[i]= b[indB];
			indB++;
			i++;
		}
				
		System.out.println("Merged  "+Arrays.toString(c));
	}
	
	public static void sortEven(Integer[] arr) {
		
		Arrays.sort(arr,new CustomSort());
		
	}
	
	public static void sortBubble(int [] arr) {
		 int n = arr.length;
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-1;j++) {
				
				if(arr[j]>arr[j+1])
					swap(arr,j,j+1);
			}
			n=n-1;
			
			
		}
		
		System.out.println("Bubble "+Arrays.toString(arr));
	}
	
	
	// pick min element swap ....start from start 
	public static void sortSelection(int [] arr) {
		 int n = arr.length;
		for(int i=0;i<n;i++) {
			
			int min  =i;
			for(int j=i+1;j<n;j++) {
				
				if(arr[j]<arr[min])
					min =j;
			}
		swap(arr,i,min);
			
			
		}
		
		System.out.println("Selection  "+Arrays.toString(arr));
	}
	
	// Insert inside left sorted array .... 
	public static void sortInsertion(int [] arr) {
		 int n = arr.length;
		for(int i=1;i<n;i++) {
			
			int sel  =arr[i];
		  int j=i-1;
			while(j>=0 && sel<arr[j]) {
				arr[j+1] =arr[j];
				j--;
				
			}
			arr[j+1] =sel;
	
			System.out.println("Insertion at i  "+i+"- "+Arrays.toString(arr));
			
		}
		
		System.out.println("Insertion  "+Arrays.toString(arr));
	}
	
	public static void swap(int [] arr , int from ,int to) {
		
		int temp = arr [from];
		arr[from]= arr[to];
		arr[to] = temp;
	}

}

class CustomSort implements Comparator<Integer>{
	
	public int compare(Integer a, Integer b) {
	
		return a%2 -b%2;
		
	}
}


