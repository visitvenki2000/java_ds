package geeks.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> list = new ArrayList<String>();
		//list.add("5");
		//list.add("6");
		
		for(int i=0;i<10;i++) {
			list.add(i+"");
		}
		int counter =0;
		Queue<String> q =new LinkedList<>();
		
		
		//while(counter<=4) {
			
		
			for(String s: list) {
				
				 q.offer(s);
				
			}
			
			while(counter<100) {
				
				String str = q.poll();
				counter++;
				System.out.println(""+str);
				for(String s: list) {
					
					String temp = str.concat(s);
					 q.offer(temp);
						//System.out.println("----Adding "+temp);
					
				}
				
			//}
			
			
		}
		
		
		
	}

}
