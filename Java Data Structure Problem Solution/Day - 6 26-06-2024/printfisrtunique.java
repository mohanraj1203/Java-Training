import java.util.*;
class printfisrtunique{
	static char find_fisrt(String str){
		int[] freq=new int[str.length()];
		for(int i=0;i<str.length();i++){
			int k=0;
				for(int j=i+1;j<str.length();j++)
					if(str.charAt(i) == str.charAt(j)){
						k=-1;
						freq[j]=-1;
					}
				if(k != -1)
					return str.charAt(i);
			}
		return '0';
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		
		String str=obj.next();
		System.out.println(find_fisrt(str));
	}
}