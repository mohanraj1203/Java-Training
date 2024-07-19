import java.util.*;
class valid_parathesis{
	static ArrayList<String> result=new ArrayList<>();
	
	static void calculate(int limit,int open,int close,String ans){
		if(open == limit && close == limit){
			result.add(ans);
			return;
		}
		
		if(open > limit || close > limit)
			return;
		
		calculate(limit,open+1,close,ans+"(");
		if(close < open)
			calculate(limit,open,close+1,ans+")");
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		calculate(num,0,0,"");
		for(String i:result)
			System.out.println(i);
	}
}