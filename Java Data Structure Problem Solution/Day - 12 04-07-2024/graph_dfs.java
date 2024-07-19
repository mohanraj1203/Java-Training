import java.util.*;
class graph_dfs{
	public static void dfs(int node,boolean[] vis,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ls){
		vis[node]=true;
		ls.add(node);
		for(Integer i:adj.get(node)){
			if(vis[i]==false)
				dfs(i,vis,adj,ls);
		}
	}
	public static ArrayList<Integer> dfsofgraph(int v,ArrayList<ArrayList<Integer>> adj){
		boolean vis[]=new boolean[v];
		vis[0]=true;
		ArrayList<Integer> ls=new ArrayList<>();
		dfs(0,vis,adj,ls);
		return ls;
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
		
		ArrayList<Integer> ans = dfsofgraph(5,adj);
		
		int n=ans.size();
		
		for(int i=0;i<n;i++)
			System.out.print(ans.get(i)+" ");
	}
}