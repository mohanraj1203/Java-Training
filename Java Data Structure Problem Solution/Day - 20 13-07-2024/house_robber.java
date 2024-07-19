import java.util.*;
class house_robber{
	static int calculate(int[] arr,int index,int sum){
		if(arr.length <= index)
			return sum;
		
		int take=calculate(arr,index+2,sum+arr[index]);
		int not_take=calculate(arr,index+1,sum);
		
		return Math.max(take,not_take);
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str=obj.nextLine().split(",");
		int[] arr=new int[str.length];
		for(int i=0;i<arr.length;i++)
			arr[i]=Integer.parseInt(str[i]);
		System.out.println(calculate(arr,0,0));
	}
}