import java.io.File;
import java.util.Scanner;

public class PieMenuGenerator {

    //an attribute of object array for saving Pie objects
    private static Pie[] pies = new Pie[0];

    public static Pie[] getPies() {
        return pies;
    }

    public static void setPies(Pie[] pies) {
        PieMenuGenerator.pies = pies;
    }

    public static void readMenuFromDoc(){

        //Array menuContent is for saving the data which is read from the file
        //Two-dimensional array menuContentPlus is for saving the Pie objects separately
        String[] menuContent = new String[1000];//In most conditions,the length is 1000 is enough
        String[][] menuContentPlus =new String[1000][100];
        int counter = 0;//counter for the loop and saving the length of data on the meantime
        int amount = 0;//counter for the loop and saving the number of objects on the meantime
        int[] arrayLength = new int[100]; //Recording the length of each Pie object, each line represents the length for each object
        for (int i = 0;i<arrayLength.length;i++){

            arrayLength[i] = 0;         //Initialize each element 0

        }

        //Saving the data form the file into the array
        try{

            File file = new File("pies.txt");
            Scanner fileSc = new Scanner(file);
            counter = 0;
            while(fileSc.hasNext()) {

                menuContent[counter] = fileSc.nextLine();
                //System.out.println(menuContent[counter]);
                counter++;

            }

        }catch (Exception e){

            e.printStackTrace();

        }
        //Using the two-dimensional array to save the Pie objects separately
        //Each line of the array represents one Pie object
        for (int i = 0; i < counter ; i++){

            menuContentPlus[arrayLength[amount]][amount] = menuContent[i];
            arrayLength[amount]++;
            //Finding a blank line means finding a new Pie object
            if(menuContent[i].equals("")){

                amount++;

            }

        }

        //According the two-dimensional array to create objects
        for(int i = 0;i<=amount;i++){

            int temp = 0;
            int temp2 = 0;//two temporary counters
            String name = menuContentPlus[temp+1][i];
            double price = Double.parseDouble(menuContentPlus[temp+3][i]);
            String[] ingredients = new String[50];
            for(int j = 0;j<50;j++){

                ingredients[j] = "";

            }
            for(int a = temp + 5;a<arrayLength[i];a++){

                ingredients[temp2] = menuContentPlus[a][i];
                temp2 ++;

            }
            Pie newPie = new Pie(name,price,ingredients);
            pies = Pie.addPie(pies,newPie);

        }
        if(pies.length != 0){

            System.out.println("Create Pie objects successfully!");

        }else{

            System.out.println("System error!");

        }


    }
    public static void main(String[] args){

        readMenuFromDoc();
        Pie.generateMenu(getPies());
        Pie.generateMenuPlus(getPies());

        //Testing the function contains()
        System.out.println(pies[0].contains("Beef Steak"));

    }



}
