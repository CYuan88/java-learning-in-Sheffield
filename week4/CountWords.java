import java.util.*;
import sheffield.*;

public class CountWords{
	
	public static void main(String args[]){
		
		EasyReader file = new EasyReader("news.txt");
		
		//creat a hashtable
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		
		while(!file.eof()){
			
			String s = file.readString();
			
            String[] s1 = s.split("\\s+");
			
			for(int i = 0 ; i< s1.length ; i++){
				
				int counter = 1;
				if(ht.containsKey(s1[i])){
					
					ht.put(s1[i], new Integer(ht.get(s1[i]) + 1));
					
				}else{
					
					ht.put(s1[i], new Integer(1));
					
				}
				
				
				
			}
            
			
			
			
		}
		// display all numbers stored in the hashtable
		System.out.println();
		System.out.println("There are following " + ht.size() +
				   " numbers in the hashtable:");
		for (Enumeration<String> e = ht.keys(); e.hasMoreElements(); ) {
			String w = e.nextElement();
			Integer n = (Integer)ht.get(w);
			System.out.println("  " + w + "  (" + n + ")");
		}
			
		
	}
	
	
}