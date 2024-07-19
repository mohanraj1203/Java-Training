import java.util.*;
class Linear_search_rec{
	static int target;
	static int[] arr;
	static boolean check(int index){
		if(index >= arr.length)
			return false;
		if(arr[index] == target)
			return true;
		
		return check(++index);
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str=obj.nextLine().split(" ");
		arr=new int[str.length];
		target=obj.nextInt();
		for(int i=0;i<str.length;i++)
			arr[i]=Integer.parseInt(str[i]);
		
		System.out.println(check(0));
	}
}