package geeks.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
public static void bfs(ArrayList<ArrayList<Integer>> adg, int v,int s) {
	
	// initialize vertics with boolean 
	boolean[] visited = new boolean[v];

	Queue<Integer> q = new LinkedList<Integer>();
	q.add(s); // add source
	visited[s] =true; // mark source as visited 
	
	while(!q.isEmpty()) {
		
	 int u=	q.poll();
		System.out.print(" "+u);
	 ArrayList<Integer> tempList = adg.get(u);
	 
	 for(int i=0;i<tempList.size();i++) {
		 
		 if(visited[tempList.get(i)]==false) {
		 q.add(tempList.get(i)); 
		 visited[tempList.get(i)] =true;
		 }
		 
	 }
		
	}

}
}
