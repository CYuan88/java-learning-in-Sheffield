import sheffield.*;

public class BalanceRecorder{
	public static void main(String args[]){


		System.out.println("Please input the file name");
		EasyReader transaction = new EasyReader(args[0]);   //Open the file according to the arguement on the command line


		String[] lines = new String[100];   				//Save the data read from the file
		double balance = 0; 								//Account balance
		int counter = 0;  									//A counter
		double temp;										//Save data for temporary
		final String a = "Salary";							//Statements about the two special words
		final String b = "Gift";
		
		String[][] form = new String[100][3];				//Create an another array for keeping the data in a form;
		form[0][0] = "Transaction             ";				//length = 24     Longer gap than the form showed on the mole, this is for large figures
		form[0][1] = "Value       ";							//length = 12
		form[0][2] = "Balance     ";							//length = 12
		while(transaction.eof()!=true){							//Read strings to the end of the file
			
			lines[counter] = transaction.readString();
			//System.out.println(lines[counter]);
			
			//System.out.println(counter);
			if(counter % 2 == 1){								//Distinguish transaction details and numbers 
				
				if(lines[counter - 1].equals(a) || lines[counter - 1].equals(b)){          //Distinguish between positive and negative
					
					temp = Double.parseDouble(lines[counter]);
					balance = balance + temp;
					//System.out.println(balance);
					form[(counter + 1)/2][0] = lines[counter - 1];
					form[(counter + 1)/2][1] = lines[counter];
					form[(counter + 1)/2][2] = ""+balance;
			
					
				}else{
					
					
					temp = Double.parseDouble(lines[counter]);
					balance = balance - temp;
					//System.out.println(balance);
					form[(counter + 1)/2][0] = lines[counter - 1];
					form[(counter + 1)/2][1] = "-"+lines[counter];
					form[(counter + 1)/2][2] = ""+balance;

					
				}
				
				
			}
			
			counter++;
			
			
		}
		System.out.print(form[0][0]);				//Print the titles
		System.out.print(form[0][1]);
		System.out.println(form[0][2]);
		
		for(int i = 1; i<(counter+1)/2 ; i++){
			
			
			
			//Print the array in format, but it won't keep in this format when put in very large figures
			System.out.printf("%-20s",form[i][0]);                        
			System.out.printf("%9.2f",Double.parseDouble(form[i][1]));		//Two decimal places
			System.out.printf("%14.2f",Double.parseDouble(form[i][2]));
			
			System.out.print("\n");
			
		}
	
	
	
	
	}


}