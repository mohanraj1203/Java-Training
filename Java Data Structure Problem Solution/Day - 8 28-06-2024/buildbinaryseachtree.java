import java.util.*;
class buildbinaryseachtree{
	
	static int index=0;
	static int[] arr;
	public static Node binarytree(int start,int end){
		int mid=(start + end)/2;
		if(start-1 == end || start == end+1)
			return null;
		index++;
		Node newNode=new Node(arr[mid]);
		newNode.left=binarytree(start,mid-1);
		newNode.right=binarytree(mid+1,end);
		
		return newNode;
	}
	
	static void preorder(Node root){
		if(root == null)
			return;
		
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	static void inorder(Node root){
		if(root == null)
			return;
		  
		inorder(root.left);

		System.out.print(root.data+" ");
		
		inorder(root.right);
	}
	
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str=obj.nextLine().split(" ");
		arr=new int[str.length];
		for(int i=0;i<str.length;i++) 
			arr[i]=Integer.parseInt(str[i]);
		Node root=binarytree(0,arr.length-1);
		System.out.println("Pre-Order : ");
		preorder(root);
		System.out.println("\nIn-Order : ");
		inorder(root);
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