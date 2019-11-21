public class Camera {

    private String name;
    private StockCode stock_code;
    private int condition;
    private double price;

    public Camera(){

        name = "null";
        price = 0.0;
        condition = 0;
        stock_code.setValue(null);

    }

    public Camera(String name,double price,int condition,StockCode stock_code){

        this.name = name;
        this.price = price;
        this.condition = condition;
        this.stock_code = stock_code;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StockCode getStock_code() {
        return stock_code;
    }

    public void setStock_code(StockCode stock_code) {
        this.stock_code = stock_code;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private boolean validCondition(int condition){

        boolean result;
        switch (condition){

            case 0:
            case 1:
            case 2:
            case 3:
                result = true;
                break;
            default:
                result = false;
                break;

        }
        return result;

    }

    private String getConditionString(int condition){

        String result;
        switch (condition){

            case 0:
                result = "as new";
                break;
            case 1:
                result = "some signs of use";
                break;
            case 2:
                result = "obvious signs of use";
                break;
            case 3:
                result = "no guarantee";
                break;
            default:
                result = "not a valid condition";
                break;

        }
        return result;


    }
    public String toString(){

        String attributes = "name: " + name + " price: " + price + " condition: " + condition + " stock code: " + stock_code.getValue();
        return attributes;

    }



}
