package geeks.stack;

import java.util.Stack;

public class CheckParanthese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("is Balanced-"+isBalanced("{[({)]}".toString()));
		
		
		

	}
	
	public static boolean isBalanced(String input) {
		
Stack<String> st = new Stack<String>();
		
		// input ="{[()]}";
		
		for (int i=0; i<input.length();i++) {
			
			
			String curr = input.charAt(i)+"";
			
			if(input.charAt(i)=='{' || input.charAt(i)=='[' || input.charAt(i)=='(')
			{
				st.push(input.charAt(i)+"")	;
				System.out.println("Pushing---"+input.charAt(i)+"");
			}else if(st.isEmpty()==true) {
				return false;
				
			}else   {
				System.out.println("stack- curr--"+curr);
				System.out.println("stack- peek--"+st.peek());
				if(isMatching( st.peek(),curr)){
				String temp = st.pop();
				System.out.println("stack- pop--"+temp);
				
				}
				
			}
		}

		//System.out.println("stack- Peek--"+st.peek());
	return st.isEmpty()==true;
	}
		
	public static boolean isMatching(String st1, String st2) {

		if (st1.equals("{") && st2.equals("}"))
			return true;

		if (st1.equals("[") && st2.equals("]"))
			return true;

		if (st1.equals("(") && st2.equals(")"))
			return true;

		return false;

	}

}
