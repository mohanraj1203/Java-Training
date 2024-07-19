import java.util.*;
class foctorial{
	static void fac(int num,int result){
		if(num==0){
			System.out.println(result);
			return;
		}
		result*=num;
		fac(num-1,result);
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		fac(num,1);
	}
}