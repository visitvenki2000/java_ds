package list;

public class LinkedListTest1 {

	Node2 head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedListTest1 linked = new LinkedListTest1();
	     linked.insert(10);
		
	
		linked.insert(20);
		linked.insert(30);
		linked.insert(40);
		linked.insert(50);
		
		linked.print();
		

	}
	
 

public  void print() {
	
	for(Node2 temp = head;temp!=null;temp =temp.next)
		System.out.println(" "+temp.data);
	
	Node2 temp2 = head;
	while(temp2!=null ) {
		System.out.println(" while "+temp2.data);
	   temp2=temp2.next	;
	}
}


public  Node2  insert(int input) {
	
	Node2 temp = head;
	if(head==null) {
		head = new Node2(input);
		return head;
	}
	Node2 temp2 =new Node2(input);
	
	while(temp.next!=null)
		temp=temp.next;
	
	temp.next = temp2;
	return temp;
	
}
}

class Node2 {
	
	int data;
	Node2 next;
	
	
  Node2(int input){
	  data= input;
  }
	

	
}
