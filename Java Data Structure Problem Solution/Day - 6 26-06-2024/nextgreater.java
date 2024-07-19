import java.util.*;
class nextgreater{
	static void findgreater(int[] arr){
		for(int i=0;i<arr.length;i++){
			int temp=arr[i];
			int k=0;
			for(int j=i+1;j<arr.length;j++)
				if(temp<arr[j]){
					k++;
					temp=arr[j];
					break;
				}
			if(k!=0)
				arr[i]=temp;
			else
				arr[i]=-1;
		}
		for(int i:arr)
			System.out.print(i+" ");
	}
	
	public static void main(String[] arg){
		Stack<Integer> stack=new Stack<>();
		Scanner obj=new Scanner(System.in);
		int size=obj.nextInt();
		int[] arr1=new int[size];
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=obj.nextInt();
		/*stack.push(arr[size-1]);
		arr1[size-1]=-1;
		for(int i=size-2;i>-1;i--){
			while(!stack.isEmpty()){
				if(arr[i] < stack.peek()){
					break;
				}
				stack.pop();
			}
			if(stack.isEmpty())
				arr1[i]=-1;
			else
				arr1[i]=stack.pop();
			stack.push(arr[i]);
		}*/
		for(int i=0;i<size;i++){
			Stack<Integer> stack1=new Stack<>();
			for(int j=size-1;j>=i;j--)
				stack1.push(arr[j]);
			int temp=stack1.pop();
			while(!stack1.isEmpty()){
				if(temp > stack1.peek())
					break;
				stack1.pop();
			}
			if(stack1.isEmpty())
				arr1[i]=-1;
			else
				arr1[i]=stack1.peek();
		}
		
		//findgreater(arr);
		for(int i:arr1)
			System.out.print(i+" ");
	}
}