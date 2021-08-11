package geeks.strings;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(testAnagram("geeks","ekegt"));
	}
	
	public static boolean testAnagram(String s1,String s2) {
		
		// add check if two strings are equal 
		boolean result =true;
		int [] counter = new int[256];
		
		for(int i=0;i<s1.length();i++) {
			counter[s1.charAt(i)]++;			
		}
		System.out.println(Arrays.toString(counter));
		
		for(int i=0;i<s2.length();i++) {
			counter[s2.charAt(i)]--;
			
		}
		
		System.out.println(Arrays.toString(counter));
		for(int i=0;i<256;i++) {
			if(counter[i]!=0) {
				result= false;
				break;
			}
			
		}
		
		
		return result;
		
	}

}
