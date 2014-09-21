package DFS;

import java.util.Stack;

import Graph.Graph;

public class DFSDemo {
	Graph g;
	boolean[] visited;
	Stack<Integer> stack;
	
	public DFSDemo(int count){
		g = new Graph(count);
		visited = new boolean[count];
		stack = new Stack<Integer>();
	}
	
	public void dfs(int node){
		visited[node]=true;
		System.out.println(node);
		stack.push(node);
		while(!stack.empty()){
			int v = getAdjacentNode(stack.peek());
			if(v==-1){
				stack.pop();
			}else{
				visited[v]=true;
				System.out.println(v);
				stack.push(v);
			}
		}
	}
	
	public int getAdjacentNode(int node){
		for(int i=0;i<g.getVertexCount();i++){
			if(g.isEdge(node,i) && visited[i]==false)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		DFSDemo obj = new DFSDemo(8);
		obj.g.addEdge(0,1);
		obj.g.addEdge(0,2);
		obj.g.addEdge(2,3);
		obj.g.addEdge(1,6);
		obj.g.addEdge(3,5);
		obj.g.addEdge(3,4);
		obj.g.addEdge(4,7);
		obj.dfs(0);

	}

}
