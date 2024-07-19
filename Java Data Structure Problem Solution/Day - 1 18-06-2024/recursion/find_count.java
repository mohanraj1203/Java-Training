import java.util.*;
class find_count{
	static int i=0;
	static int count(int[] arr,int target){
		if(arr.length == i)
			return 0;
		int x=0;
		if(arr[i++] == target)
			 x=1;
		return x + count(arr,target);
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		int size=obj.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=obj.nextInt();
		int target=obj.nextInt();
		System.out.println(count(arr,target));
	}
}