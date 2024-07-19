import java.util.*;
class pattern{
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int k=0;
		for(int i=0;i<num;i++){
			for(int j=0;j<=i;j++){
				System.out.print(++k +" ");
			}
			System.out.println();
		}
	}
}