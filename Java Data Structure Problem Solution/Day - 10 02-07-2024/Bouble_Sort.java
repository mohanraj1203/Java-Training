import java.util.*;
class Bouble_Sort{
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str=obj.nextLine().split(" ");
		int[] arr=new int[str.length];
		for(int i=0;i<str.length;i++)
			arr[i]=Integer.parseInt(str[i]);
		
		for(int i=1;i<=arr.length;i++)
			for(int j=0;j<arr.length-i;j++)
				if(arr[j] > arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
		for(int i:arr)
			System.out.print(i+" ");
	}
}