import java.util.*;
class hashmap{
	static HashMap<String, Integer> hp = new HashMap<>();
	public static void main(String[] arg){
		hp.put("Mohanraj",2);
		hp.put("hariharasuthan",10);
		hp.put("Naveen",3);
		int a=hp.get("Naveen");
		System.out.println(a);
	}
}