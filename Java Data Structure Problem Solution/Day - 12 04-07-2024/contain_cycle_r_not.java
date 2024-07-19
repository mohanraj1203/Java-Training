import java.util.*;
class contain_cycle_r_not{
	
	static ArrayList<Integer> result=new ArrayList<>();
	static ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
	static boolean ans;
	static Stack<Integer> stack=new Stack<>();
	public static void dfs(int node,boolean[] vis){
		
		
		
		if(result.contains(node) && vis[node] == true){
			ans=true;
			return;
		}
		vis[node]=true;
		result.add(node);
		stack.add(node);
		System.out.println(result);
		for(Integer i:adj.get(node)){
			if(stack.peek()!=i && vis[node] == false)
				dfs(i,vis);
		}
	}
	public static void main(String[] arg){
		
		for(int i=0;i<8;i++)
			adj.add(new ArrayList<>());
		
		adj.get(1).add(2);
		adj.get(1).add(3);
		adj.get(2).add(4);
		adj.get(2).add(1);
		adj.get(4).add(2);
		adj.get(4).add(6);
		adj.get(6).add(4);
		adj.get(6).add(5);
		adj.get(5).add(7);
		adj.get(5).add(3);
		adj.get(3).add(5);
		adj.get(3).add(1);
		boolean[] vis=new boolean[5];
		dfs(1,vis);
		System.out.println(ans);
	}
}