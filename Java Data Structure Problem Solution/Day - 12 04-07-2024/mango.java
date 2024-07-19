import java.util.*;
class mango{
	static Queue<pair> queue=new LinkedList<>();
	static int time=0;
	static int n;
	static int m;
	public static int check(int[][] box){
		while(!queue.isEmpty()){
			int size=queue.size();
			for(int i=0;i<size;i++){
				pair node=queue.poll();
				
				if(node.col + 1 < n){
					if(box[node.row][node.col+1] == 1){
						box[node.row][node.col+1]=2;
						queue.add(new pair(node.row,node.col+1,node.tm+1));
					}
				}
				if(node.col - 1 > -1){
					if(box[node.row ][node.col-1] == 1){
						box[node.row][node.col-1]=2;
						queue.add(new pair(node.row,node.col-1,node.tm+1));
					}
				}
				if(node.row + 1 < m){
					if(box[node.row+1][node.col] == 1){
						box[node.row+1][node.col ]=2;
						queue.add(new pair(node.row+1,node.col,node.tm+1));
					}
				}
				
				if(node.row - 1 > -1){
					if(box[node.row-1][node.col] == 1){
						box[node.row-1][node.col]=2;
						queue.add(new pair(node.row-1,node.col,node.tm+1));
					}
				}
				time=node.tm;
			}
		}
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				if(box[i][j] == 1)
					return -1;
		return time;
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		m=obj.nextInt();
		int[][] box=new int[n][m];
		int[][] box_temp=new int[n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				box[i][j]=obj.nextInt();
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++){
				if(box[i][j] == 2)
					queue.add(new pair(i,j,0));
				box_temp[i][j]=box[i][j];
			}
		System.out.println(check(box_temp));
	}
}
class pair{
	int row;
	int col;
	int tm;
	public pair(int row,int col,int tm){
		this.row=row;
		this.col=col;
		this.tm=tm;
	}
}