import java.util.*;
class parametter{
	static void print(int num,int i,int j,String ans){
		if(i == num && j == num){
			System.out.println(ans);
			return;
		}
		if(i > num || j>num)
			return;
		print(num,i+1,j,ans+"(");
		if(j < i)
			print(num,i,j+1,ans+")");
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		print(num,0,0,"");
	}
}