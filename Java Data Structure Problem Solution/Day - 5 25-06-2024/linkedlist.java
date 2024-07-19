import java.util.*;
class Node{
	int data;
	Node next;
}
class linkedlist{
	
	Node head;
	Node tail;
	int size;
	public void addlast(int data){
		Node num=new Node();
		num.data=data;
		
		if(size >= 1){
			this.tail.next = num;
		}
		if(size == 0){
			this.head = num;
			this.tail = num;
			num.next = null;
			this.size++;
		}
		else{
			this.tail = num;
			num.next = null;
			this.size++;
		}
	}
	public void addfirst(int data){
		Node num=new Node();
		num.data = data;
		
		if(size >= 1){
			num.next = this.head;
		}
		if(size == 0){
			this.head = num;
			this.tail = num;
			this.size++;
		}
		else{
			this.head = num;
			this.size++;
		}
	}
	void display()
	{
		Node temp=this.head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	int getfist() throws Exception{
		if(this.size == 0)
			throw new Exception("List is Empty");
		return head.data;
	}
	int getlast() throws Exception{
		if(this.size == 0)
			throw new Exception("List is Empty");
		return tail.data;
	}
	int getIndex(int index) throws Exception{
		if(this.size == 0)
			throw new Exception("List is Empty");
		if(index < 0 || size <= index)
			throw new Exception("No Index");
		Node temp = this.head;
		for(int i=0;i<index;i++)
			temp = temp.next;
		return temp.data;
	}
	void removefisrt() throws Exception{
		this.head=head.next;
		this.size--;
	}
	void removelast() throws Exception{
		Node temp=this.head;
		while(temp.next.next!=null){
			temp=temp.next;
		}
		this.size--;
		this.tail=temp;
		this.tail.next=null;
	}
	
	Node getNode(int index) throws Exception{
		if(this.size == 0)
			throw new Exception("List is Empty");
		if(index < 0 || size <= index)
			throw new Exception("No Index");
		Node temp = this.head;
		for(int i=0;i<index;i++)
			temp = temp.next;
		return temp;
	}
	void removeAt(int index)throws Exception{
		if(this.size==0)
			throw new Exception("List is Empty");
		if(this.size == 1){
			this.head=null;
			this.tail=null;
			this.size=0;
		}
		Node np1=getNode(index-1);
		Node np2=getNode(index+1);
		np1.next=np2;
		this.size--;
	}
	public static void main(String[] str)throws Exception{
		Scanner obj=new Scanner(System.in);
		linkedlist ll=new linkedlist();
		int size=obj.nextInt();
		for(int i=0;i<size;i++)
			ll.addfirst(obj.nextInt());
		System.out.println("Add First : ");
		ll.display();
		size=obj.nextInt();
		for(int i=0;i<size;i++)
			ll.addlast(obj.nextInt());
		System.out.println("Add Last : ");
		ll.display();
		System.out.println("get First : ");
		try{
			System.out.println(ll.getfist());
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("get Last : ");
		try{
			System.out.println(ll.getlast());
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("get Index : ");
		try{
			System.out.println(ll.getIndex(obj.nextInt()));
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("***********************");
		System.out.println("Remove First : ");
		ll.removefisrt();
		ll.display();
		System.out.println("\nRemove Last : ");
		ll.removelast();
		System.out.println();
		ll.display();
		System.out.println("Remove At : ");
		ll.removeAt(obj.nextInt());
		ll.display();
	}
}	