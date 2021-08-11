package list.prob;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node1 = new Node(5);
		node1.next= new Node(4);
		
		Node node2 = new Node(5);
		node2.next= new Node(4);
		node2.next.next= new Node(3);
		Add add = new Add();
		Node result = add.addTwoLists(node1, node2);
		
		while(result!=null) {
			System.out.print(result.data+" ");
			result = result.next;
			
		}

	}
	
	

}

class Add {
    
    // This function will add the numbers represented by two linked lists
    Node addTwoLists(Node first, Node second) {
        // Your code here
        
        Node head = null; // 3rd linked list 
        Node temp = null;
        int carry =0;
    	System.out.print("---start ----- ");
        
        while(first!=null && second !=null) // 2 other cases seperately ....in while
        {
            
            int sum = first.data + second.data+carry;
            carry = sum/10;
            int rem = sum%10;
            
            if(head==null) {
            head = new Node(rem);
            temp = head;
            }
            else  {
            temp.next = new Node(rem);
            temp= temp.next; }
            first = first.next;
            second = second.next;
            

         	System.out.print(" carry "+carry);
           	System.out.print(" sum "+sum);
           	System.out.print(" rem "+rem);
           	
        	System.out.print(" > "+temp.data);
            
        }
    	System.out.println("---step 2 ----- ");
        while(first==null && second!=null){
                  int sum =  second.data+carry;
            carry = sum/10;
            int rem = sum%10;
            
            if(head==null) {
            head = new Node(rem);
        temp = head;
            }
            else  {
            temp.next = new Node(rem);              
            temp= temp.next; }
            second = second.next;
        	System.out.print(temp.data+" / ");
        }
    	System.out.println("---step 3 ----- ");
        
         while(first!=null && second==null){
            
             int sum =  first.data+carry;
            carry = sum/10;
            int rem = sum%10;
            
            if(head==null) {
            head = new Node(rem);
            temp = head; }
            else {
            temp.next = new Node(rem);  
            temp= temp.next; }
                  first = first.next;
                  
               	System.out.print(temp.data+" - ");
         
        }
        
        if(carry!=0){
             if(head==null) {
            head = new Node(carry); 
            temp = head;}
            else 
            temp.next = new Node(carry);  
            // temp= temp.next;
             
          	System.out.print(temp.data+"+ ");
            
        }
        
        
        return head;
    }
}
