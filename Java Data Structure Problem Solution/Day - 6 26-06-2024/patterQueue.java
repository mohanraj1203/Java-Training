import java.util.*;
class patterQueue{
	static Queue<Integer> queue1=new LinkedList<>();
	
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int size=obj.nextInt();
		int[] arr=new int[size];
		/*for(int i=0;i<size;i++)
			arr[i]=obj.nextInt();
		int i=0,j=size/2;
		for(;i<size/2 && j<size;i++,j++){
			queue1.add(arr[i]);
			queue1.add(arr[j]);
		}
		System.out.println(queue1);*/
		
		for(int i=0;i<size;i++)
			queue1.add(obj.nextInt());
		int mid=size/2;
		Queue<Integer> temp=new LinkedList<>();
		for(int i=0;i<mid;i++)
			temp.add(queue1.remove());
		while(!temp.isEmpty()){
			queue1.add(temp.remove());
			queue1.add(queue1.remove());
		}
		if(size%2==1)
			queue1.add(queue1.remove());
		System.out.println(queue1);
	}
}