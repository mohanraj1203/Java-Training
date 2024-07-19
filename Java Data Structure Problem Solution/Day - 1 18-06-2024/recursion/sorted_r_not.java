import java.util.*;
class sorted_r_not{
	static int i=0;
	static int j=1;
	static boolean check(int[] arr){
		if(j==arr.length)
			return true;
		if(arr[i++]>arr[j++])
			return false;
		return check(arr);
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		int size=obj.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=obj.nextInt();
		System.out.println(check(arr));
	}
}