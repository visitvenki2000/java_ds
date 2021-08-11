package java8;

public class TypeInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringLengthLambda lambdafn = s->s.length();
		
		System.out.println(lambdafn.getLength("hello"));
		
		
	}

	
	interface StringLengthLambda {
		
		int getLength(String s);
	}
}
