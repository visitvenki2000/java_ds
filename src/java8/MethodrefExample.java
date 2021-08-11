package java8;

public class MethodrefExample {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thread t = new Thread(()->process());
		Thread t2 = new Thread(MethodrefExample::process);
		t.start();
		t2.start();
		
	}
	
	public static void process() {
		
		System.out.println("process method");
	}
}
