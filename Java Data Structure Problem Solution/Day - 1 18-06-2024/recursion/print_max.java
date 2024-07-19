import java.util.*;
class print_max{
	static int max=0;
	static int i=0;
	static void check(int[] arr)
	{
		if(arr.length==i){
			System.out.println(max);
			return;
		}
		if(arr[i]>max)
			max=arr[i];
		i++;
		check(arr);
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		int size=obj.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=obj.nextInt();
		check(arr);
	}
}