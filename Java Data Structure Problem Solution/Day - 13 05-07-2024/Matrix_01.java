import java.util.*;
class Matrix_01{
	static Queue<pair> queue=new LinkedList<>();
	static int min=1000;
	static int n;
	static int m;
	static int[][] box;
	static int[][] box_temp;
	static int calculate(){
		boolean[][] check=new boolean[n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				System.out.print(check[i][j]+" ");
		while(!queue.isEmpty()){
			int size=queue.size();
			for(int i=0;i<size;i++){
				pair node=queue.poll();
				System.out.println(node.col+" "+node.row+" "+node.tm);
				if(node.col + 1 < n){
					if(box[node.row][node.col+1] == 1 ){
						if(check[node.row][node.col+1] == false){
							check[node.row][node.col+1]=true;
							queue.add(new pair(node.row,node.col+1,node.tm+1));
						}
					}
					else
						return node.tm;
				}
				if(node.col - 1 > -1){
					if(box[node.row ][node.col-1] == 1){
						if(check[node.row][node.col-1] == false){
							check[node.row][node.col-1]=true;
							queue.add(new pair(node.row,node.col-1,node.tm+1));
						}
					}
					else
						return node.tm;
				}
				if(node.row + 1 < m){
					if(box[node.row+1][node.col] == 1){
						if(check[node.row + 1][node.col] == false){
							check[node.row+1][node.col]=true;
							queue.add(new pair(node.row+1,node.col,node.tm+1));
						}
					}
					else
						return node.tm;
				}
				
				if(node.row - 1 > -1){
					if(box[node.row-1][node.col] == 1){
						if(check[node.row-1][node.col] == false){
							check[node.row-1][node.col] = true;
							queue.add(new pair(node.row-1,node.col,node.tm+1));
						}
					}
					else
						return node.tm;
				}
				
				//min=node.tm;
			}
		}
		System.out.println("+++++");
		return min;
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		m=obj.nextInt();
		box=new int[n][m];
		box_temp=new int[n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				box[i][j]=obj.nextInt();
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				box_temp[i][j]=box[i][j];
		
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++){
				
				//System.out.println(box_temp[i][j]);
				if(box[i][j] == 1){
					queue.add(new pair(i,j,1));
					box_temp[i][j]=calculate();
					
					System.out.println("****"+box_temp[i][j]);
				}
			}   
				
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++)
				System.out.print(box_temp[i][j]+" ");
			System.out.println();
		}
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