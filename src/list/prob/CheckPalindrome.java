package list.prob;

import java.util.Stack;


// use stack to compare till mid =count/2....   123321 ... medam ara palindrome ...
public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node node2 = new Node(1);
		node2.next= new Node(2);
		node2.next.next= new Node(3);
		
		node2.next.next.next= new Node(3);
		
		node2.next.next.next.next= new Node(2);
		node2.next.next.next.next.next= new Node(4);
		
		Palindrome isPalindrome = new Palindrome();
		System.out.println(isPalindrome.isPalindrome(node2));
	}

}
class Palindrome
{
    // Function to check if linked list is palindrome
    boolean isPalindrome(Node head) 
    {
        //Your code here
    	
        
        if(head==null || head.next==null )
        return true;
    	
    	int size = 0; // get size 
    	Node temp = head;
    	Node start = head;
    	int mid= 0;
    	
       	System.out.println("start posi a:"+start.data);
    	while(temp!=null) {
    		
    		temp = temp.next;
    		size =size+1;
    	}
    	mid = size/2; 
    	Stack<Integer> stack = new Stack<Integer>();
    	System.out.println("size:"+size);
    	System.out.println("mid:"+mid);
       	System.out.println("start posi :"+start.data);
    	
    	
    	int count =0;
    	while(count<mid) {
    		
    		stack .push(start.data);
    		start= start.next;
    		count= count+1;
    	}
     	System.out.println("start stack size:"+stack.size());
    	if(size%2>0)
    		start= start.next; // for odd leave middle node 
    	
    	System.out.println("start posi:"+start.data);
    
    	
    	boolean result = false;;
    	while(!stack.isEmpty()) {
    		
    		int item = stack.pop();
    		System.out.println("item posi:"+item);
    	
    		if(item==start.data) {
    			
    			start=start.next;
    			result =true;
    		}else {
    			result =false;
    			break ;
    		}
    		
    	
    		
    	}
    	
    	
    	return result;
    	
    }    
}