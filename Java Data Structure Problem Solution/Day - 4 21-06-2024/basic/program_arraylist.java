import java.util.*;
class program_arraylist{
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		
		int size=obj.nextInt();
		
		for(int i=0;i<size;i++){
			int temp=obj.nextInt();
			list.add(temp);
		}
		
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
		System.out.println();
		System.out.println(list.remove(3));
		
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
		
		list.set(0,10);
			System.out.println();
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
		
		System.out.println(list.contains(3));
	}
}
		