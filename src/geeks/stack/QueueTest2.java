package geeks.stack;

import java.util.Arrays;

public class QueueTest2 {

	int arr[];
	int cap;
	int size;
	int front;
	
	QueueTest2(int cap){
		arr = new int[cap];
		size=0;
		front =-1;
		this.cap =cap;
		
	}
	
	void enque(int input) {
		
	  if(front==-1) {
		  arr[++front] =input;
		size++; 
		return;
	  }
	  
		int rear = (front +size-1 )%cap;
		rear = (rear+1 )%cap;
    	arr[rear]= input;
    	size++;
    	
		
	}
	
	int deQue() {
		if(size!=0) {
			int res = arr[front];
			arr[front] =-1;
			front  = (front +1 )%cap;
			size--;		
			return res;
		}
		return Integer.MAX_VALUE;
	}
	
	int getFront () {
		
		return arr[front];
		
	}
	
	int getRear () {
	
		return arr[(front+size-1)%cap];
		
	}
	int getSize () {
		
		return size;
		
	}
	boolean isEmpty() {
		
		return size==0;
	}
	
	
	public static void main(String[] args) {
		
		QueueTest2 q2 = new QueueTest2(3);
		q2.enque(10);
		q2.enque(20);
		q2.enque(30);
		System.out.println(Arrays.toString(q2.arr));
		
		System.out.println(q2.deQue());
		System.out.println(Arrays.toString(q2.arr));
		
	}
}
