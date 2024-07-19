import java.util.*;
class Node{
	int data;
	Node next;
}
class polindrome{
	Stack<Integer> stack=new Stack<>();
	Node head;
	Node tail;
	int size;
	void addfirst(int data){
		Node num=new Node();
		num.data=data;
		num.next=null;
		if(size >= 1)
			this.tail.next=num;
		if(size == 0){
			this.head=num;
			this.tail=num;
			this.size++;
		}
		else{
			this.tail=num;
			this.size++;
		}
	}
	boolean check(){
		Node temp=this.head;
		while(temp!=null){
			stack.push(temp.data);
			temp=temp.next;
		}
		temp = this.head;
		while(temp!=null){
			if(temp.data != stack.pop())
				return false;
			temp=temp.next;
		}
		return true;
	}
	Node remove(int index){
		Node temp=this.head;
		for(int i=0;i<index;i++)
			temp=temp.next;
		return temp;
	}
	void removemid(int mid){
		Node np1=remove(mid-1);
		Node np2=remove(mid+1);
		np1.next=np2;
	}
	void display(){
		Node temp=this.head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		polindrome ll=new polindrome();
		int size1=obj.nextInt();
		for(int i=0;i<size1;i++)
			ll.addfirst(obj.nextInt());
		System.out.println(ll.check());
		ll.removemid(ll.size/2);
		ll.display();
	}
}