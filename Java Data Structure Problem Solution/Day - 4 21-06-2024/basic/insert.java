import java.util.*;
class insert{
	static Stack<Integer> result=new Stack<>();
	static Stack<Integer> temp=new Stack<>();
	static void operation(int num){
		while(!result.isEmpty())
			temp.push(result.pop());
		result.push(num);
		while(!temp.isEmpty())
			result.push(temp.pop());
	}
	static void rec(int data){
		if(result.isEmpty()){
			System.out.println(data);
			result.push(data);
			return;
		}
		int temp=result.pop();
		rec(data);	
		result.push(temp);
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		int size=obj.nextInt();
		for(int i=0;i<size;i++){
			//int x=obj.nextInt();
			result.push(obj.nextInt());
		}
		int num=obj.nextInt();
		//operation(num);
		rec(num);
		while(!result.isEmpty())
			System.out.println(result.pop());
	}
}