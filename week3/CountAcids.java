import sheffield.*;
import java.util.Scanner;


public class CountAcids{
	public static void main(String args[]){
		
		System.out.print("Enter string: ");
		Scanner sc = new Scanner(System.in); 
		String line = sc.nextLine();
		int ca = 0;
		int cc = 0;
		int ct = 0;
		int cg = 0;
		for(int i = 0; i < line.length(); i++){
			
			char a = line.charAt(i);
			if(a == 'A'){
				
				ca ++ ;
					
								
			}else if(a == 'C'){
				
				cc ++;
				
				
			}else if(a == 'T'){
				
				ct ++;
				
				
			}else if(a == 'G'){
				
				cg ++;
				
				
			}else{
				
				System.out.println("Please enter a valid DNA sequence.");
				return;
				
			}

		}
		if(line.length()>15){
			
			System.out.println("This sequence (" + line.length() +" acids) is too long.");
			
			
		}else{
			
			System.out.println("A: " + ca + ", C: " + cc + ", T: " + ct + ", G: " + cg);
			
		}

	}

}