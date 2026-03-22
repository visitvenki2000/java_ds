package geeksjava.core;

import java.util.Calendar;

public class ExceptionTest  {

	
	public ExceptionTest(String msg) {

	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -9027479732042974389L;
	
	
	public static void main(String[] args) {
		
		
		int i =0;
		try {
			
			
			Calendar currentCal = Calendar.getInstance();
	 
	    	
			currentCal.set(Calendar.YEAR, 2024);
			currentCal.set(Calendar.MONTH, 11-1);		
			currentCal.set(Calendar.DAY_OF_MONTH, 9);
			
		
			currentCal.set(Calendar.HOUR, 11);
			currentCal.set(Calendar.MINUTE, 9);
			currentCal.set(Calendar.SECOND, 2);
			System.out.println("date "+currentCal.getTime());
			
		i++;
		testExc(i);
		testExcRun(i);
		}
		catch(MyException a) {	
					}
	}
	
	public static void testExc(int i) throws MyException {

		if (i > 5) {
			throw new MyException("test");
		} else {
			i = 0;
		}
	}
	
	public static void testExcRun(int i) {
		if (i > 5) {
			throw new MyRunException("test");

		} else {
			i = 0;
		}
	}

}
