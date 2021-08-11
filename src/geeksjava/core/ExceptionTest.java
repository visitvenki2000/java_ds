package geeksjava.core;

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
