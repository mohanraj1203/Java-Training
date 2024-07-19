import java.util.*;
class print_occurent_index{
	static int i=0;
	static void count(int[] arr,int target){
		if(arr.length == i)
			return ;
		if(arr[i++] == target)
			 System.out.println(i-1);
		count(arr,target);
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		int size=obj.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=obj.nextInt();
		int target=obj.nextInt();
		count(arr,target);
	}
}