import java.util.*;
class merge_two_array{
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str1=obj.nextLine().split(" ");
		String[] str2=obj.nextLine().split(" ");
		int[] arr1=new int[str1.length];
		int[] arr2=new int[str2.length];
		for(int i=0;i<arr1.length;i++)
			arr1[i]=Integer.parseInt(str1[i]);
		for(int i=0;i<arr2.length;i++)
			arr2[i]=Integer.parseInt(str2[i]);
		ArrayList<Integer> result=new ArrayList<>();
		int i=0,j=0;
		while(i < arr1.length && j < arr2.length){
			if(arr1[i] < arr2[j])
				result.add(arr1[i++]);
			else
				result.add(arr2[j++]);
		}
		while(i < arr1.length)
			result.add(arr1[i++]);
		while(j < arr2.length)
			result.add(arr2[j++]);
		System.out.println(result);
		
	}
}