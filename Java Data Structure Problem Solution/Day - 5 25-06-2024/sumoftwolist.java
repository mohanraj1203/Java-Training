import java.util.*;
class Node1{
	int data1;
	Node1 next1;
	Node1(int data1){
		this.data1=data1;
		this.next1=null;
	}
}
class Node2{
	int data2;
	Node2 next2;
	Node2(int data2){
		this.data2=data2;
		this.next2=null;
	}
}
class sumoftwolist{
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		Node1 head1=new Node1(2);
		Node1 f1=new Node1(4);
		Node1 s1=new Node1(3);
		
		Node2 head2=new Node2(5);
		Node2 f2=new Node2(6);
		Node2 s2=new Node2(4);
		
		head1.next1=f1;
		f1.next1=s1;
		
		head2.next2=f2;
		f2.next2=s2;
		
		int sum1=0;
		int sum2=0;
		
		Node1 temp1=head1;
		while(temp1!=null)
		{
			sum1=sum1*10+temp1.data1;
			temp1=temp1.next1;
		}
		System.out.println(sum1);
		Node2 temp2=head2;
		while(temp2!=null)
		{
			sum2=sum2*10+temp2.data2;
			temp2=temp2.next2;
		}
		System.out.println(sum2);
		System.out.println(sum1+sum2);
	}
}