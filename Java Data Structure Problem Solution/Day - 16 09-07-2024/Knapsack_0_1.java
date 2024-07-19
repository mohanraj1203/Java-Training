import java.util.*;
class Knapsack_0_1 {
	static int max=0;
	public static void calculate(int[] arr1,int[] arr2,int sum,int index,int wt){
		if(wt == 0)
			max=Math.max(max,sum);
		
		if(wt < 0)
			return;

		if(index >= arr1.length)
			return;
		
		calculate(arr1,arr2,sum+arr1[index],index+1,wt-arr2[index]);
		calculate(arr1,arr2,sum,index+1,wt);
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str1=obj.nextLine().split(" ");
		String[] str2=obj.nextLine().split(" ");
		
		int[] arr1=new int[str1.length];
		int[] arr2=new int[str2.length];
		
		for(int i=0;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(str1[i]);
			arr2[i]=Integer.parseInt(str2[i]);
		}
		
		int wt=obj.nextInt();
		calculate(arr1,arr2,0,0,wt);
		
		System.out.println(max);
	}
}