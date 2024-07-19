import java.util.*;
class sum_of_number{
	static void printv(int num,int sum){
		sum+=num;
		if(num==0){
			System.out.println(sum);
			return;
		}
		printv(num-1,sum);
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		printv(num,0);
	}
}