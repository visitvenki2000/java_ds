package geeks.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

/*
 * Use Pair to save Distance
 * use Priority q with compartor as weight ***
 * update distance array with P q processing 
 * Use distance array to update ..fill with int max
 */
public class DikstraShortestUndir {

	public DikstraShortestUndir() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v =6;
		ArrayList<ArrayList<Pair>> adjGraph = new ArrayList<ArrayList<Pair>>(v);
		
		for(int i=0;i<v;i++)
			adjGraph.add(new ArrayList<Pair>());
		
		addEdge(adjGraph,1,2,2);
		addEdge(adjGraph,2,5,5);	
		addEdge(adjGraph,1,4,1);
		
		
		addEdge(adjGraph,4,3,3);
		
		addEdge(adjGraph,2,3,4);
		
		addEdge(adjGraph,3,5,1);
	
		
		System.out.println("Shortest path "+traverse(adjGraph,v));
		
	}
	
	
	public static void addEdge(ArrayList<ArrayList<Pair>> list,int u,int v,int w) {
		
		
		list.get(u).add(new Pair(v,w));
		list.get(v).add(new Pair(v,w));
		
	}
	
	
	public static boolean  traverse(ArrayList<ArrayList<Pair>> graph,int v) {
		
		
		int dist [] = new int[v];
		Arrays.fill(dist, Integer.MAX_VALUE);
		
				bfs(graph, 1,dist, v);				
				 System.out.println("Distance Array form 0");
				for (int i = 1; i < v; i++) {
					 System.out.println("i-"+i+"--"+dist[i]);
				}
		return false;
	}
	
	public static void bfs(ArrayList<ArrayList<Pair>> list,int v, int [] dist,int n) {
		
	
		dist[v]=0;
		PriorityQueue<Pair> q = new PriorityQueue<Pair>(n,new Pair());
		q.add(new Pair(v,1));
		
		while(!q.isEmpty()) {
			
			Pair data =	q.poll();
			  System.out.println("vertex picked "+data.vertex+"--"+dist[data.vertex]);
		
		ArrayList<Pair> adg = list.get(data.vertex);
		
		for(Pair e:adg)  {
			if (dist[e.vertex]>dist[data.vertex]+e.weight)  {
		 		 
		    dist[e.vertex] = dist[data.vertex]+e.weight;
		    q.add(new Pair(e.vertex,dist[e.vertex]));
		    System.out.println("Distance Updated e "+e.vertex+"-#-"+dist[e.vertex]);
		   
			}
		}
		
		}
		
	}

	




}

class Pair implements Comparator<Pair>{
	
	int vertex;
	int weight;
	Pair(int ver, int wei){
		vertex = ver;
		weight =wei;
	}
	Pair(){
		
	}
	@Override
	public int compare(Pair o1, Pair o2) {
		// TODO Auto-generated method stub
		if(o1.weight<o2.weight)
			return -1;
		if(o1.weight>o2.weight)
			return -1;
		
		return 0;
	}

}

