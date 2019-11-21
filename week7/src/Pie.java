/**
 * @author Chuanyu Yuan
 *
 */

import sheffield.*;


public class Pie {

    private String name;
    private double price;
    private String[] ingredients = new String[30];

    public Pie(){

        name = null;
        price = 0.00;
        ingredients = null;

    }

    public Pie(String n,Double p,String[] ingredients){

        name = n;
        price = p;
        this.ingredients = ingredients;

    }

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

    public static void main(String[] args){

        /*
        String[] a = {"hehhee(v)","hehhee(v)"};
        String[] b = {"hehev)(adda","hehev)(adda"};
        String[] c = {"he(vv)he","he(vv)he"};
        String[] d = {"beef","soup"};
        String[] e = {"carrot(vv)","soup(v)"};

        Pie pie1 = new Pie("a",1.1,a);
        Pie pie2 = new Pie("b",1.1,b);
        Pie pie3 = new Pie("c",1.1,c);
        Pie pie4 = new Pie("d",1.1,d);
        Pie pie5 = new Pie("e",1.1,e);

        System.out.println(pie1.isVegetarian());
        System.out.println(pie2.isVegetarian());
        System.out.println(pie3.isVegetarian());

        System.out.println(pie1.isVegan());
        System.out.println(pie2.isVegan());
        System.out.println(pie3.isVegan());

        System.out.println(pie4.contains("soup"));
        System.out.println(pie5.contains("soup"));

         */
        String[] menuList = new String[1000];

        EasyReader menu = new EasyReader("pies.txt");
        while(menu.eof()==false){

            int counter = 0;
            String a = menu.readString();
            menuList[counter] = a;

        }
        for(int i =0;i<menuList.length;i++){

            System.out.println(menuList[i]);

        }





    }



}
