import java.util.*;

public class TestList{

	public static void main(String[] args){
		
		List<String> list = new ArrayList<>();
		Collections.addAll(list,"hehe","hehe","hehee","ejkak");
		System.out.println("list:"+list);
		
		Set<String> set = new HashSet<>(list);
		System.out.println("set:"+set);
		
		list.clear();
		list.addAll(set);
		System.out.println("list:"+list);

		
	}

}