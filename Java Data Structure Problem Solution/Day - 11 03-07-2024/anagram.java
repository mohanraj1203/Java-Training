import java.util.*;
class anagram{
	static HashMap<Character, Integer> hp1 = new HashMap<>();
	static HashMap<Character, Integer> hp2 = new HashMap<>();
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String str1=obj.nextLine();
		String str2=obj.nextLine();
		
		for(int i=0;i<str1.length();i++){
			if(hp1.containsKey(str1.charAt(i))){
				int temp=hp1.get(str1.charAt(i));
				hp1.remove(str1.charAt(i));
				hp1.put(str1.charAt(i),++temp);
			}
			else
				hp1.put(str1.charAt(i),1);
		}
		for(int i=0;i<str2.length();i++){
			if(hp1.containsKey(str2.charAt(i))){
				if(hp1.get(str2.charAt(i)) == 1)
					hp1.remove(str2.charAt(i));
				else
					hp1.put(str2.charAt(i), hp1.get(str2.charAt(i))-1);
			}
		}
		if(hp1.size() == 0)
			System.out.println("True");
		else
			System.out.println("False");
	}
}
