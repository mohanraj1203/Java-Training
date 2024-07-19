import java.util.*;
class rainwater{
    static int n;
    static int m;
    static int count = 0;
    static boolean[][] check;
    static Queue<pair> queue = new LinkedList<>();
	static List<List<Integer>> result=new ArrayList<>();
    static boolean find(int[][] board) {
        int[] drow = { -1, 0, 1, 0 };
        int[] dcol = { 0, 1, 0, -1 };
		boolean[][] temp=new boolean[n][m];
        while (!queue.isEmpty()) {
            int r = queue.peek().row;
            int c = queue.peek().col;
            queue.poll();
			temp[r][c]=true;
            for (int i = 0; i < 4; i++) {
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if (nrow > -1 && ncol > -1 && nrow < n && ncol < m)
                    if (temp[nrow][ncol] == false && board[nrow][ncol] <= board[r][c]) {
                        queue.add(new pair(nrow, ncol));
                        temp[nrow][ncol] = true;
                    }
            }
        }
		if(display(temp))
			return true;
		return false;
    }
	static boolean display(boolean[][] arr){
		int k1=0,k2=0;
		for(int i=0;i<n;i++)
			if(arr[i][0]==true){
				k1++;
				break;
			}
		for(int i=0;i<m;i++)
			if(arr[0][i]==true){
				k1++;
				break;
			}
		for(int i=0;i<m;i++)
			if(arr[n-1][i]==true){
				k2++;
				break;
			}
		
		for(int i=0;i<n;i++)
			if(arr[i][m-1]==true){
				k2++;
				break;
			}
		if(k1 != 0 && k2 != 0)
			return true;
		
		return false;
	}
    public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		m=obj.nextInt();
		int[][] board=new int[n][m];
		check=new boolean[n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				board[i][j]=obj.nextInt();
			
		for(int i=0;i<n;i++){
			
			for(int j=0;j<m;j++){
				queue.add(new pair(i,j));
				if(find(board)){
					ArrayList<Integer> temp=new ArrayList<>();
					check[i][j]=true;
					temp.add(i);
					temp.add(j);
					result.add(temp);
				}
			}
		}
		for(List<Integer> i:result)
			System.out.println(i);
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++)
				System.out.print(check[i][j]+" ");
			System.out.println();
		}
	}
}

class pair {
    int row;
    int col;

    public pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}