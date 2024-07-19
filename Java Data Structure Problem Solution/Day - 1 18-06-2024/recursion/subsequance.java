import java.util.*;
class subsequance{
	static void display_subsequance(String str,String ans){
		if(str.length() == 0){
			System.out.println(ans);
			return;
		}
		char x=str.charAt(0);
		display_subsequance(str.substring(1),ans+x);
		display_subsequance(str.substring(1),ans);
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String str=obj.next();
		display_subsequance(str,"");
	}
}