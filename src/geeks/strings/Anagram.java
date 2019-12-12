package geeks.strings;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Test data";
		
		
		Anagram an = new Anagram();
		System.out.println(an.isAnagram("test", "tes"));
		/*
		int count[]=new int[256];
		System.out.println("  "+s.charAt(0));
		count[s.charAt(0)]++;
		for(int i=0;i<count.length;i++)
		{
			if(count[i]>0) {
				System.out.println(" i "+i+"-"+count[i]);
			}
		}
		
		char c='k';
		int k = (int)c;
		System.out.println(" k -"+k); */
	}

	
	public boolean isAnagram(String s1, String s2) {
		boolean result = true;
		
		// check if both strings are equal length 
		
		if(s1.length()!=s2.length())
			return false;
		
		int count[]= new int[256];
		
		for(int i=0;i<s1.length();i++)
		{
			count[s1.charAt(i)]++;
		}
		
		for(int i=0;i<s2.length();i++)
		{
			count[s2.charAt(i)]--;
		}
		
		for(int i=0;i<count.length;i++)
		{
			if(count[i]>0) {
				System.out.println(" i "+i+"-"+count[i]);
				result = false;
				break;
			}
		}
		
		return result;
	}
}
/*
 
  complexity The(n)+ TH(n) + constant time(256)
  
  2n+d ...O(n)
  
 
  
  
 */
