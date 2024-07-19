import java.util.*;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
class detect{
	static boolean check(Node head){
		Node temp1=head;
		Node temp2=head.next;
		while(temp2!=null){
			if(temp1 == temp2)
				return true;
			temp1=temp1.next;
			if(temp2.next==null)
				return false;
			temp2=temp2.next.next;
		}
		return false;
	}
	public static void main(String[] arg){
		Node head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node four=new Node(4);
		Node five=new Node(5);
		
		head.next=second;
		second.next=third;
		third.next=four;
		four.next=five;
		five.next=second;
		System.out.println(check(head));
	}
}
	