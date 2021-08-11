package list.prob;

import list.Node;

class ReverseLL
{
    // This function should reverse linked list and return
   // head of the modified linked list.
   Node reverseList(Node head)
   {
        // add code here
        if(head==null)
        return null;
        
        Node current =head; Node prev = null;
   
        while( current!=null){
            
         Node next = current.next; //Node 2 
         current.next = prev;  //node 1  next 
         prev = current;    // set prev to current node 1 
         current = next;   //
        
            
        }
        return prev;
   }
}
