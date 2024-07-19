import java.util.*;
class recurssionlinkedlist{
	
	static int index=-1;
	static Node head;
	static Node tail;
	public static Node addfisrt(int[] arr){
		index++;
		if(arr[index] == -1)
			return null;
		
		Node newNode=new Node(arr[index]);
		tail=newNode;
		newNode.next=addfisrt(arr);
	return newNode;
	}
	static void display(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str=obj.nextLine().split(" ");
		int[] arr=new int[str.length];
		for(int i=0;i<str.length;i++)
			arr[i]=Integer.parseInt(str[i]);
		head=addfisrt(arr);
		display();
		System.out.println(tail.data);
	}
}
class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}