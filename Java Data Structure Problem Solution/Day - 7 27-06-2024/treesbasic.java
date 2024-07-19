import java.util.*;
class treesbasic{
	
	static int index=-1;
	public static Node binarytree(int[] arr){
		index++;
		if(arr[index] == -1)
			return null;
		
		Node newNode=new Node(arr[index]);
		newNode.left=binarytree(arr);
		newNode.right=binarytree(arr);
		
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
	
	static void postorder(Node root){
		if(root == null)
			return;
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	
	static void levelorder(Node root){
		Queue<Node> queue=new LinkedList<>();
		Node temp=root;
		while(temp != null){
			
			if(temp.left != null){
				queue.add(temp.left);
			}
			
			if(temp.right != null){
				queue.add(temp.right);
			}
			
			
			System.out.print(temp.data+" ");
			temp=queue.poll();
		}
	}
	
	static void revlevelorder(Node root){
		boolean lefttoright=true;
		List<List<Integer>> ans=new ArrayList<>();
		if(root == null){
			System.out.println("Null");
		}
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			int size=queue.size();
			List<Integer> level=new ArrayList<>();
			for(int i=0;i<size;i++){
				Node node=queue.poll();
				level.add(node.data);
				if(node.left != null)
					queue.add(node.left);
				if(node.right != null)
					queue.add(node.right);
			}
			if(!lefttoright)
				Collections.reverse(level);
			ans.add(level);
			lefttoright=!lefttoright;
		}
		for(List<Integer> i:ans){
			for(int j=0;j<i.size();j++)
				System.out.print(i.get(j)+" ");
		}
	}
	
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str=obj.nextLine().split(" ");
		int[] arr=new int[str.length];
		for(int i=0;i<str.length;i++)
			arr[i]=Integer.parseInt(str[i]);
		Node root=binarytree(arr);
		System.out.println("Pre-order : ");
		preorder(root);
		System.out.println("\nIn-order : ");
		inorder(root);
		System.out.println("\nPost-order : ");
		postorder(root);
		System.out.println("\nLevel-order : ");
		levelorder(root);
		System.out.println("\nReverse Level-order : ");
		revlevelorder(root);
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