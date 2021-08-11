package list.prob;

import java.util.LinkedList;
import java.util.Queue;

// check size a 
// check size b 
// move a to a-b nodes...
//then move both until find equal value 
public class CheckInterSect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node node2 = new Node(1);
		node2.next= new Node(2);
		
		node2.next.next= new Node(3);		
		node2.next.next.next= new Node(5);		
		node2.next.next.next.next= new Node(2);
		node2.next.next.next.next.next= new Node(4);
		
		
		Node node1 = new Node(7);
		node1.next= new Node(9);
		node1.next.next= node2.next.next;
		node1.next.next.next= node2.next.next.next;
		node1.next.next.next.next= node2.next.next.next.next;
		node1.next.next.next.next.next= node2.next.next.next.next.next;
		
		Intersect in = new Intersect();
		System.out.println(in.intersectPoint(node2, node1));
		//Queue<Integer> q = new LinkedList<Integer>() ;
		//q.rem
		}

}


class Intersect
{
	int intersectPoint(Node headA, Node headB)
	{
         // code here
         
         int countA =0;
         int countB=0;
         Node tempA = headA;
         Node tempB = headB;
         
         countA=0;
         
         while(tempA!=null) {
             countA++;  tempA= tempA.next; }
             
              while(tempB!=null) {
             countB++; tempB = tempB.next; }

      		System.out.println("Count "+countA+"-"+countB);
       if(countA>countB){
           int diff = countA-countB;
           while (diff>0){
               diff--;
               headA =headA.next; // move till diff no if elements 
           }
       }else if(countB<countA) {
            int diff = countB-countA;
           while (diff>0){
               diff--;
               headB =headB.next; // move till diff no if elements 
           }
       }
       
       while(headA!=headB && headA!=null && headB!=null){
           
           headA =headA.next;
           headB =headB.next;
   		System.out.println("data "+headA.data+"-"+headB.data);
       }
       if(headA==headB)
       return headA.data;
       
       return -1;      
         
	}
	
}