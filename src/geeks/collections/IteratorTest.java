package geeks.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	
	public static void main(String[] args) 
	{  
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("first");
		list.add("second");
		Iterator listIteration = list.iterator();

		while(listIteration.hasNext()) {
			System.out.println(listIteration.next());
		}
		
	}
}
