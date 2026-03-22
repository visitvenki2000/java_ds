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
		
		
		addEdge(adjGraph,1,2);
		addEdge(adjGraph,2,3);	
		//addEdge(adjGraph,1,2);
		
		/*addEdge(adjGraph,2,5);
		addEdge(adjGraph,5,6);
		addEdge(adjGraph,5,8);
		addEdge(adjGraph,6,7);
		addEdge(adjGraph,8,7); */
	

	//System.out.println(" Cycle "+dfsCycle(adjGraph,9));
	System.out.println(" Cycle "+isCycle2(4,adjGraph)); // 24apr 23 ... working in GFG
	//https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqazBKQnlRXzk2ck5YR25HdzdBdUd3OUdXRU1Md3xBQ3Jtc0trV2RTdnBuY2otMzRQZ2R3ZDZ1Y1J0Vl95eG1rWXVqamFsRVMySThvQVF3QlJPTUJyYnlZd3hvS2lJd2ptVHotLWFOdGpLcmFtaU42T0hDaWliMTEtd2hoUDF6NkM3LUtqVUl1a1FBODdVazRvZWU3VQ&q=https%3A%2F%2Fbit.ly%2F3cZMJXp&v=zQ3zgFypzX4
	
			
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
		
	    public static boolean isCycle2(int V, ArrayList<ArrayList<Integer>> adj) {
	        // Code here
	        
	          boolean [] visited = new boolean[V];
	        
	        for(int i=1;i<V;i++){
	            if(!visited[i]) {
	             if(Dfs2(i,adj,visited,-1)) return true; 
	             
	            }
	        }
	        return false;
	    }
	    
	    public static boolean Dfs2(int current, ArrayList<ArrayList<Integer>> adj,boolean[] visited,int parent){
	        
	        
	        visited[current] = true;
	        ArrayList<Integer> list= adj.get(current);
	        for(int i=0;i<list.size();i++){
	            int temp = list.get(i);
	            if(visited[temp]==false) {
	             if(Dfs2(temp,adj,visited,current)) {
	            	 return true;
	             }
	             }
	            else{
	                
	                if(temp!=parent) {
	                	System.out.println("temp"+temp+"-parent "+parent);
	                return true;
	                }
	            }
	        }
	        return false;
	    }
	
	

}
