package geeks.bst.prob;

public class InsertBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class BST
{
    /* This function should insert a new node with given data and
      return root of the modified tree  */
    Node insert(Node root, int data)
    {
         // Your code here
         
         if(root==null) {
         root = new Node(data);
         return root;
         }
         
         if(root.data==data)
             return root; ///duplicate no insert
             
         
         if(data<root.data) {
         root.left = insert(root.left,data);
         
         }else {
             root.right = insert(root.right,data);
         }
         return root;
         
    }
}

