import java.util.*;
class Binarysearch_rec
	static int target;
	static int[] arr;
	static boolean result;
	static boolean binary(int start,int end){
		int mid = (start + end)/2;
		if(arr[mid] == target)
			return true;
		if(start > end)
			return false;
		
		if(arr[mid] > target)
			result = binary(start,mid-1);
		else
			result = binary(mid+1,end);
		
		return result;
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str=obj.nextLine().split(" ");
		arr=new int[str.length];
		target=obj.nextInt();
		for(int i=0;i<str.length;i++)
			arr[i]=Integer.parseInt(str[i]);
		System.out.println(binary(0,arr.length));
	}
}
