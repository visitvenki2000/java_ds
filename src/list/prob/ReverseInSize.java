package list.prob;

//{ Driver Code Starts
import java.util.*;
import java.lang.*;



class ReverseInSize
{
 static Node head;
 
 public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     
     while(t-- > 0)
     {
         int n = sc.nextInt();
         int a1 = sc.nextInt();
         Node head = new Node(a1);
         addToTheLast(head);
         for(int i = 1; i < n; i++)
         {
             int a = sc.nextInt();
             addToTheLast(new Node(a));
         }
         
         int k = sc.nextInt();
         GfG gfg = new GfG();
         Node res = gfg.reverse(head, k);
         printList(res);
         System.out.println();
     }
 }
 
 public static void addToTheLast(Node node)
 {
     if(head == null)
     {
         head = node;
     }
     else
     {
         Node temp = head;
         while(temp.next != null)
           temp = temp.next;
           temp.next = node;
     }
 }
 
 public static void printList(Node node)
 {
     while(node != null)
     {
         System.out.print(node.data + " ");
         node = node.next;
     }
 }
 
}

//} Driver Code Ends
/*node class of the linked list
class Node
{
 int data;
 Node next;
 Node(int key)
 {
     data = key;
     next = null;
 }
}
*/
class GfG
{
 public static Node reverse(Node node, int k)
 {
     //Your code here
     Node prev = null;
     Node current = node;
      Node next =null;
  
     int i= 0;
      while( i<k && current!=null){
          
    
   
         next = current.next;
          current.next = prev;
          prev = current ;
          current = next;
          i=i+1;
          
     
                }
         if(next!=null)       
         node.next = reverse(next,k);
        return prev;
     
 }
}
