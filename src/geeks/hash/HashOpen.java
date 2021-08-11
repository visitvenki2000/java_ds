package geeks.hash;

import java.util.Arrays;

public class HashOpen {
	
	int [] arr;
	int cap ,size;
	
	HashOpen(int cap){
		this.cap= cap;
		this.size = 0;
		arr = new int[cap];
		for(int i=0;i<cap;i++) {
			arr[i]=-1;
		}
	}

	
	
	public int hash(int input) {
		
		int hashValue = input%cap;
		return hashValue;
	}
	
	
	public int hash2(int input) {
		
		int hashValue = (cap-input%(cap-1) )%cap;
		return hashValue;
	}

	
	public boolean insert(int input) {
		
		int i=0;
		while(i<cap) {
		int hashValue = (hash(input)+hash2(input)*i)%cap;
		
		System.out.println("---hash ---"+hashValue);
		
		if(arr[hashValue]==-1) {
			arr[hashValue] = input;	
			return true;
		}
		i=i+1;
		}
		
		return false;
		
	}
	
	
	public boolean search(int input) {
		
		int i=0;
		while(i<cap) {
		int hashValue = (hash(input)+hash2(input)*i)%cap;
		
		if(arr[hashValue]==input) {
			return true;
		}else  if(arr[hashValue]==-1)
			return false;
		i=i+1;
		}		
		return false;		
	}
	public boolean searchLinear(int input) {
		
		int i=0;
		int hashValue = hash(input);
		while(arr[hashValue]!=-1) {
			
		if(arr[hashValue+i]==input) {
			return true;
		}
		i = (i+1)%cap;
		if(i==hashValue)
			return false;
	
		}		
		return false;		
	}

	public boolean insertLinear(int input) {

		int hashValue = hash(input);

		if (arr[hashValue] == -1) {
			arr[hashValue] = input;
			return true;

		}
		int i = hashValue;
		while (arr[i] != -1) {
			i = (i + 1) % cap;
			if (arr[i] == -1) {
				arr[i] = input;
				return true;
			}
			if (i == hashValue)
				return false;

		}
		return false;
	}
	
	public boolean delete(int input) {
		
		int i=0;
		while(i<cap) {
		int hashValue = (hash(input)+hash2(input)*i)%cap;
		
		if(arr[hashValue]==input) {
			arr[hashValue] =-1;
			return true;
		}else  if(arr[hashValue]==-1)
			return false;
		i=i+1;
		}		
		return false;		
	}
	
	public void print() {
		
		System.out.println(Arrays.toString(arr)+"");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashOpen hash = new HashOpen(7);
		
		
		hash.insertLinear(49);
		hash.print();
		
		hash.insertLinear(56);
		hash.print();
		hash.insertLinear(72);
		hash.print();
		if(hash.searchLinear(56))
			System.out.println("found 56");
		else 
			System.out.println("not found 56");
		
		/*
		hash.insert(49);
		hash.print();
		
		hash.insert(56);
		hash.print();
		hash.insert(72);
		hash.print();
		if(hash.search(56))
			System.out.println("found 56");
		else 
			System.out.println("not found 56");
		if(hash.delete(56))
			System.out.println("deleted 56");
		else 
			System.out.println("not found 56 to delete");
		
		hash.print();
		
		*/
		
		

	}
	
}
