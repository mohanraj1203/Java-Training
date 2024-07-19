import java.util.*;
class Bouble_Sort_rec{
	static int[] arr;
	static void bouble_sort(int index,int count){
		if(arr.length - index == count)
			return;
		
		if(arr[count] > arr[count+1]){
			int temp = arr[count];
			arr[count]=arr[count+1];
			arr[count+1]=temp;
		}
		
		bouble_sort(index,++count);
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str=obj.nextLine().split(" ");
		arr=new int[str.length];
		for(int i=0;i<str.length;i++)
			arr[i]=Integer.parseInt(str[i]);
		
		for(int i=1;i<=arr.length;i++)
			bouble_sort(i,0);
				
		for(int i:arr)
			System.out.print(i+" ");
	}
}