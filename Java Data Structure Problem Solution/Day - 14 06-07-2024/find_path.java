import java.util.*;
class find_path{
	static int path(int n,int i,int j,int[][] arr){
		if(i == n && j==n)
			return 1;
		
		if(i > n || j > n)
			return 0;
		
		if(arr[i][j] !=0 )
			return arr[i][j];
		
		arr[i][j] = path(n,i,j+1,arr) + path(n,i+1,j,arr);
		
		return arr[i][j];
	}
	public static void display(int n){
		int[][] arr=new int[n+1][n+1];
		for(int i=n;i>-1;i--){
			arr[n][i]=1;
			arr[i][n]=1;
		}
		
		for(int i=n-1;i>-1;i--)
			for(int j=n-1;j>-1;j--)	
				arr[i][j]=arr[i+1][j]+arr[i][j+1];
		
		for(int i=0;i<n+1;i++){
			for(int j=0;j<n+1;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
	public static void main(String[] arg)
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int[][] arr=new int[n+1][n+1];
		System.out.println(path(n,0,0,arr));
		for(int i=0;i<n+1;i++){
			for(int j=0;j<n+1;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		System.out.println("+++++++++++++++++++++++++");
		display(n);
	}
}