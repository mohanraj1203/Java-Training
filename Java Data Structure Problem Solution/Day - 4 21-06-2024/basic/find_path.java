import java.util.*;
class find_path{
	
	static ArrayList<String> result=new ArrayList<>();
	
	static void path(int n,int i,int j,String str){
		if(i == n && j==n){
			result.add(str);
			return;
		}
		if(i > n || j > n){
			return;
		}
		path(n,i,j+1,str+"H");
		path(n,i+1,j,str+"V");
		path(n,i+1,j+1,str+"D");
	}
	public static void main(String[] arg)
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		path(n,0,0,"");
		//for(int i=0;i<result.size();i++)
			System.out.println(result);
	}
}