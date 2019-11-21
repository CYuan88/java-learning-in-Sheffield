import sheffield.*;

public class firstTest{
	public static void main(String args[]){
		
		EasyReader transaction = new EasyReader(args[0]);   //open the file according to the arguement on the command line
		String[] lines = new String[100];   				//create an array to save the data which is read from the file
		double balance = 0; 								//balance of the account
		int counter = 0;  									//create a counter
		double temp;										//create a double to save data for temporary
		final String a = "Salary";
		final String b = "Gift";
		
		String[][] form = new String[100][3];				//create an another array for keeping the data in a form;
		form[0][0] = "Transaction";
		form[0][1] = "Value";
		form[0][2] = "Balance";
		while(transaction.eof()!=true){
			
			lines[counter] = transaction.readString();
			//System.out.println(lines[counter]);
			
			//System.out.println(counter);
			if(counter % 2 == 1){
				
				if(lines[counter - 1].equals(a) || lines[counter - 1].equals(b)){
					
					temp = Double.parseDouble(lines[counter]);
					balance = balance + temp;
					//System.out.println(balance);
					form[(counter + 1)/2][0] = lines[counter - 1];
					form[(counter + 1)/2][1] = lines[counter];
					form[(counter + 1)/2][2] = ""+balance;
					//System.out.println(form[0][(counter + 1)/2]);
					//System.out.println(form[1][(counter + 1)/2]);
					//System.out.println(form[2][(counter + 1)/2]);
				
					
				}else{
					
					
					temp = Double.parseDouble(lines[counter]);
					balance = balance - temp;
					//System.out.println(balance);
					form[(counter + 1)/2][0] = lines[counter - 1];
					form[(counter + 1)/2][1] = "-"+lines[counter];
					form[(counter + 1)/2][2] = ""+balance;
					//System.out.println(form[0][(counter + 1)/2]);
					//System.out.println(form[1][(counter + 1)/2]);
					//System.out.println(form[2][(counter + 1)/2]);
					
					
				}
				
				
			}
			
			counter++;
			
			
		}
		for(int i = 0; i<(counter+1)/2 ; i++){
			
			for(int j = 0; j<3 ; j++){
				
				System.out.print(form[i][j] + " ");
				
			}
			
			System.out.print("\n");
			
		}
	
	
	
	
	}


}