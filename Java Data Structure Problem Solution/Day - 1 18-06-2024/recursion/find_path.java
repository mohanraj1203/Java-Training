import java.util.*;
class find_path{
	static int path(int n,int i,int j,String str){
		if(i == n && j==n){
			//System.out.println(str);
			return 1;
		}
		if(i > n || j > n){
			System.out.println(i+" "+j);
			return 0;
		}
		int ch=path(n,i,j+1,str+"H");
		int ch1=path(n,i+1,j,str+"V");
		return ch+ch1;
	}
	public static void main(String[] arg)
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		System.out.println(path(n,0,0,""));
	}
}