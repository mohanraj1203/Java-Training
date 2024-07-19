import java.util.*;
class evaluatestring{
	static Stack<Integer> stack=new Stack<>();
	static int validate(String[] str){
		for(int i=0;i<str.length;i++){
			if(Character.isDigit(str[i].charAt(0)))
				stack.push(Integer.parseInt(str[i]));
			else{
				int num1=stack.pop();
				int num2=stack.pop();
				char ch=str[i].charAt(0);
				int result=0;
				
				if(ch == '+')
					result = num1+num2;
				else if(ch == '-')
					result = num1-num2;
				else if(ch == '*')
					result = num1*num2;
				else
					result = num1/num2;
				stack.push(result);
			}
		}
		return stack.peek();
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str=obj.nextLine().split(" ");
		System.out.println(validate(str));
	}
}