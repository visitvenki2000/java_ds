package geeks.tree.prob;

import java.util.LinkedList;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

public class TopView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(1); 
 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.right = new Node(4); 
        root.left.right.right = new Node(5); 
        root.left.right.right.right = new Node(6); 
        System.out.println("Following are nodes in top view of Binary Tree");  
     //   View2(root);
        View2 v = new View2();
        v.TopView(root);
        /*
         * 
           1
        2     3
          4
            5
              6


         * 
         */
        

	}

}
class View1
{
    // function should print the topView of the binary tree
    static void topView(Node root)
    {
        // add your code
        if(root.left!=null)
        inOrder(root.left,true,true);
        // print root
           System.out.print(root.data+" ");
          if(root.right!=null)
        inOrder(root.right,true,false);
        
        
    }
    static void inOrder(Node root,boolean isPrint , boolean isleft){
        
        if(root==null)
        return;
        
         if(root.left!=null && isPrint && isleft)
        inOrder(root.left,true,true);
        // print root
        if(isPrint)
        System.out.print(root.data+" ");
        
          if(root.right!=null && isPrint &&  !isleft)
        inOrder(root.right,true,false);
        
        
    }
}

class View2
{
    // function should print the topView of the binary tree
  

    void TopView(Node root) { 
    	
    	  class QueueObj { 
    	        Node node; 
    	        int hd; 

    	        QueueObj(Node node, int hd) { 
    	       
    	            this.node = node; 
    	            this.hd = hd; 
    	        } 
    	    } 
        Queue<QueueObj> q = new LinkedList<QueueObj>(); 
        Map<Integer, Node> topViewMap = new TreeMap<Integer, Node>(); 
        
        if (root == null) { 
            return; 
        } else { 
            q.add(new QueueObj(root, 0)); 
        } 

        while (!q.isEmpty()) { 
            QueueObj tmpNode = q.poll(); 
            if (!topViewMap.containsKey(tmpNode.hd)) { 
                topViewMap.put(tmpNode.hd, tmpNode.node); 
            } 
  
            if (tmpNode.node.left != null) { 
                q.add(new QueueObj(tmpNode.node.left, tmpNode.hd - 1)); 
            } 
            if (tmpNode.node.right != null) { 
                q.add(new QueueObj(tmpNode.node.right, tmpNode.hd + 1)); 
            } 
  
        } 
        for ( java.util.Map.Entry<Integer, Node> entry : topViewMap.entrySet()) { 
            System.out.print(entry.getValue().data+" "); 
        } 
    	
    }
    
    void BottomView(Node root) { 
    	
  	  class QueueObj { 
  	        Node node; 
  	        int hd; 

  	        QueueObj(Node node, int hd) { 
  	       
  	            this.node = node; 
  	            this.hd = hd; 
  	        } 
  	    } 
      Queue<QueueObj> q = new LinkedList<QueueObj>(); 
      Map<Integer, Node> topViewMap = new TreeMap<Integer, Node>(); 
      
      if (root == null) { 
          return; 
      } else { 
          q.add(new QueueObj(root, 0)); 
      } 

      while (!q.isEmpty()) { 
          QueueObj tmpNode = q.poll(); 
          //if (!topViewMap.containsKey(tmpNode.hd)) { overwrite for bttom view
              topViewMap.put(tmpNode.hd, tmpNode.node); 
         // } 

          if (tmpNode.node.left != null) { 
              q.add(new QueueObj(tmpNode.node.left, tmpNode.hd - 1)); 
          } 
          if (tmpNode.node.right != null) { 
              q.add(new QueueObj(tmpNode.node.right, tmpNode.hd + 1)); 
          } 

      } 
      for ( java.util.Map.Entry<Integer, Node> entry : topViewMap.entrySet()) { 
          System.out.print(entry.getValue().data+" "); 
      } 
  	
  }
    
    
}