package geeks.heap;

import java.util.Arrays;

public class Heap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Heap hp = new Heap(10);
		
		hp.insert(10);
		hp.insert(20);
		hp.insert(15);
		hp.insert(40);
		hp.insert(50);
		hp.insert(100);
		hp.insert(25);
		hp.insert(45);

		System.out.println(Arrays.toString(hp.data));
		
		hp.insert(12);
		// after insert of 12 
		
		System.out.println(Arrays.toString(hp.data));
		
		
		
	}
	
	
	
	int [] data;
	int size;
	int capacity;
	public Heap(int capacity) {
		
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
