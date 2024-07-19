import java.util.*;
class array_rev_display{
	static void display(int[] arr,int i){
		if(i==0){
			System.out.println(arr[i]);
			return;
		}
		System.out.println(arr[i]);
		display(arr,i-1);
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		int size=obj.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=obj.nextInt();
		display(arr,size-1);
	}
}