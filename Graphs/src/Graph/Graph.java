package Graph;

public class Graph {
	private boolean adj[][];
	private int vertexCount;
	
	public Graph(int size){
		vertexCount = size;
		adj = new boolean[vertexCount][vertexCount];
	}
	
	public void addEdge(int i,int j){
		if(i!=j){
			adj[i][j]=adj[j][i]=true;
		}
	}
	
	public void deleteEdge(int i,int j){
		adj[i][j]=adj[j][i]=false;
	}
	
	public boolean isEdge(int i,int j){
		return(adj[i][j]==true && adj[j][i]==true);
	}
	
	public int getVertexCount(){
		return vertexCount;
	}
}
