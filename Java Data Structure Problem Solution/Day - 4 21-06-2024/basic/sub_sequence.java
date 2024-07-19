import java.util.*;
class sub_sequence{
	static ArrayList<String> result=new ArrayList<>();
	
	static void display(String str,String ans){
		if(str.length() == 0){
			result.add(ans);
			return;
		}
		display(str.substring(1),ans+str.charAt(0));
		display(str.substring(1),ans);
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String str=obj.next();
		display(str,"");
		for(String i:result)
			System.out.println(i);
	}
}