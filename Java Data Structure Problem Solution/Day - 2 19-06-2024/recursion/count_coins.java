import java.util.*;
class count_coins{
	static void count(int i,int target,String result){
		if(i == target){
			System.out.println(result);
			return;
		}
		if(i > target){
			return;
		}
		count(i+1,target,result+1);
		count(i+2,target,result+2);
		count(i+3,target,result+3);
	}
	public static void main(String[] arg){
		count(0,5,"");
	}
}