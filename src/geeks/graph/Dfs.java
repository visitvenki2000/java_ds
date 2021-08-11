package geeks.graph;

import java.util.ArrayList;

public class Dfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v =6;
		ArrayList<ArrayList<Integer>> adjGraph = new ArrayList<ArrayList<Integer>>(v);
		
		for(int i=0;i<v;i++)
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
		
		
		addEdge(adjGraph,0,1);
		addEdge(adjGraph,0,2);	
		addEdge(adjGraph,1,2);
		
		addEdge(adjGraph,3,4);
	

	System.out.println(" Ilands "+dfsIland(adjGraph,5));
	
			
		}
		
		public static void addEdge(ArrayList<ArrayList<Integer>> list,int u,int v) {
			
			
			list.get(u).add(v);
			list.get(v).add(u);
			
		}
		
		public static void dfs(ArrayList<ArrayList<Integer>> adg,int v, int s ) {
			
			boolean visited[] = new boolean[v];
			dfsRecursion(adg,visited,s);
		
			
		}
		
		public static int dfsIland(ArrayList<ArrayList<Integer>> adg, int v) {

			boolean visited[] = new boolean[v];
			int count = 0;

			for (int i = 0; i < v; i++) {

				if (visited[i] == false) {
					count++;
					dfsRecursion(adg, visited, i);
				}

			}
			return count;

		}
		
		public static void dfsRecursion(ArrayList<ArrayList<Integer>> adg,boolean[] visited, int s ) {
			

			System.out.println(" "+s);
			visited[s]= true;
			
			for(int i=0;i<adg.get(s).size();i++) {
				int temp = adg.get(s).get(i);
				
				if(visited[temp]==false)
					dfsRecursion(adg,visited,temp);
			}
			
			
		}
	
	

}
