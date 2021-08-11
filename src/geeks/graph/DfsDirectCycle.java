package geeks.graph;

import java.util.ArrayList;

public class DfsDirectCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v =10;
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
		
		
		addEdge(adjGraph,1,2);
		addEdge(adjGraph,2,3);	
		//addEdge(adjGraph,1,2);
		
		addEdge(adjGraph,3,4);
		addEdge(adjGraph,3,6);
		addEdge(adjGraph,4,6);
		addEdge(adjGraph,6,5);
		addEdge(adjGraph,7,2);
		addEdge(adjGraph,7,8);
		addEdge(adjGraph,8,9);
		addEdge(adjGraph,9,7);
	

	System.out.println(" Cycle "+dfsCycle(adjGraph,v));
	
			
		}
		
		public static void addEdge(ArrayList<ArrayList<Integer>> list,int u,int v) {
			
			
			list.get(u).add(v);
			//list.get(v).add(u);
			
		}
		
	
		
		public static boolean dfsCycle(ArrayList<ArrayList<Integer>> adg, int v) {

			boolean visited[] = new boolean[v];
			boolean dfs[] = new boolean[v];
			int count = 0;

			for (int i = 1; i < v; i++) { // 1 base index 

				if (visited[i] == false) {
					count++;
					if(dfsRecursion(adg, visited, i,-1,dfs))
						return true;
				}

			}
			return false;

		}
		
		public static boolean dfsRecursion(ArrayList<ArrayList<Integer>> adg,boolean[] visited, int s, int parent,boolean[] bfs ) {
			

			System.out.println("Visited "+s +"----parent "+parent);
			visited[s]= true;
			bfs[s] = true;
			
			for(int i=0;i<adg.get(s).size();i++) {
				int temp = adg.get(s).get(i);
				
				if(visited[temp]==false) {
					 if(dfsRecursion(adg,visited,temp,s,bfs)==true)  return true; 
				}else if(bfs[temp]==true) {
					System.out.println("Found Cycle "+temp +"----current "+s);
					return true;
				}
			}
			
			bfs[s] = false;
			return false;
		}
	
	

}
