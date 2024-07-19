
/*Given the root of a binary tree, return the sum of values of its deepest leaves.*/


import java.util.*;
class question_1302{
	
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
	
	public static int deepestLeavesSum(Node root) {
        int sum=0;
        if(root == null)
            return 0;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            int temp=0;
            for(int i=0;i<size;i++){
                Node node=queue.poll();
                temp+=node.data;
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            sum=temp;
        }
        return sum;
    }
	
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str=obj.nextLine().split(" ");
		int[] arr=new int[str.length];
		for(int i=0;i<str.length;i++)
			arr[i]=Integer.parseInt(str[i]);
		Node root=binarytree(arr);
		
		System.out.println(deepestLeavesSum(root));
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

/*

input : 1 2 4 7 -1 -1 -1 5 -1 -1 3 -1 6 -1 8 -1 -1

output : 15

input : 6 7 2 9 -1 -1 -1 7 1 -1 -1 4 -1 -1 8 1 -1 -1 3 -1 5 -1 -1

output : 19*/