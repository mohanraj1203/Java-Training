import java.util.*;
class posiable_Q{
	static boolean[] arr;
	static void find(int limit,int cal,int qp,String ans){
		
		if(qp == limit){
			System.out.println(ans);
			return;
		}
		
		if(cal == arr.length)
			return;
		
		if(arr[cal] == false){
			arr[cal]=true;
			find(limit,cal+1,qp+1,ans+"B"+cal);
			arr[cal]=false;
		}
		find(limit,cal+1,qp,ans);
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int size=obj.nextInt();
		arr=new boolean[size];
		find(num,0,0,"");
	}
}