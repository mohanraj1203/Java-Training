import java.util.*;
class reversearray{
	static Queue<Integer> queue=new LinkedList<>();
	static Stack<Integer> stack=new Stack<>();
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		int size=obj.nextInt();
		for(int i=0;i<size;i++)
			queue.add(obj.nextInt());
		for(int i=0;i<size;i++)
			stack.push(queue.remove());
		for(int i=0;i<size;i++)
			queue.add(stack.pop());
		System.out.println(queue);
	}
}