import sheffield.*;
import java.util.Scanner;

public class OrderStrings{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		System.out.print("input the first string: \n");
		String first = sc.nextLine();
		System.out.print("input the second string: \n");
		String second = sc.nextLine();
		int result =  first.compareTo(second);
		String a;
		if(result > 0 ){
			
			
		}else{
			
			a = first;
			first = second;
			second = a;
			
		}
		System.out.println(first + " is larger and " + second + " is smaller");


	}

}
