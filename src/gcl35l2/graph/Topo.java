package gcl35l2.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Topo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v =6;
		ArrayList<ArrayList<Integer>> adjGraph = new ArrayList<ArrayList<Integer>>(v);
		
		for(int i=0;i<v;i++)
			adjGraph.add(new ArrayList<Integer>());
		
		addEdge(adjGraph,5,0);
		addEdge(adjGraph,5,2);	
		//addEdge(adjGraph,1,2);
		
		addEdge(adjGraph,4,0);
		addEdge(adjGraph,4,1);
		addEdge(adjGraph,2,3);
		addEdge(adjGraph,3,1);
	
		topoSort(adjGraph,6);

	
			
		}
		
		public static void addEdge(ArrayList<ArrayList<Integer>> list,int u,int v) {
			
			
			list.get(u).add(v); //directed graph 
			//list.get(v).add(u);
			
		}
		
		// top sort 
		
		public static void topoSort(ArrayList<ArrayList<Integer>> adj, int size ){
			
			boolean [] visited = new boolean[size+1];
			Arrays.fill(visited, false);
			Stack st = new Stack();
			for(int i=0;i<size;i++)
			dfs(adj,i,visited,st);
			System.out.println("===stack ############## ");
			while(!st.isEmpty()){
				
				System.out.println(" - "+st.pop());
			}
			
			
			
		}
		
		public static void dfs(ArrayList<ArrayList<Integer>> adj, int v, boolean [] visited,Stack st){
			
			
		
				
				if(visited[v]==false){
					visited[v]=true;
					System.out.println("=== visited "+v);
					for(int i:adj.get(v)) {					
		
					dfs(adj,i,visited,st);
				
		
				}
					st.push(v);
					System.out.println("=== Stack  "+v);
			
				
			}
			
			
		}
	

}
