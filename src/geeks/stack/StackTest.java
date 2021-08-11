package geeks.stack;

import java.util.Stack;

public class StackTest {

	
	int [] arr;
	int cap;
	int top;
	
	StackTest(int cap){
		top =-1;
		arr = new int [cap];
		
		
	}
	public void push(int input) {
	
		arr[++top] =input;
		cap++;
		
	}
	

	public int pop() {
		
		//if(top!=-1) {
		cap--;
		return arr[top--];
		
	}
	
	public int peek() {
		
		
		return arr[top];
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackTest st = new StackTest(10);
		st.push(10);
		st.push(20);
		System.out.println(st.peek());
		
		System.out.println(st.pop());
		
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
		
		Stack< Integer> st1  = new Stack<>();
	

	}

}
