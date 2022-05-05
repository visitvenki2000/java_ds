package geeks.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSDisc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v =7;
		ArrayList<ArrayList<Integer>> adjGraph = new ArrayList<ArrayList<Integer>>(v);
		
		for(int i=0;i<v;i++)
			adjGraph.add(new ArrayList<Integer>());
		
		addEdge(adjGraph,0,1);
		addEdge(adjGraph,0,2);
	
		addEdge(adjGraph,2,3);
		
		addEdge(adjGraph,4,5);	
		addEdge(adjGraph,4,6);
		addEdge(adjGraph,5,6);

		
		System.out.println(" No of Ilands "+bfsDis(adjGraph,v));
	
			
		}
		
		public static void addEdge(ArrayList<ArrayList<Integer>> list,int u,int v) {
			
			
			list.get(u).add(v);
			list.get(v).add(u);
			
		}
		
		public static void bfs(ArrayList<ArrayList<Integer>> adg, int s,boolean[] visited) {
			
		

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
		
		public static int bfsDis(ArrayList<ArrayList<Integer>> adg, int v) {
			
			boolean [] visited = new boolean[v];
			int count  =0;
			
			for(int i=0;i<v;i++) {
				
				if(visited[i]==false) {
					
					bfs(adg,i,visited);
					count++;
				}
			}
			
			return count;
			
		}
		
		public static void bfsShort(ArrayList<ArrayList<Integer>> adg, int s,int dest,boolean[] visited) {
			
			

			Queue<Integer> q = new LinkedList<Integer>();
			q.add(s); // add source
			visited[s] =true; // mark source as visited 
			int dist =0;
			int ans =0;
			while(!q.isEmpty()) {
				
				
				int size = q.size();
				
				
				while(size>0) {
					size--;
			 int u=	q.poll();
				System.out.print(" "+u);
				
				if(u==dest)
					ans=dist;
				
			 ArrayList<Integer> tempList = adg.get(u);
			 
			 for(int i=0;i<tempList.size();i++) {
				 
				 if(visited[tempList.get(i)]==false) {
				 q.add(tempList.get(i)); 
				 visited[tempList.get(i)] =true;
				 }
				 
			 }
			 
				}
				dist++;
				
			}
			
			System.out.println("Distance "+ans);

		}
		
int [] x = {-2,-1,1,1,-2,2,2,-1};
int [] y = {-1,-2,-2,2,1,-1,1,2} ;

public static void bfsKnight(ArrayList<ArrayList<Integer>> adg, int s,int dest,boolean[] visited) {
			
			

			Queue<Integer> q = new LinkedList<Integer>();
			q.add(s); // add source
			visited[s] =true; // mark source as visited 
			int dist =0;
			int ans =0;
			while(!q.isEmpty()) {
				
				
				int size = q.size();
				
				
				while(size>0) {
					size--;
			 int u=	q.poll();
				System.out.print(" "+u);
				
				if(u==dest)
					ans=dist;
				
			 ArrayList<Integer> tempList = adg.get(u);
			 
			 for(int i=0;i<tempList.size();i++) {
				 
				 if(visited[tempList.get(i)]==false) {
				 q.add(tempList.get(i)); 
				 visited[tempList.get(i)] =true;
				 }
				 
			 }
			 
				}
				dist++;
				
			}
			
			System.out.println("Distance "+ans);

		}


}
