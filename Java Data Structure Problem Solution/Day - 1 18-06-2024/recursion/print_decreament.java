import java.util.*;
class print_decreament{
	static void printInt(int num){
		if(num==1){
			System.out.println(num);
			return;
		}
		System.out.println(num);
		printInt(num-1);
	}
	public static void main(String[] arg)
	{
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		printInt(num);
	}
}