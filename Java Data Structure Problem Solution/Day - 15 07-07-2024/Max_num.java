import java.util.*;
class Max_num{
	static int max_occurent(int[] arr1,int[] arr2){
		int count=1;
		int end=arr2[0];
		for(int i=1;i<arr2.length;i++)
			if(end < arr1[i]){
				System.out.println(arr1[i]+" "+arr2[i]);
				end=arr2[i];
				count++;
			}
		return count;
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str1=obj.nextLine().split(" ");
		String[] str2=obj.nextLine().split(" ");
		int[] arr1=new int[str1.length];
		int[] arr2=new int[str2.length];
		for(int i=0;i<str1.length;i++)
			arr1[i]=Integer.parseInt(str1[i]);
		for(int i=0;i<str2.length;i++)
			arr2[i]=Integer.parseInt(str2[i]);
		
		System.out.println(max_occurent(arr1,arr2));
	}
}