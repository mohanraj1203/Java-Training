import java.util.*;
class graph_basic{
	public static ArrayList<Integer> bfsofgraph(int v,ArrayList<ArrayList<Integer>> adj){
		ArrayList<Integer> bfs=new ArrayList<>();
		System.out.println(adj.size());
		boolean[] vis=new boolean[v];
		Queue<Integer> queue=new LinkedList<>();
		queue.add(0);
		vis[0]=true;
		while(!queue.isEmpty()){
			int node=queue.poll();
			bfs.add(node);
			for(int i:adj.get(node)){
				if(vis[i]==false){
					vis[i]=true;
					queue.add(i);
				}
			}
		}
		return bfs;
	}
	public static void main(String[] arg){
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		
		for(int i=0;i<5;i++)
			adj.add(new ArrayList<>());
		
		adj.get(0).add(1);
		adj.get(1).add(0);
		adj.get(0).add(4);
		adj.get(4).add(0);
		adj.get(1).add(2);
		adj.get(2).add(1);
		adj.get(1).add(3);
		adj.get(3).add(1);
		
		ArrayList<Integer> ans = bfsofgraph(5,adj);
		
		int n=ans.size();
		
		for(int i=0;i<n;i++)
			System.out.print(ans.get(i)+" ");
	}
}