package maths;

import java.util.Random;

public class RandomGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random rand = new Random();

		// nextInt as provided by Random is exclusive of the top value so you need to add 1 

		int randomNum = rand.nextInt(5 ) + 1;
		
		System.out.println(""+randomNum);
		
	}

	public static int getRandom() {
		
		
		int randomNum = 1;
		try {
			Random rand = new Random();

			// nextInt as provided by Random is exclusive of the top value so you need to add 1 

			 randomNum = rand.nextInt(5 ) + 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return randomNum;
	}
	
}
