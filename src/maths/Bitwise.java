package maths;

public class Bitwise {

	
	public static void main(String[] args) {
		
		int x = 5;
		//System.out.println("Bit wise Not "+~x);
		
		Bitwise bit = new Bitwise ();
		
		bit.checkKthBitLeft(8, 4);
		
		
	}
	
	public void checkKthBitLeft(int n, int k) {
		
		int a = 1;
		if((n&(a<<(k-1)))!=0)
			System.out.println("Yes");
		else 
			System.out.println("No");
				
	}
}
// answ : input 1 > -2 input 5  > -6 
