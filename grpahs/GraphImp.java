package grpahs;
import java.util.LinkedList;

public class GraphImp {
	int v;
	LinkedList<Integer> adjList[];
	
	GraphImp(int v) {
		this.v= v;
	    adjList = new LinkedList[v];
	    for (int i = 0; i < v; i++) {
			adjList[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(GraphImp graph, int src, int dest) {
		adjList[src].add(dest);
	}
	public static void main(String agrs[]) {
		int v = 5;
		GraphImp g1 = new GraphImp(v);
		g1.addEdge(g1, 0, 1);
		g1.addEdge(g1, 0, 3);
		g1.addEdge(g1, 1, 0);

	}

}
