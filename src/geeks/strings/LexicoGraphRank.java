package geeks.strings;

import java.util.Arrays;

public class LexicoGraphRank {

	/*
	 * STRING  - 4[5!+4[4!+3[3!+1[2!+1[1+ 1 
	 * 1) Prepare count array of String
	 * 2) prepare cumulative count of String to know no of characters less than that 
	 * 3) Prepare Factorial - of N 
	 * Loop start 
	 * 4) Get Characters less than that from previous array ..
	 * .and multiply with factorial ( divide factorial by n-1)
	 *  
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LexicoGraphRank leRank = new LexicoGraphRank();
		leRank.findRank("STRING");
		
	}

	
	public long findRank(String s) {
		long result =1;
		
		int [] count  = new int[256];
	
		long fact = factorial(s.length());
		for(int i=0;i<(s.length()-1);i++) {
			count[s.charAt(i)]++;
		
		}
		System.out.println("---- Fact "+fact);
		System.out.println("---- initial"+Arrays.toString(count));
	
		// calculate cumm count 
		for(int i=1;i<256;i++) {
			
			count[i] = count[i-1]+count[i];
		}
		System.out.println("----Cummulative"+Arrays.toString(count));
		
		
		for(int i=0;i<(s.length()-1);i++) {
			
			fact = fact/(s.length()-i);
		result = result +count[s.charAt(i)]*fact;
		
		System.out.println("----  "+count[s.charAt(i)]+"-"+fact);
		
		// Reduce cum count by first character 
		for(int j=s.charAt(i);j<256;j++)
			count[j]--;
		
		}
		
		System.out.println("----Result "+result);
		
		return result;
	}
	
	   public static long factorial(int number) {
	        long result = 1;

	        for (int factor = 2; factor <= number; factor++) {
	            result *= factor;
	        }

	        return result;
	    }
}
