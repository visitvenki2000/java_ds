package gcl35l1.maths;

public class Gcd {

	public Gcd() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System.out.println(15%10);
   System.out.println(gcd(45,15));
	}
	
	public  static int gcd(int x, int y) {
		if(x>y)
		{
			//swap 
			int temp =x;
			x=y;
			y=temp;
			
		}
		if(y%x==0)
			return x;
		else
			return gcd(y%x,x);
	}

}
