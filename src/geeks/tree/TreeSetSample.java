package geeks.tree;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet<String> tSet = new TreeSet<String>();
		
		tSet .add("Courier");
		tSet .add("Address");
		tSet .add("Building");
		
		Iterator<String> it = tSet.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		TreeSetSample ts =  new  TreeSetSample();
		int[] data = {2,8,30,15,25,12};
		ts.printCeiling(data);
		
		
	}
	/* 
	 * Prints ciel of left side  of each element in array if doesnt has print -1 
	 */
	public void printCeiling(int [] data) {
		
		TreeSet<Integer> tree = new TreeSet<Integer> ();
		
		
		tree.add(data[0]);
		
		for(int i=1;i<data.length;i++) {
			
			if(tree.ceiling(data[i])!=null) {
				
				System.out.print(" "+tree.ceiling(data[i]));
			}else {
				
				System.out.print(" -1 ");
			}
			
			tree.add(data[i]);	
		}
		
		
	}

}
