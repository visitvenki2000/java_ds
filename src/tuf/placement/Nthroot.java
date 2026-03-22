package tuf.placement;

public class Nthroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getNthroot(3,27);

	}
	
	public static double multi(double input, int n) {
		double result =1;
		for(int i=1;i<=n;i++) {
			result = result*input;
		}
		return result;
	}
	
	public static double getNthroot(int n, int m) {
		double low = 1;
		double high = m;
		double diff = 1e-6;
		while (high - low > diff) {
			double mid = (low + high) / 2;
			if (multi(mid, n) < m) {
			low = mid;
			} else {
				high = mid;
			}
		}
		System.out.println("result " + high + "-/-" + low);
		return high;
	}
}
