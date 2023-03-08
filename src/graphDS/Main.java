package graphDS;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
		
		nodeList.add( new GraphNode("Zunair        ",0));
		nodeList.add( new GraphNode("Abdul-Rehman  ",1));
		nodeList.add( new GraphNode("Lakhte Husnain",2));
		nodeList.add( new GraphNode("Uzair Zafar   ",3));
		nodeList.add( new GraphNode("Emran Hashmi  ",4));
		
		Graph g = new Graph(nodeList);
		
		g.addUndirectedEdge(0, 1);
		g.addUndirectedEdge(0, 2);
		g.addUndirectedEdge(0, 3);
		g.addUndirectedEdge(1, 4);
		g.addUndirectedEdge(2, 3);
		g.addUndirectedEdge(3, 4);
		
		System.out.println(g.toString());
		g.toString();
	
	}

}
