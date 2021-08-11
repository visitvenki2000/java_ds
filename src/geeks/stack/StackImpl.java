package geeks.stack;

public class StackImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackArray stockA = new StackArray(20);
		
		stockA.push(20);
		stockA.push(10);
		stockA.push(30);
		stockA.push(50);
		System.out.println(stockA.pop());
		
		System.out.println(stockA.pop());
		
		System.out.println(stockA.peek());
		
		System.out.println(stockA.pop());

	}

	
	
}


class StackArray {
	
	int top;
	int[] arr ;
	
	StackArray(int size){
		top= -1;
		arr =  new int[size];
		
	}
	
	void push(int x) {
		top++;
		arr[top]=x;
	}
	int pop() {
		
		int result = arr[top];
		top--;
		return result;
	}
	int peek() {
		
		return arr[top];
	}
	
	int size() {
		
		return arr.length;
	}
}