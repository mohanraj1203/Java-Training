import java.util.*;
class deletemidinstack{
	static Stack<Integer> stack=new Stack<>();
	static void deletemid(int size,int current){
		if(size/2 == current){
			stack.pop();
			return;
		}
		int temp=stack.pop();
		deletemid(size,current+1);
		stack.push(temp);
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		int size=obj.nextInt();
		for(int i=0;i<size;i++)
			stack.push(obj.nextInt());
		System.out.println("Before : "+stack);
		deletemid(stack.size(),0);
		System.out.println("After : "+stack);
	}
}