package geeks.bitwise;

public class KthBitset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	kthBitLeft(5,3);
		///kthBitRight(5, 4);
		
		countSetBits1(5);
		countSetBits2(5);
	}
	
	public static void kthBitLeft(int n, int k) {
		
		
		if((n&(1<<(k-1)))!=0)
			System.out.println("Yes");
			else
				System.out.println("No");
		
	}
	
	public static void kthBitRight(int n ,int k) {
		
		
		
		if(((n>>k-1) & 1)!=0)
				System.out.println("Yes");
		else
			System.out.println("No");
	
	}
	// Naive method
	public static void countSetBits1(int n) {
		
		int count =0;
		while(n>0) {
			
			if((n&1)==1)
				count++;
			n=n>>1;
		}
		
		System.out.println("Count "+count);
	}
	
	// **  brian conrning algo 
	
	
	public static void countSetBits2(int n) {
		
		
		int count =0;
		while(n>0) {
			
			n= n&n-1;
				count++;
		
		}
		
		System.out.println("Count "+count);
		
	}

}
