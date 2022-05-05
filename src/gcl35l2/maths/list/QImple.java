package gcl35l2.maths.list;

public class QImple {

	int data[];
	int count;
	int front;
	int last;
	int cap=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public QImple(int cap){
		data = new int[cap];
		front=-1;
		last=-1;
		this.cap =cap;
		
	}
	
	public boolean enque(int item){
		
		if(count<data.length){
			last++;
			data[(last)/cap]=item;
			count++;
		}
		else
			return false;
		
		return true;
		
	}
	public int deque(){
		
		if(front!=last) {
		
			front--;
			count--;	
			return data[front];
		}
		else
			return -1;
	}
	
	public int front(){
		
		if(count>0)
			return data[count];
		else
			return -1;
	}

}
