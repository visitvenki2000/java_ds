package geeks.arrays;

import geeks.Util;

public class ArrayRotate {
	public static void main(String[] args) {
		ArrayRotate Ar = new ArrayRotate();
		
		int [] data = {1,2,3,4,5};
		//Ar.leftRotateOne(data);
	//	Ar.leftRotateM2(data,2);
		Ar.leftRotateM3(data,3);
		Util.print(data);

	}
	
	public void leftRotateOne(int [] array) {
		
		int temp = array[0];
		for(int i=0;i<array.length-1;i++)
			array[i]=array[i+1];
		array[array.length-1]=temp;
	}
	
	public void leftRotateM2(int [] array,int d) {
		int[] temp = new int [d];
		// copy to temp array 
		for(int i=0;i<d;i++)
			temp[i]=array[i];
		// move elements after d to d steps back
		for(int i=d;i<array.length;i++)
			array[i-d]=array[i];
		
		for(int i=0;i<d;i++)
			array[array.length-d+i]=temp[i];
	
	}
	public void leftRotateM3(int [] array,int d) {
		reverse(array,0,d-1);
		Util.print(array);
		reverse(array,d,array.length-1);
		Util.print(array);
		reverse(array,0,array.length-1);
		Util.print(array);
	}
	
	public void reverse(int[] array, int low , int high )
	{
		
		while(low<high) {
			
			int temp =	array[low];
			array[low]	= 	array[high];
			array[high] =temp ;
			low ++;
			high--;
		}
		
	}
}
