import java.util.*;
class merge_sort{
	public static int[] merge(int[] arr,int start,int end){
		
		if(start == end){
			int[] br=new int[1];
			br[0]=arr[start];
			return br;
		}
		
		int mid=(start+end)/2;
		
		int[] sh = merge(arr,start,mid);
		int[] fh = merge(arr,mid+1,end);
		
		
		
		return merge_two_arr(sh,fh);
		
	}
	public static int[] merge_two_arr(int[] arr1,int[] arr2){
		
		ArrayList<Integer> result = new ArrayList<>();
		
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
		
		int[] arr=new int[result.size()];
		
		for(i=0;i<result.size();i++)
			arr[i]=result.get(i);
		return arr;
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str=obj.nextLine().split(" ");
		int[] arr=new int[str.length];
		for(int i=0;i<str.length;i++)
			arr[i]=Integer.parseInt(str[i]);
		System.out.println(arr.length);
		int[] result=merge(arr,0,arr.length-1);
		for(int i=0;i<result.length;i++)
			System.out.print(result[i]+" ");
	}
}