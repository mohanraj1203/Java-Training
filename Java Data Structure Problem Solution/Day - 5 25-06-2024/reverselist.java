import java.util.*;
class Node{
	int data;
	Node next;
}
class reverselist{
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
	
	/*void reverse(){
		Node temp=this.head;
		while(temp!=null){
			stack.add(temp.data);
			temp=temp.next;
		}
		this.head=null;
		this.tail=null;
		int size1=this.size;
		this.size=0;
		while(!stack.isEmpty())
			addfirst(stack.pop());
	}*/
	
	void reverse(){
		Node temp=this.head;
		if(head==null)
			return;
		head=head.next;
		size--;
		reverse();
		addfirst(temp.data);
	}
	
	//Another Method
	
	void reverse(Node head1){
		if(head1==null){
			this.head=null;
			this.tail=null;
			this.size=0;
			return;
		}
		reverse(head1.next);
		addfirst(head1.data);
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
		reverselist ll=new reverselist();
		int size1=obj.nextInt();
		for(int i=0;i<size1;i++)
			ll.addfirst(obj.nextInt());
		
		System.out.println("Before : ");
		ll.display();
		System.out.println("\nAfter :");
		//ll.reverse();
		//ll.display();
		ll.reverse();
		ll.display();
		ll.reverse(ll.head);
		System.out.println("\nAfter :");
		ll.display();
	}
}	