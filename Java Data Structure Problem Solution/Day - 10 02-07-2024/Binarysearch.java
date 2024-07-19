import java.util.*;
class Binarysearch{
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str=obj.nextLine().split(" ");
		int[] arr=new int[str.length];
		int target=obj.nextInt();
		for(int i=0;i<str.length;i++)
			arr[i]=Integer.parseInt(str[i]);
		
		int start = 0;
		int end = arr.length;
		int ans=-1;
		while(start < end){
			int mid = (start + end)/2;
			
			if(target == arr[mid]){
				ans=mid;
				end = mid - 1;
			}
			else if(target > arr[mid])
				start = mid +1;
			else
				end = mid - 1;
		}
		System.out.println(ans);
	}
}