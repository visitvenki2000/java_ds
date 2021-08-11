package geeks.graph;

import java.util.ArrayList;

public class DfsCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v =9;
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
		
		
		addEdge(adjGraph,1,3);
		addEdge(adjGraph,3,4);	
		//addEdge(adjGraph,1,2);
		
		addEdge(adjGraph,2,5);
		addEdge(adjGraph,5,6);
		addEdge(adjGraph,5,8);
		addEdge(adjGraph,6,7);
		addEdge(adjGraph,8,7);
	

	System.out.println(" Cycle "+dfsCycle(adjGraph,9));
	
			
		}
		
		public static void addEdge(ArrayList<ArrayList<Integer>> list,int u,int v) {
			
			
			list.get(u).add(v);
			list.get(v).add(u);
			
		}
		
		public static void dfs(ArrayList<ArrayList<Integer>> adg,int v, int s ) {
			
			boolean visited[] = new boolean[v];
			//dfsRecursion(adg,visited,s);
		
			
		}
		
		public static boolean dfsCycle(ArrayList<ArrayList<Integer>> adg, int v) {

			boolean visited[] = new boolean[v];
			int count = 0;

			for (int i = 1; i < v; i++) { // 1 base index 

				if (visited[i] == false) {
					count++;
					if(dfsRecursion(adg, visited, i,-1))
						return true;
				}

			}
			return false;

		}
		
		public static boolean dfsRecursion(ArrayList<ArrayList<Integer>> adg,boolean[] visited, int s, int parent ) {
			

			System.out.println("Visited "+s +"----parent "+parent);
			visited[s]= true;
			
			for(int i=0;i<adg.get(s).size();i++) {
				int temp = adg.get(s).get(i);
				
				if(visited[temp]==false) {
					 if(dfsRecursion(adg,visited,temp,s)==true)  return true; 
				}else if(temp!=parent) {
					System.out.println("Found Cycle "+temp +"----current "+s);
					return true;
				}
			}
			
			return false;
		}
	
	

}
