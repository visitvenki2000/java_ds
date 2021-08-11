package geeks.stack;

public class QueueTest {

	int arr[];
	int cap;
	int size;
	
	QueueTest(int cap){
		arr = new int[cap];
		size=0;
		this.cap =cap;
		
	}
	
	void enque(int input) {
	
		if(size!=cap) {
			
			arr[size++]= input;
			
		}
		
	}
	
	int dque(int input) {
		
		
		if(size!=0) {
			int res = arr[0];
		
			for(int i=1;i<size;i++) {
				arr[i-1] =arr[i];
			}
			return res;
			
		}
		return Integer.MAX_VALUE;
		
	}
	
	int getFront () {
		
		return arr[0];
		
	}
	
	int getRear () {
		
		return arr[size-1];
		
	}
	int getSize () {
		
		return size;
		
	}
	boolean isEmpty() {
		
		return size==0;
	}
	
	
	public static void main(String[] args) {
		
		
		
	}
}
