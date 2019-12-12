package geeks;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueArray qarr = new QueueArray();
		
		qarr.enque(2);		
		qarr.enque(3);
		qarr.enque(4);
		qarr.enque(5);
		
		qarr.enque(22);		
		qarr.enque(23);
		qarr.enque(24);
		qarr.enque(25);

		
		
		System.out.println(qarr);
		qarr.deque();
		
		System.out.println("De quee start -- ");
		System.out.println(qarr);
		qarr.deque();
		qarr.deque();
		qarr.deque();
	
		
		System.out.println(qarr);
		//System.out.println(qarr.deque());
		
		qarr.enque(12);		
		qarr.enque(13);
		qarr.enque(14);
		qarr.enque(15);
		
		qarr.enque(16);
		qarr.enque(17);
		System.out.println(qarr);
		qarr.enque(19);
		
		System.out.println(qarr);

		//Queue<Integer> q1 = new PriorityQueue<Integer>();
	}
	
}


class QueueArray {
	
	int front=-1; // to remove item in front
	int rear =-1; // to insert item in end
	int [] arr ;
	int size =0;
	int capacity =0;
	
	QueueArray(){
		arr = new int[10]; 
		capacity =arr.length;
	}

	// handle if array is full
	//
	public Integer enque(int item) {
		
		rear++;
		
		if(rear==front) {
			
			System.out.println("Queue is full rear "+rear+" front "+front);
			return null;
		}
		rear = rear%(arr.length);  
		arr[rear]=item;		
		size++;
	
		// rear =9  rear => 9%10 > 9 , 
		// rear 10 rear => 10/10 > 0
		//rear 11 rear => 11/10 > 1
		if(front==-1)
			front=0; // handle starting of queue 
		
	
		
		return 1;
		
	}
	public Integer deque() {
		
		int result = arr[front];
		arr[front] =0;
		front++;
		
		size--;
		
		return result;
	}
	
	public String toString() {
		
		String s = "";
		
		for(int item: arr) {
			s =" "+s+" "+item;
		}
		return s;
	}
	
}