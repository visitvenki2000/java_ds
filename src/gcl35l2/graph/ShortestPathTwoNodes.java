package gcl35l2.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathTwoNodes {

	public ShortestPathTwoNodes() {
		// TODO Auto-generated constructor stub
	}

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
	
		shortestPath(0,3,adjGraph,v);

	
			
		}
	
	/*
	 *   0 --------5
	 *   -       -
	 *   -      2
	 *   -         -
	 *   -                3
	 *   -              -  
	 *   4------------1		
	 */
		public static void addEdge(ArrayList<ArrayList<Integer>> list,int u,int v) {
			
			
			list.get(u).add(v); //directed graph 
			list.get(v).add(u);
			
		}
	
	
	public static int shortestPath(int src, int dest, ArrayList<ArrayList<Integer>> adg, int v) {
		boolean[] visited = new boolean[v + 1];
		Queue<Integer> que = new LinkedList<Integer>();
		que.add(src);
		visited[src] = true;
		int count = 0;
		int shortest = Integer.MAX_VALUE;
		while (!que.isEmpty()) {
			int size = que.size();
			count++;

			while (size > 0) {
				size--;
				int item = que.poll();
				System.out.println("visited --- " + item);
				for (int temp : adg.get(item)) {

					if (visited[temp] == false) {
						que.add(temp);
						visited[temp] = true;
						if (dest == temp) {
							shortest = Math.min(shortest, count);

						}
					}
				}

			}
		}
		System.out.println("shortest --- " + shortest);

		return shortest;
	}

}
