
/*Given the root of a binary tree, return the sum of all left leaves.

A leaf is a node with no children. A left leaf is a leaf that is the left child of another node. */


import java.util.*;
class question_404{
	
	static int sum=0;
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
	
    public static void sumOfLeftLeaves(Node root) {
        if(root == null)
            return;
        if(root.left != null){
            if(root.left.left == null && root.left.right == null){
                sum+=root.left.data;
            }
        }
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);

    }
	
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str=obj.nextLine().split(" ");
		int[] arr=new int[str.length];
		for(int i=0;i<str.length;i++)
			arr[i]=Integer.parseInt(str[i]);
		Node root=binarytree(arr);
		
		sumOfLeftLeaves(root);
		
		System.out.println(sum);
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
input : 3 9 -1 -1 20 15 -1 -1 7 -1 -1

output : 24

input : 1 2 4 7 -1 -1 -1 5 -1 -1 3 -1 6 -1 8 -1 -1

output : 7*/