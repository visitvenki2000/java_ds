package hash;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Chaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chaining hash = new Chaining(10);
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
	
	List<Integer> [] data;
	int bucket;
	
	public Chaining(int bucket) {
		this.bucket = bucket;
		data = new  LinkedList[bucket];
		
	}
	
	public int getHash(int item) {
		return item%bucket;
	}
	
	public void insert(int item) {
		
		int index = getHash(item);
		
		
		if(data[index]==null) {
			
			// creare array list and add eleemtn 
			data[index] = new LinkedList<Integer>();
			data[index].add(item);
		}else {
			
			data[index].add(item);
		}
		
		
	}
	
	public boolean remove(int item) {
		
	int index = getHash(item);
		
		
		if(data[index]!=null) {
			
			int listIndex = data[index].indexOf(item);
			data[index].remove(listIndex);
			return true;
	}
		return false;
		
	}
	
	public boolean search(int item) {
		
		int index = getHash(item);
		if(data[index]==null)
			return false;
		
		for(  int x : data[index]) {
			
			if(x==item)
				return true;
		}
		
		return false;
		
	}

}
