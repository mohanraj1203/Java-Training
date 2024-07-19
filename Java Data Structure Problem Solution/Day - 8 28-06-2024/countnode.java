import java.util.*;
class countnode{
	static int index=-1;
	static Node addtree(int[] arr){
		index++;
		if(arr[index] == -1)
			return null;
		Node newNode=new Node(arr[index]);
		newNode.left=addtree(arr);
		newNode.right=addtree(arr);
		
		return newNode;
	}
	static int sum=0;
	static void findsum(Node root){
		if(root == null)
			return;
		
		sum+=root.data;
		findsum(root.left);
		findsum(root.right);
	}
	
	static int count_leef=0;
	static int sum_leef=0;
	static void findleef(Node root){
		if(root == null)
			return;
		if(root.right == null && root.left == null){
			sum_leef+=root.data;
			count_leef++;
			return;
		}
		findleef(root.left);
		findleef(root.right);
	}
	
	static int size=0;
	static void findsize(Node root){
		if(root == null){
			return;
		}
		size++;
		findsize(root.left);
		findsize(root.right);
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str=obj.nextLine().split(" ");
		int[] arr=new int[str.length];
		for(int i=0;i<arr.length;i++)
			arr[i]=Integer.parseInt(str[i]);
		Node root=addtree(arr);
		findsize(root);
		System.out.println("Count : " +size);
		findsum(root);
		System.out.println("Sum : " +sum);
		findleef(root);
		System.out.println("Count leef : " +count_leef);
		System.out.println("Sum leef : " +sum_leef);
	}
}
class Node{
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}