import java.util.*;
class reverseKelementInQueue{
	static Stack<Integer> stack=new Stack<>();
	static Queue<Integer> queue=new LinkedList<>();
	static void reverse(int k){
		int size=queue.size();
		for(int i=0;i<k;i++)
			stack.push(queue.poll());
		
		for(int i=0;i<k;i++)
			queue.add(stack.pop());
		
		for(int i=k;i<size;i++)
			queue.add(queue.poll());
	}
	
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str=obj.nextLine().split(" ");
		int[] arr=new int[str.length];
		for(int i=0;i<str.length;i++)
			arr[i]=Integer.parseInt(str[i]);
		int k=obj.nextInt();
		for(int i=0;i<arr.length;i++)
			queue.add(arr[i]);
		System.out.println("Queue Original : "+queue);
		reverse(k);
		System.out.println("Queue Modified : "+queue);
	}
}