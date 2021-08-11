package geeksjava.core;

public class ThreadTest {

	public ThreadTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.concurrent.ArrayBlockingQueue<String> q;
		
		Thread t1 = new Thread(new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}});
		
		Thread t2 = new Thread(() -> System.out.println("t2"));
		t2.start();

	}
	public static void process() {
		
	}

}
