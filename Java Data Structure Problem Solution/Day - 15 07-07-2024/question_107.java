/*Given the root of a binary tree, return the bottom-up level order traversal of its nodes' values. (i.e., from left to right, level by level from leaf to root).*/

import java.util.*;
class question_107{
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
	
	public static List<List<Integer>> levelOrderBottom(Node root) {
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
        if (root == null)
            return arr;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int x = q.size();
            List<Integer> arr1 = new ArrayList<Integer>();
            for (int i = 0; i < x; i++) {
                if (q.peek().left != null)
                    q.add(q.peek().left);
                if (q.peek().right != null)
                    q.add(q.peek().right);
                arr1.add(q.poll().data);
            }
            arr.add(arr1);
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = arr.size() - 1; i > -1; i--)
            result.add(arr.get(i));
        return result;
    }
	
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str=obj.nextLine().split(" ");
		int[] arr=new int[str.length];
		for(int i=0;i<str.length;i++)
			arr[i]=Integer.parseInt(str[i]);
		Node root=binarytree(arr);
		
		List<List<Integer>> result=levelOrderBottom(root);
		
		for(List<Integer> i:result)
			for(int j:i)
				System.out.print(j+" ");
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

/* input : 3 9 -1 -1 20 15 -1 -1 7 -1 -1

output : 15 7 9 20 3

input : 1 2 4 7 -1 -1 -1 5 -1 -1 3 -1 6 -1 8 -1 -1

output : 7 8 4 5 6 2 3 1 */