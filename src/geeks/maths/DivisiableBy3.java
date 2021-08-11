package geeks.maths;

public class DivisiableBy3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(""+exactly3Divisors(30));
	}
	
	public static int exactly3Divisors(int N)
	{
		int count = 0;
		
		if(N<=3)
			return 0;
		
		for(int i = 2; i < N && (i * i ) <= N ; i++) {
		if(isPrime(i)) {
		count++;
		}
		}

		return count;
	}
	
	
	public static boolean isPrime(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
		if(n % i == 0) {
		return false;
		}
		}
		return true;
		}
}
