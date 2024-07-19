import java.util.*;
class cutting_rote{
	public static int calculate(int[] arr1,int[] arr2,int i,int j){
		
		if(i > j)
			return 0;
		
		if(j == 1)
			return 1;
		
		int sum = calculate(arr1,arr2,i,j-1);
		int max=arr2[i];
		calculate(arr1,arr2,i+1,j+1);
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str1=obj.nextLine().split(" ");
		String[] str2=obj.nextLine().split(" ");
		int[] arr1=new int[str1.length];
		int[] arr2=new int[str2.length];
		
		for(int i=0;i<str1.length;i++)
			arr1[i]=Integer.parseInt(str1[i]);
		
		for(int i=0;i<str2.length;i++)
			arr2[i]=Integer.parseInt(str2[i]);
		
		int total=obj.nextInt();
		
		System.out.println(calculate(arr1,arr2,0,total));
	}
}