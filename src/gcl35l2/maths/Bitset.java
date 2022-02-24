package gcl35l2.maths;

public class Bitset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		checkBitSet(7,2);
	}
	
	public static void checkBitSet(int n, int k){
		
		
		System.out.println(""+(4&7));
		
		int test =1;
		
		test = test<<k;
		System.out.println(""+test);
		if((test&n)==test)
			System.out.println("bit set");
		else 
			System.out.println("bit not set");
			
	}

}
