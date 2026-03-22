package gcl35l1.dp;

import java.util.HashMap;
import java.util.Map.Entry;

public class TestNonRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hi, I am Venkat. I am a Java Engineer. I stay in H";
		prirntNonRepeat(s);
	}
	
	public static void prirntNonRepeat(String s) {
		
		HashMap<String , Integer> map = new HashMap<String , Integer>();
		 int max = s.length();
		
		for( int i=0;i<max;i++) {
			
			String temp  = s.charAt(i)+"";
			// ignore special char  registr
			
			if(map.get(temp.toLowerCase())!=null) {
				int count = map.get(temp.toLowerCase());
				map.put(temp.toLowerCase(), count+1);
				
			}else {
				
				map.put(temp.toLowerCase(), 1);
			}
			
			
		}
		
		int nonRep = -1;
		
		for( int i=0;i<max;i++) {
			
			String temp  = s.charAt(i)+"";
			
		
			
			if(map.get(temp.toLowerCase())!=null) {
				
			int count =	map.get(temp.toLowerCase());
			if(count==1) {
				nonRep =i;
			}
			}
			
		}
		
		
		if(nonRep!=-1) {
			
			System.out.println("Non Repeat last char "+s.charAt(nonRep));
			
		}else {
			System.out.println("Non Repeat Not found ");
		}
		
		for(Entry<String, Integer> item : map.entrySet()) {
			
			System.out.println(item.getKey() +"-"+item.getValue());
		}
		
	}

}
