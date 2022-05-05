package gcl35l2.graph;

public class DisjointSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int v =3;
		 int e =3;
		DisjointSet graph = new DisjointSet(v,e);
		int[] parent = new int[v];
		for(int i=0;i<v;i++){
			parent[i]=i;
		}
		
		graph.edges[0].src = 0;
		graph.edges[0].dest = 1;
		
		graph.edges[1].src = 1;
		graph.edges[1].dest = 2;
		
		graph.edges[2].src = 0;
		graph.edges[2].dest = 2;
		System.out.println("result : "+unionCheckCycle(parent,graph.edges,v));
	
		
	}
	public int v;
	public Edge[] edges;
	class Edge{		
		int src;
		int dest;
	}
	// v no of vertices, E  no of edges 
	public DisjointSet(int v, int e){
		this.v = v;
		this.edges = new Edge[e];
		for(int i=0;i<e;i++){
			edges[i]=new Edge();
		}
	}
	// get Parent function if parent matches current node..that is root return... 
	public static int getParent(int[] parent , int i){
		System.out.println("get Parent--- " +i);
		if(parent[i]==i)
			return i;
		else 
		return getParent(parent, parent[i]);	
	}
	
	// adjust parent of both nodes  .....to link with  edge 
	public static void union(int [] parent, Edge edge){		
		System.out.println("get union--- " +edge.src +" - "+edge.dest);
		int aRef = getParent(parent,edge.src);
		int bRef = getParent(parent, edge.dest);
		if(parent[edge.src]==edge.src)
		parent[bRef] = aRef;
		else 
			parent[aRef] = bRef;
	}
	
	public static int unionCheckCycle(int [] parent,Edge[] edges,int v){
		
		
		for(int i =0; i<edges.length;i++){
			int aRef = getParent(parent,edges[i].src);
			int bRef = getParent(parent, edges[i].dest);
			
			if(aRef==bRef)
				return 1;
			
			union(parent,edges[i]);
			
		}
		return 0;
	

	}
}
