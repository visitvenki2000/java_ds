package hash;

import java.util.Arrays;

public class OpenAddress {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OpenAddress hash = new OpenAddress(10);
		hash.insert(63);
		hash.insert(56);
		hash.insert(49);
		hash.insert(73);
		hash.insert(59);
		

			System.out.println("search  "+hash.search(63)); 
			System.out.println("search  "+hash.search(64)); 
			
			System.out.println("remove  "+hash.remove(63)); 
			System.out.println("remove  "+hash.remove(64)); 
			
			System.out.println("Array Final  "+Arrays.toString(hash.data)); 
	
		
	}
	
	int size;
	int cap;
	int[] data ;
	
	/*
	 * 
	 * Insert 
	 * Search 
	 * 
	 * 
	 */
	
	public OpenAddress(int capacity) {
		data = new int[capacity];
		cap = capacity;	
		for(int i=0;i<cap;i++)
			data[i]=-1;
		
		System.out.println("Initial "+Arrays.toString(data));
	}
	public int getHash(int item) {
		
		return item%cap;
	}
	// check if size exceeded
	// get hash .. and check if hash index is available keep incrementing 
	// check for -1, -2 also (deleted) stop if same index ?
	
	public void insert(int item) {
		
		if(size>=cap)
			return ;
		
		int i=0;
		
		for(i=getHash(item);data[i]!=-1 && data[i]!=-2 && data[i]!=item;i = (i+1)%cap) {
			System.out.println("item value "+item+" i  "+i);
			
			//(data[i]==-1 || data[i]==-2 || data[i]==item)
				//break;
			
			
		}
		
		data[i]=item;
		size++;
		System.out.println(Arrays.toString(data));
	}
	public boolean search(int item) {
		
		if(size==0)
			return false;
		
		int i=getHash(item);
		int j=i;
		while (data[i]!=-1 ) {
			
			if(data[i]==item)
				return true;
			i = (i+1)%cap;
			
			if(i==j)
				return false;
			
		}
		return false;
	}
	
	public boolean remove(int item) {
		
		if(size==0)
			return false;
		
		int i=getHash(item);
		int j=i;
		while (data[i]!=-1  ) {
			System.out.println("Inside loop "+i);
			
			if(data[i]==item) {
				data[i] = -2;
				return true;
				
				
			}
			i = (i+1)%cap;
			
			if(i==j)
				return false;
			
		}
		return false;
	}
}
