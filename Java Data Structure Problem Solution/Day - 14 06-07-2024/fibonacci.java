import java.util.*;
class fibonacci{
	public static int calculate(int num,int[] arr){
		
		if(num == 0){
			arr[num]=0;
			return 0;
		}
		
		if(num == 1){
			arr[num]=1;
			return 1;
		}
		
		if(arr[num] != 0)
			return arr[num];
		
		arr[num] = calculate(num-1,arr) + calculate(num-2,arr);
		
		return arr[num];
	}
	/*public static void display(int num){
		int[] arr=new int[num];
		for(int i=0;i<num;i++){
			if(i==0)
				arr[i]=0;*/
			
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int[] arr=new int[num+1];
		System.out.println(calculate(num,arr)+" "+arr[3]);
		for(int i:arr)
			System.out.print(i+" ");
	}
}