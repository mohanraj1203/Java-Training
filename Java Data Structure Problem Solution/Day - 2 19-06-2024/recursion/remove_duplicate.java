import java.util.*;
class remove_duplicate{
	static boolean index[]=new boolean[26];
	static void remove(String str){
		if(str.length() == 0)
			return;
		
		if(index[str.charAt(0) - 'a'] == false){
			index[str.charAt(0) - 'a']=true;
			System.out.print(str.charAt(0));
		}
		remove(str.substring(1));
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String str=obj.next();
		remove(str);
	}
}