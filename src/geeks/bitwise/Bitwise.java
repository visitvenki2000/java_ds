package geeks.bitwise;

public class Bitwise {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =3;
		int b =6;
		int x= 5;
		// And
		System.out.println(a&b);
		// or 
		System.out.println(a|b);
		// xor 1 when two are different 
		
		System.out.println(a^b);
		System.out.println("---Part 2 --- inverse / complement");
		
		System.out.println(~x);
		// left shift 
		x=3;
		System.out.println("---left shit");
		System.out.println(x<<1);
		
		
		System.out.println("---left shit");
		System.out.println(x<<2);
		
		System.out.println("---left shit 4");
		System.out.println(x<<4);
		
		
		System.out.println("---left shit 30");
		System.out.println(x<<30);
		
		System.out.println("---left shit -1");
		System.out.println(x<<30);
		
		System.out.println("---Part 3 --- right shift ");
		x=-2;
		System.out.println(x>>1);
		// impo ... output / -1 
		System.out.println(x>>2);
		
		System.out.println("---Part 3 --- Un sign  right shift ");
		
		System.out.println(x>>>1);
	}

}
