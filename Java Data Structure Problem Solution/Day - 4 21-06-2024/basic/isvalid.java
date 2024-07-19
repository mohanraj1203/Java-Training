import java.util.*;
class isvalid{
	static Stack<Character> stack=new Stack<>();
	static boolean isvalidparameter(String str){
		
		int i=0;
		for(i=0;i<str.length();i++)
		{
			char temp=str.charAt(i);
			if(temp == '(' || temp == '[' || temp == '{')
				stack.push(temp);
			else if(!stack.isEmpty() && temp == ')' && stack.peek() == '('){
					stack.pop();
			}
			else if(!stack.isEmpty() && temp == ']' && stack.peek() == '['){
					stack.pop();
			}
			else if(!stack.isEmpty() && temp == '}' && stack.peek() == '{'){
					stack.pop();
			}
			else
				break;
		}
		if(i == str.length() && stack.isEmpty())
			return true;
		return false;
	}
	
	static boolean rec(String str,int i){
		
		if(i == str.length() && stack.isEmpty())
			return true;
		
		if(i >= str.length())
			return false;
		
		char temp=str.charAt(i);
		if(temp == '(' || temp == '[' || temp == '{')
			stack.push(temp);
		else if(!stack.isEmpty() && temp == ')' && stack.peek() == '('){
			stack.pop();
		}
		else if(!stack.isEmpty() && temp == ']' && stack.peek() == '['){
			stack.pop();
		}
		else if(!stack.isEmpty() && temp == '}' && stack.peek() == '{'){
			stack.pop();
		}
		else
			return false;
		
		return rec(str,++i);
	}		
	
	
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String str=obj.next();
		System.out.println(isvalidparameter(str));
		System.out.println("Recursive Result");
		System.out.println(rec(str,0));
	}
}