package geeks.heap;

import java.util.Arrays;

public class Heapify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Heapify hp = new Heapify(10);
		
		hp.insert(5);
		hp.insert(20);
		hp.insert(30);
		hp.insert(35);
		hp.insert(25);
		hp.insert(80);
		hp.insert(32);
		hp.insert(100);
		hp.insert(70);
		hp.insert(60);
		
		hp.data[0]=40;

		System.out.println(Arrays.toString(hp.data));
		hp.heapify(0);
		// after heap ify 
		System.out.println(Arrays.toString(hp.data));
	}
	
	int [] data;
	int size;
	int capacity;
	// 1. find smallest of left and right child ..
	
	public void heapify (int index) {
		
		int lc = getLeftChild(index); int rc = getRightChild(index);
		
		int smallest =index;
		
		if(size>lc && data[lc]<data[index]) {
		
			smallest =lc;			
		}
		else if(size>rc && data[rc]<data[smallest]) {
		 // swap with left child if left child is small ...
			smallest =rc;			
		}
		
		if(smallest!=index) {
			swap(smallest,index);
			heapify(smallest);
			
		}
		
		
	}
	
	public Heapify(int capacity) {
		
		this.capacity = capacity;
		data = new int[10];
		size=0;
	}
	
  public	int getLeftChild(int index) {
		
		return 2*index+1;
		
	}
   public int getRightChild(int index) {
    	
    	return 2*index+2;
    }
  public  int getParent(int index) {
    	
    	return (index-1)/2;
    }
	
    public void insert(int value){
    	
    	if(size==capacity)
    		return; // 
    	size++;
    	data[size-1]=value; // add at last index 
    	
    	//
    	for(int i=size-1;i!=0&&data[getParent(i)]>data[i];) // i changed inside 
    	{
    		swap(i,getParent(i));
    		i= getParent(i);
    	}
    	
    }
    public void swap(int source, int dest) {
    	
    	int temp = data[source];
    	data[source] =data[dest];
    	data[dest] =temp;
    }
	

}
