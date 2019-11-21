import sheffield.*;

public class BalanceRecorder{
	public static void main(String args[]){
		//EasyReader transaction = new EasyReader("detailed transaction.txt");
		EasyReader transaction = new EasyReader(args[0]);
		String line;
		String[] lines = new String[100];
		double number;
		double balance = 0; //balance of the account
		int counter = 0;  //creat a counter
		while(transaction.eof()!=true){
			
			lines[counter] = transaction.readString();
			System.out.print(lines[counter]  + " ");
			counter++;
			System.out.println(counter);
			
			
		}
	
	
	
	
	}


}