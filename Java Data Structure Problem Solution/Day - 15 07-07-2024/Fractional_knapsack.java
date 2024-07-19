import java.util.*;
class Fractional_knapsack{
	static int wieght(int wt,int arr2,int ratio){
		
		if(wt >= arr2)
			return arr2*ratio;
		return wt*ratio;
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
		
		int[] ratio=new int[arr1.length];
		
		int wt=obj.nextInt();
		for(int i=0;i<arr1.length;i++)
			ratio[i]=arr1[i] / arr2[i];
		
		int total_amount=0;
		for(int i=0;i<arr1.length;i++){
			int max=0;
			int k=i;
			for(int j=0;j<arr1.length;j++)
				if(max < ratio[j]){
					max=ratio[j];
					k=j;
				}
			total_amount+=wieght(wt,arr2[k],ratio[k]);
			ratio[k]=0;
			wt-=arr2[k];
		}
		System.out.println(total_amount);
	}
}