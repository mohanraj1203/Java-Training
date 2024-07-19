import java.util.*;
class print_num{
	static String[] word={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	static int i=0;
	static void print(String str)
	{
		if(i >= str.length())
			return;
		System.out.print(word[str.charAt(i++)-'0']+" ");
		print(str);
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		String str=Integer.toString(num);
		print(str);
	}
}