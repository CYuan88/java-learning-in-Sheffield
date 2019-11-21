import sheffield.*;

public class Pie {

    private String name;
    private double price;
    private String[] ingredients = new String[50];
    //Actually the length of the ingredients array is 50 is enough for most conditions

    /*
     Constructor with no parameters
     */
    public Pie(){

        name = "";
        price = 0.00;
        for(int i = 0;i<50;i++){

            ingredients[i] = "";

        }

    }

    /*
     Constructor with parameters
     */
    public Pie(String n,Double p,String[] ingredients){

        name = n;
        price = p;
        this.ingredients = ingredients;

    }

    /*
    Accessors and Mutators
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients[]) {
        this.ingredients = ingredients;
    }

    public boolean isVegetarian(){

        for(int i = 0; i < ingredients.length; i++){

            //Avoiding searching elements which are not assigned data
            if(ingredients[i].equals("")){

                break;

            }
            int a = ingredients[i].indexOf("(v)");
            int b = ingredients[i].indexOf("(vv)");
            if(a == -1 && b== -1){

                return false;

            }

        }

        return true;

    }

    public boolean isVegan(){

        for(int i = 0; i < ingredients.length; i++){


            if(ingredients[i].equals("")){

                break;

            }
            int a = ingredients[i].indexOf("(vv)");
            if(a == -1){

                return false;

            }

        }

        return true;


    }

    public boolean contains(String ingredient){

        for(int i = 0; i < ingredients.length; i++) {

            int a = ingredients[i].indexOf(ingredient);
            while(a != -1){

                return true;

            }

        }
        return false;

    }

    /*
    Method for creating objects in a loop
     */
    public static Pie[] addPie(Pie[] pies, Pie pieToAdd) {
        Pie[] newPies = new Pie[pies.length + 1];//array length
        System.arraycopy(pies, 0, newPies, 0, pies.length);//array copy
        newPies[newPies.length - 1] = pieToAdd;//new object array

        return newPies;
    }

    /*
    Method for generating a unclassified menu in a txt file
     */
    public static void generateMenu(Pie[] pies){

        EasyWriter file;
        try {

            file = new EasyWriter("pieMenu.txt");

        }catch (Exception e){

            e.printStackTrace();
            System.out.println("pieMenu.txt generation failed!");
            return;

        }

        for(int i = 0;i<pies.length;i++){

            file.println("name: "+pies[i].getName());
            file.println("price: "+pies[i].getPrice());
            String[] ingredients = pies[i].getIngredients();
            file.println("ingredients: ");
            for(int j = 0;j<ingredients.length;j++ ){

                if(!ingredients[j].equals("")){

                    file.println(ingredients[j]);

                }

            }
            file.println();

        }
        System.out.println("Generating pieMenu.txt successfully!");

    }

    /*
    Method for generating a classified menu with nice format in a html document
     */
    public static void generateMenuPlus(Pie[] pies){

        EasyWriter file;
        try {

            file = new EasyWriter("pieMenuPlus.html");

        }catch (Exception e){

            e.printStackTrace();
            System.out.println("pieMenuPlus.html generation failed!");
            return;

        }
        file.println("<!DOCTYPE html>");
        file.println("<html lang=\"en\">");
        file.println("<head>");
        file.println("<meta charset=\"UTF-8\">");
        file.println("<title>MENU</title>");
        file.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"menuStyle.css\">");
        file.println("</head>");
        file.println("<body>");
        file.println("<center>");
        file.println("<h1>PIE CAFE</h1>");
        file.println("<h5>@Live a healthy life!</h5>");
        file.println("<h4>VEGETARIAN</h4>");
        file.println("");

        for(int i = 0;i<pies.length;i++){

            if(pies[i].isVegetarian()){

                file.println("<span>"+pies[i].getName() + "&nbsp&nbsp&nbsp&nbsp</span>");
                file.println("<span>" +pies[i].getPrice()+ "</span>");
                String[] ingredients = pies[i].getIngredients();
                file.println("<br>");
                for(int j = 0;j<ingredients.length;j++ ){

                    if(!ingredients[j].equals("")){

                        file.println("<p>"+ingredients[j]+"</p>");

                    }

                }
                file.println("<br>");

            }

        }
        file.println("<h4>VEGAN</h4>");
        for(int i = 0;i<pies.length;i++){

            if(pies[i].isVegan()){

                file.println("<span>"+pies[i].getName() + "&nbsp&nbsp&nbsp&nbsp</span>");
                file.println("<span>" +pies[i].getPrice()+ "</span>");
                String[] ingredients = pies[i].getIngredients();
                file.println("<br>");
                for(int j = 0;j<ingredients.length;j++ ){

                    if(!ingredients[j].equals("")){

                        file.println("<p>"+ingredients[j]+"</p>");

                    }

                }
                file.println("<br>");

            }

        }
        file.println("<h4>MEAT</h4>");
        for(int i = 0;i<pies.length;i++){

            if(!pies[i].isVegetarian()){

                file.println("<span>"+pies[i].getName() + "&nbsp&nbsp&nbsp&nbsp</span>");
                file.println("<span>" +pies[i].getPrice()+ "</span>");
                String[] ingredients = pies[i].getIngredients();
                file.println("<br>");
                for(int j = 0;j<ingredients.length;j++ ){

                    if(!ingredients[j].equals("")){

                        file.println("<p>"+ingredients[j]+"</p>");

                    }

                }
                file.println("<br>");

            }

        }
        file.println("</center>");
        file.println("</body>");
        file.println("</html>");

        System.out.println("Generating pieMenuPlus.html successfully!");


    }





}
