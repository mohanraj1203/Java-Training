import java.util.*;
class longest_common_subsequence{
	static int max=0;
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String str1=obj.nextLine();
		String str2=obj.nextLine();
		
		for(int i=0;i<str1.length();i++){
			String temp="";
			int x=0;
			for(int j=0;j<str1.length();j++){
				while(x < str2.length()){
					if(str1.charAt(i) == str2.charAt(x)){
						temp+=str1.charAt(i);
						break;
					}
					x++;
				}
			}
			max=Math.max(max,temp.length());
		}
		System.out.println(max);
	}
}