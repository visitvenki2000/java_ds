package geeks.heap;

import java.util.Arrays;

public class Heap2 {
	
	int[] arr;
	int size=-1;
	int cap;
	Heap2(int cap){
		
		arr = new int[cap];
		this.cap =cap;
	}
	int getleftChild(int i) {
		return 2*i+1;
	}
	
	int getRightChild(int i) {
		return 2*i+2;
	}
	
	int getParent(int i) {
		return (i-1)/2;
	}
	//insert at end ..size++ insert
	// get parent and compare...if parent is less keep swapping
	// if i=0 stop
	public boolean insert(int item) {
		
		System.out.println("---start  "+item);
		if(size==cap)
			return false;
		
		System.out.println("---Step2-size-"+size);	
		//System.out.println("---cap--"+cap);	
		if(size==-1) {
			size++;
			arr[size]=item;
			
			return true;
		}
		
		//System.out.println("---2");	
		size++;
		arr[size]=item;
		int currIndex =size;
		int curParentIndex =getParent(currIndex);
		System.out.println("---curParentIndex--"+curParentIndex);
		while(arr[curParentIndex]>item && curParentIndex>=0) {
			
			int temp = arr[curParentIndex];
			arr[curParentIndex] = arr[currIndex];
			 arr[currIndex] =temp;
			 
			 curParentIndex =getParent(currIndex);
			 currIndex = curParentIndex;
				System.out.println("---swapped--");
			 
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		Heap2  hp = new Heap2(10);
		hp.insert(10);
		System.out.println(Arrays.toString(hp.arr));
		hp.insert(20);
		hp.insert(30);
		
		System.out.println(Arrays.toString(hp.arr));
		
		
		
	}
	
}
