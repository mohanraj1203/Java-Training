import java.util.*;
class find_target_elements{
	static void display(int[] arr,int target,int index,int sum,String ans){
		if(sum == target){
			System.out.println(ans);
			return;
		}
		
		if(index == arr.length)
			return;
		
		if(target < sum)
			return;
		
		display(arr,target,index+1,sum+arr[index],ans+arr[index]+" ");
		display(arr,target,index+1,sum,ans);
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		int size=obj.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=obj.nextInt();
		int target=obj.nextInt();
		display(arr,target,0,0,"");
	}
}