package geeks.hash;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashChain {

	
	public ArrayList<LinkedList<Integer>> data ;
	int bucket ;
	
	
	
	HashChain(int bucket){
		this.bucket = bucket;
		data = new ArrayList<LinkedList<Integer>>(bucket);
	}
	
	public void insert(int input) {
		
		LinkedList<Integer> list =	data.get(hash(input,7));
		if(list==null) {
			new LinkedList<Integer>().add(input);
		}else {
			list.add(input);
		}
		
	}
	
	public int delete(int input) {
		
		LinkedList<Integer> list =	data.get(hash(input,7));
		if(list==null) {
			return -1;
		}else {
			return list.remove(input);
		}
		
	}
	public boolean search(int input) {
		
		LinkedList<Integer> list =	data.get(hash(input,7));
		if(list==null) {
			return false;
		}else {
			//return list.stream().filter(c->c==input).findAny().orElse(-1);
			return list.contains(input);
		}
		
	}
	
	
	
	public int hash(int input,int m) {
		
		int hashValue = input%m;
		return hashValue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashChain hashList = new HashChain(7);
		
		hashList.insert(70);

	}

}
