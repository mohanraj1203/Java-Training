import java.util.*;
class palindrome{
	static boolean Check(String str,int left,int right){
		if(left > right)
			return true;
		if(str.charAt(left) != str.charAt(right))
			return false;
		return Check(str,left+1,right-1);
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		while(true){
			String str=obj.next();
			System.out.println(Check(str,0,str.length()-1));
		}
	}
}