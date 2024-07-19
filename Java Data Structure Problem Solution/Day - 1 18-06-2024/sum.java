import java.util.*;
class sum{
	public static void main(String[] arg)
	{
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int result=0;
		for(int i=1;i<=num;i++)
			result+=i;
		System.out.println(result);
	}
}