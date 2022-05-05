package gcl35l2.strings;

import java.util.Arrays;

public class CheckMixMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a ="acefekezgh";
		String b= "fze";
		String c= "abcd";
		subStrings(c);
		System.out.println("----------------------------------");
		
		int[] arr = new int[b.length()];
		boolean foundAllMatch =false;
		int minWindow = a.length();
		int min =0;
		int max =0;
		for(int i=0;i<a.length();i++){
			
			for(int j=0;j<b.length();j++)
			if(a.charAt(i)==b.charAt(j)){
				arr[j] = i;
				if(min==0)
					min=i;
				else
				min = Math.min(min, i);
				max = Math.max(max, i);
			}
			//check if all characters found.... 
			
			if(foundAllMatch || checkAllMatched(arr)){
				minWindow = Math.min(minWindow, max-min);	
				foundAllMatch = true;
				System.out.println("###### Match found "+i +"--"+minWindow);
			}
			System.out.println(" i= "+i+"- min "+min+" -max"+max+"-"+Arrays.toString(arr));
		}
		if(foundAllMatch)
		System.out.println("found match "+minWindow);
		else 
			System.out.println(" match not found ");
	}
	public static boolean checkAllMatched(int [] arr){
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]==0)
				return false;
			
		}
		
		return true;
	}
	public static void subStrings(String s){
		
		
		for(int i=0;i<s.length();i++){
			
			for(int j=i;j<s.length();j++){
				
				System.out.println(""+s.subSequence(i, j+1));
				
			}
			
		}
		
	}
	

}
