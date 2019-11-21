import sheffield.EasyReader;

import sheffield.EasyWriter;

/**

 * @author Yao Yunchog

 * @create 2019-10-16-14:38

 */

// Assignment1

// UTF-8

    public class Assignment1Yao {

        public static void main(String[] args) {

            EasyReader keyboard = new EasyReader();

            String filename = keyboard.readString("Please enter the input file's name");

            //open the file

            //to test, enter "example-accounts.txt"

            EasyReader fileinput = new EasyReader(filename);

            //output to a file

            EasyWriter fileoutput =new EasyWriter("accountsYao.txt");

            //output to console

            EasyWriter consoleoutput = new EasyWriter();

            //Create balance

            double balance = 0;

            //output the title to the file and console(there are 10 spaces between titles)

            fileoutput.print("transaction"+"          ");

            fileoutput.print("Value"+"          ");

            fileoutput.println("balance");

            consoleoutput.print("transaction"+"          ");

            consoleoutput.print("Value"+"          ");

            consoleoutput.println("balance");

            //define the length between columns

            //11:length of "transaction" 5:length of"Value" 7:length of "balance")

            int firstlength = 11 + 10 + 5;

            int secondlength = 10 + 7;

            //check whether reaching the end of input file

            while(!fileinput.eof()) {

                //read a pair of data

                String str = fileinput.readString();

                double dou = fileinput.readDouble();

                //check whether the balance is added or reduced

                //str is possible to be null so it is put in the behind part

                //salary and gift will add the balance while others will reduce it

                if ("Salary".equals(str) || "Gift".equals(str)) {

                    balance += dou;

                //the question does not say whether balance can be less than 0

                //so make the assupmtion that balance can be less than 0

                } else {

                    balance -= dou;

                }

                //output the data neatly to the file and console

                //for neat format, do not use notepad to open the outputfile

                //Keep two decimals

                fileoutput.print(str);

                fileoutput.print(dou, 2, firstlength - str.length());

                fileoutput.println(balance, 2, secondlength);

                consoleoutput.print(str);

                consoleoutput.print(dou, 2, firstlength - str.length());

                consoleoutput.println(balance, 2, secondlength);

                //after running, "Error in EasyReader" will occur beacuse it reaches end

                //but it does not hinder the successful operation of program

            }

        }

}

