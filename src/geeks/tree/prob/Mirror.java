package geeks.tree.prob;

public class Mirror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class TreeMirror
{
    void mirror(Node node)
    {
	// Your code here
	if(node==null)
	return;
	mirror(node.left);
	mirror(node.right);
	 Node temp = node.left;
	 node.left = node.right;
	 node.right = temp;
	
	
    }
}