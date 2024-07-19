import java.util.*;
public class sumoflist{
  Node1 head1;
  Node1 tail1;
  Node2 head2;
  Node2 tail2;
  Node3 head3;
  Node3 tail3;
  int size1;
  int size2;
  int size3;
  void addlast1(int data1){
    Node1 num=new Node1();
    num.data1=data1;
    num.next1=null;
    if(this.size1 >= 1)
      this.tail1.next1=num;
    if(this.size1 == 0){
      this.head1=num;
      this.tail1=num;
      this.size1++;
    }else{
      this.tail1=num;
      this.size1++;
    }
  }
  void addlast2(int data2){
    Node2 num=new Node2();
    num.data2=data2;
    num.next2=null;
    if(this.size2 >= 1)
      this.tail2.next2=num;
    if(this.size2 == 0){
      this.head2=num;
      this.tail2=num;
      this.size2++;
    }else{
      this.tail2=num;
      this.size2++;
    }
  }
  void addlast3(int data3){
    Node3 num=new Node3();
    num.data3=data3;
    num.next3=null;
    if(this.size3 >= 1)
      this.tail3.next3=num;
    if(this.size3 == 0){
      this.head3=num;
      this.tail3=num;
      this.size3++;
    }else{
      this.tail3=num;
      this.size3++;
    }
  }
  void sumlist(){
    Stack<Integer> arr1=new Stack<>();
    Stack<Integer> arr2=new Stack<>();
    int sum1=0;
    int sum2=0;
    while(this.head1!=null){
      arr1.push(head1.data1);
      head1=head1.next1;
    }
    while(this.head2!=null){
      arr2.push(head2.data2);
      head2=head2.next2;
    }
    while(!arr1.isEmpty())
      sum1=sum1*10+arr1.pop();
    while(!arr2.isEmpty())
      sum2=sum2*10+arr2.pop();
    int tsum=sum1+sum2;
	System.out.println(tsum+" "+sum1+" "+sum2);
    while(tsum !=0){
      addlast3(tsum%10);
      tsum=tsum/10;
    }
  }
  void display(){
    Node3 temp=this.head3;
    while(temp!=null){
      System.out.print(temp.data3+" ");
      temp=temp.next3;
    }
  }
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    String[] str1=obj.nextLine().split(" ");
    String[] str2=obj.nextLine().split(" ");
    sumoflist ll=new sumoflist();
    for(int i=0;i<str1.length;i++)
      ll.addlast1(Integer.parseInt(str1[i]));
    for(int i=0;i<str2.length;i++)
      ll.addlast2(Integer.parseInt(str2[i]));
    ll.sumlist();
    ll.display();
  }
}
class Node1{
  int data1;
  Node1 next1;
}
class Node2{
  int data2;
  Node2 next2;
}
class Node3{
  int data3;
  Node3 next3;
}