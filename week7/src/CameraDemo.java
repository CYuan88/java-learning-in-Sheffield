public class CameraDemo {

    public static void main(String[] args){

        Camera a = new Camera();
        //System.out.println(a.validCondition(4));
        //System.out.println(a.getConditionString(3));
        System.out.println(a.toString());
        StockCode b = new StockCode("AAA-0-1234");
        System.out.println(b.isValid());


    }

}
