package gcl35l2.maths;

public class BinaryConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(""+convert(105));
	}
	
	public static String convert(int input){
		
		StringBuffer s = new StringBuffer();
		
		System.out.println("method called");
	
		while(input>0){
			if(input%2==0)
				s.append("0");
				else
					s.append("1");
			
			//System.out.println(""+s);
			input =input/2;
		}

		System.out.println(" string  "+s);
		return s.reverse().toString();
	}

}
