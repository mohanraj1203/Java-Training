import java.util.*;
class print_increament{
	static void printInt(int num){
		if(num==1){
			System.out.println(num);
			return;
		}
		printInt(num-1);
		System.out.println(num);
	}
	public static void main(String[] arg)
	{
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		printInt(num);
	}
}