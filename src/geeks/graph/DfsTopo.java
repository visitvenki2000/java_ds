package geeks.graph;

import java.util.ArrayList;
import java.util.Stack;

public class DfsTopo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v =6;
		ArrayList<ArrayList<Integer>> adjGraph = new ArrayList<ArrayList<Integer>>(v);
		
		for(int i=0;i<=v;i++)
			adjGraph.add(new ArrayList<Integer>());
		
		/*addEdge(adjGraph,0,1);
		addEdge(adjGraph,1,2);	
		addEdge(adjGraph,2,3);
		
		addEdge(adjGraph,0,4);	
		addEdge(adjGraph,4,5);
		addEdge(adjGraph,5,6);
		addEdge(adjGraph,4,6); */
		
	/*	addEdge(adjGraph,0,1);
		addEdge(adjGraph,0,2);	
		addEdge(adjGraph,2,3);
		
		addEdge(adjGraph,1,3);	
		addEdge(adjGraph,1,4);
		addEdge(adjGraph,4,5); */
		
		
		addEdge(adjGraph,5,0);
		addEdge(adjGraph,5,2);	
		//addEdge(adjGraph,1,2);
		
		addEdge(adjGraph,4,0);
		addEdge(adjGraph,4,1);
		addEdge(adjGraph,2,3);
		addEdge(adjGraph,3,1);
	
	

	System.out.println(" Cycle "+dfsCycle(adjGraph,v));
	
			
		}
		
		public static void addEdge(ArrayList<ArrayList<Integer>> list,int u,int v) {
			
			
			list.get(u).add(v);
			//list.get(v).add(u);
			
		}
		
	
		
		public static boolean dfsCycle(ArrayList<ArrayList<Integer>> adg, int v) {

			boolean visited[] = new boolean[v];
			boolean dfs[] = new boolean[v];
			Stack st = new Stack<>();
			int count = 0;

			for (int i = 0; i < v; i++) { // 1 base index 

				if (visited[i] == false) {
					count++;
					dfsRecursion(adg, visited, i,-1,st);
						
				}

			}
			System.out.println("Top Sorted ------ ");
			while(!st.isEmpty()) {
				System.out.println("---- "+st.pop());
			}
			return false;

		}
		
		public static void dfsRecursion(ArrayList<ArrayList<Integer>> adg,boolean[] visited, int s, int parent,	Stack st  ) {
			

			System.out.println("Visited "+s +"----parent "+parent);
			visited[s]= true;
			
			
			for(int i=0;i<adg.get(s).size();i++) {
				int temp = adg.get(s).get(i);
				
				if(visited[temp]==false) {
					 dfsRecursion(adg,visited,temp,s,st) ;
				}
			}
			
			st.push(s);
			
			
		}
	
	

}
