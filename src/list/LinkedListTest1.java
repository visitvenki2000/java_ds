package list;

import java.util.HashMap;

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
		
		//findMiddle(linked.head);
		//linked.print();
		reverse(linked.head);
		linked.print();
		

	}
	
	public static Node2 checkLoop2(Node2 head){
		Node2 temp = head;
		HashMap<Node2,Boolean> map = new HashMap<Node2,Boolean>();
		Node2 prev =null;
		while( temp!=null){
			prev = temp;
			temp = temp.next;
			if(map.containsKey(temp)){
				prev.next = null;
				return head;
			}else{
			map.put(temp, true);
			}
		}
		
		return null;
		
	}
	
	public static Node2 checkLoopFast2(Node2 head){
		Node2 slow = head;
		Node2 fast = head;
	
		
		while( fast!=null){
			if(slow==fast)
				break;
		slow =slow.next;
		fast = fast.next;
		if(fast!=null)
			fast =fast.next;
		}
		
		fast = head;
		while( fast.next!=slow.next){
			fast = fast.next;
			slow = slow.next;
		}
		slow.next =null;
		
		return head;
		
	}
	public static boolean checkLoopFast(Node2 head){
		Node2 slow = head;
		Node2 fast = head;
	
		
		while( fast!=null){
			if(slow==fast)
				return true;
		slow =slow.next;
		fast = fast.next;
		if(fast!=null)
			fast =fast.next;
		}
		
		return false;
		
	}
	public static boolean checkLoop(Node2 head){
		Node2 temp = head;
		HashMap<Node2,Boolean> map = new HashMap<Node2,Boolean>();
		
		while( temp!=null){
			temp = temp.next;
			if(map.containsKey(temp)){
				return false;
			}else{
			map.put(temp, true);
			}
		}
		
		return true;
		
	}
	public static void reverse(Node2 head){
		
		
		Node2 curr = head;
		Node2 next = head.next;
		Node2 prev= null;

		while(curr.next!=null){
			//Node2 temp2 = curr;
			curr.next =prev;
			prev = curr;
			curr =next;
			next = next.next;			
			
		}
		
		head = curr;
	}
	public static Node2 findMiddle(Node2 head){
		
		Node2 temp = head;
		int count=0;
		while( temp!=null){
			temp = temp.next;
			count++;
		}
		int middle= count/2;
		
		 temp = head;
		while(middle>0){
			temp = temp.next;
			middle--;
		}
		System.out.println(""+temp.data);
		
		return temp;
	}
	public static void insertAtInex(int ind,Node2 head,int data){
		
		Node2 temp = head;
		while(ind>0 && temp!=null){
			temp = temp.next;
			ind--;
		}
	
		 Node2 newNode = new Node2(data);
		 newNode.next = temp.next;
		 temp.next = newNode;
		
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
