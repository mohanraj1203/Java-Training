import java.util.*;
class Selection_Sort{
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str=obj.nextLine().split(" ");
		int[] arr=new int[str.length];
		for(int i=0;i<str.length;i++)
			arr[i]=Integer.parseInt(str[i]);
		
		for(int i=0;i<arr.length;i++){
			int max=0;
			for(int j=1;j<arr.length-i;j++)
				if(arr[max] < arr[j])
					max=j;
			int temp = arr[max];
			arr[max] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		for(int i:arr)
			System.out.print(i+" ");
	}
}