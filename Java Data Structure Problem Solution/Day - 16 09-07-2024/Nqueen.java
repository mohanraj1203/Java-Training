import java.util.*;
class Nqueen{
	static int count=0;
	static List<List<String>> result=new ArrayList<>();
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		boolean[][] board=new boolean[4][4];
		Nqueen2(board,0,"");
		System.out.println("total ways : "+count);
		System.out.println(result);
	}
	public static void Nqueen2(boolean[][] board,int row,String ans){
		if(row == board.length){
			System.out.println(ans);
			count++;
			display(board);
			return;
		}
		for(int col=0;col<board[0].length;col++){
			if(isItSafe(board,row,col)){
				board[row][col]=true;
				Nqueen2(board,row+1,ans+"["+row+"-"+col+"]");
				board[row][col]=false;
			}
			
		}
	}
	static void display(boolean[][] board){
		List<String> temp=new ArrayList<>();
		for(int i=0;i<board.length;i++){
			String temp1="";
			for(int j=0;j<board.length;j++){
				if(board[i][j] == true)
					temp1+="Q";
				else
					temp1+=".";
			}
			temp.add(temp1);
		}
		result.add(temp);
	}
	public static boolean isItSafe(boolean[][] board,int row,int col){
		int r=row-1;
		int c=col;
		while(r>=0){
			if(board[r][c])
				return false;
			r--;
		}
		r=row;
		c=col-1;
		
		while(c>=0){
			if(board[r][c])
				return false;
			c--;
		}
		r=row-1;
		c=col-1;
		while(r >=0 && c>=0){
			if(board[r][c])
				return false;
			r--;
			c--;
		}
		
		r=row-1;
		c=col+1;
		
		while(r >= 0 && c < board[0].length){
			if(board[r][c])
				return false;
			r--;
			c++;
		}
		return true;
	}
}