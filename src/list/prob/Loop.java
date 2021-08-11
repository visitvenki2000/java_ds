package list.prob;

import list.Node;

class Loop{
    int detectLoop(Node head) {
        // Add code here
        Node slow =head;
        Node speed = head;
        
        
        while(speed!=null && speed.next!=null){
            
            slow = slow.next;
            speed = speed.next.next ;
            if(slow==speed)
            return 1;
            
            
        }
        
        
        return 0;
    }
    
}