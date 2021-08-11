package geeks.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaTest {

	public LambdaTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer> (Arrays.asList(10,5,30,7));
		
		list.forEach((a)->{
			if(a%2==0)
				System.out.println(a);
		} );
		
	}

}
