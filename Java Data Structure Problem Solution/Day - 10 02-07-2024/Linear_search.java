import java.util.*;
class Linear_search{
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str=obj.nextLine().split(" ");
		int[] arr=new int[str.length];
		int target=obj.nextInt();
		for(int i=0;i<str.length;i++)
			arr[i]=Integer.parseInt(str[i]);
		
		boolean result = false;
		for(int i=0;i<arr.length;i++)
			if(arr[i] == target){
				result = true;
				break;
			}
		System.out.println(result);
	}
}