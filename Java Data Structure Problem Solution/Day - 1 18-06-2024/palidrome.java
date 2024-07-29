import java.util.*;
class palidrome{
	static boolean check(String str){
		int i=0,j=str.length()-1;
		while(i<j)
			if(str.charAt(i++)!=str.charAt(j--))
				return false;
		return true;
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String str=obj.next();
		if(check(str))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
