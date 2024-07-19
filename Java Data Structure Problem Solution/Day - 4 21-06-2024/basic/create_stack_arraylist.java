import java.util.*;
class create_stack_arraylist{
	static ArrayList<Integer> stack=new ArrayList<>();
	
	static int pop(){
		return stack.remove(stack.size()-1);
	}
	
	static void push(int data){
		stack.add(data);
	}
	
	static void peek(){
		System.out.println(stack.get(stack.size()-1));
	}
	
	static boolean isEmpty(){
		if(stack.size() == 0)
			return true;
		return false;
	}
	
	static void rec(int data){
		if(isEmpty()){
			System.out.println(data);
			push(data);
			return;
		}
		int temp=pop();
		rec(data);	
		push(temp);
	}
	
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		int size=obj.nextInt();
		for(int i=0;i<size;i++){
			push(obj.nextInt());
		}
		int num=obj.nextInt();
		rec(num);
		for(int i:stack)
			System.out.println(i);
	}
}