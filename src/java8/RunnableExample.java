package java8;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thread mythread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("in Run method ");
			}
	
			
		});
		
		mythread.start();
		
		Thread mythread2 = new Thread(()->System.out.println("My new Lamda method"));
		mythread2.start();
		
		
		
	}
	
	

}
