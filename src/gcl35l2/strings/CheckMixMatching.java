package gcl35l2.strings;

public class CheckMixMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a ="acefeezgh";
		String b= "fze";
		int[] arr = new int[b.length()];
		
		for(int i=0;i<a.length();i++){
			int min =0;
			int max =0;
			for(int j=0;j<b.length();j++)
			if(a.charAt(i)==b.charAt(j)){
				arr[j] = i;
			}
		}

	}
	
	

}
