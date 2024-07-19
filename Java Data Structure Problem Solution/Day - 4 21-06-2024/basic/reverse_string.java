import java.util.*;
class reverse_string{
	static void display(String str){
		Stack<Character> result=new Stack<>();
		for(int i=0;i<str.length();i++)
			result.push(str.charAt(i));
		while(!result.isEmpty()){
			System.out.print(result.peek());
			result.pop();
		}
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String str=obj.next();
		display(str);
	}
}